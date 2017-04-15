package com.hasib.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.RepaintManager;
import javax.swing.border.MatteBorder;

public class preview {

    Printable target;
    private int pageWidth;
    private int pageHeight;
    final JPanel panel;
    JScrollPane scroll;
    PageFormat format;

    preview(JPanel pan) {
        this.panel = pan;

        //Making the panel printable
        target = new Printable() {

            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return (NO_SUCH_PAGE);
                } else {
                    Graphics2D g2d = (Graphics2D) graphics;
                    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                    panel.paint(g2d);


                    return (PAGE_EXISTS);
                }
            }
        };
        try {
            // Use default printer, no dialog
            PrinterJob prnJob = PrinterJob.getPrinterJob();
            prnJob.setPrintable(target);

            if (prnJob.printDialog()) {
                prnJob.print();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}


