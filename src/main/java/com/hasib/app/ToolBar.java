package com.hasib.app;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.ImageIcon;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class ToolBar// extends javax.swing.JFrame 
{

    ImageIcon logOut, addStudent, undo, redo, save, find, result, help, config, calculator, printer, prfrmncGraph, notice;

    /** Creates new form ToolBar */
    public ToolBar() {
        initComponents();
    }

    void change_look(String feel_and_look) {
        looks = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(feel_and_look);
            SwingUtilities.updateComponentTreeUI(jToolBar1);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();
    }
    private UIManager.LookAndFeelInfo looks[];

    @SuppressWarnings("unchecked")
    public void initComponents() {

        calculator = new ImageIcon("img\\calculator.gif");
        logOut = new ImageIcon("img\\logOut.gif");
        config = new ImageIcon("img\\config.gif");
        help = new ImageIcon("img\\help.gif");
        result = new ImageIcon("img\\result.gif");
        find = new ImageIcon("img\\find.gif");
        save = new ImageIcon("img\\save.gif");
        redo = new ImageIcon("img\\redo.gif");
        undo = new ImageIcon("img\\undo.gif");
        addStudent = new ImageIcon("img\\but_addStudent1.gif");
        printer = new ImageIcon("img\\printer.gif");
        prfrmncGraph = new ImageIcon("img\\prfrmncGraph.gif");
        notice = new ImageIcon("img\\notice.gif");

        jToolBar1 = new javax.swing.JToolBar();
        tbb_undo = new javax.swing.JButton();
        tbb_undo.setToolTipText("Undo");
        tbb_undo.setIcon(undo);
        tbb_addStudent = new javax.swing.JButton();
        tbb_addStudent.setToolTipText("addStudent");
        tbb_addStudent.setIcon(addStudent);
        tbb_find = new javax.swing.JButton();
        tbb_find.setToolTipText("Fine");
        tbb_find.setIcon(find);
        jTextField1 = new javax.swing.JTextField();
        tbb_findTF = new javax.swing.JTextField();
        tbb_result = new javax.swing.JButton();
        tbb_result.setToolTipText("result");
        tbb_result.setIcon(result);
//        tbb_prfrmncGraph = new javax.swing.JButton();
//        tbb_prfrmncGraph.setToolTipText("Performance Graph of Student");
//        tbb_prfrmncGraph.setIcon(prfrmncGraph);
        tbb_logOut = new javax.swing.JButton();
        tbb_logOut.setToolTipText("Log out");
        tbb_logOut.setIcon(logOut);
//        tbb_config = new javax.swing.JButton();
//        tbb_config.setToolTipText("Configure");
//        tbb_config.setIcon(config);
        tbb_help = new javax.swing.JButton();
        tbb_help.setToolTipText("Help");
        tbb_help.setIcon(help);
        tbb_print = new javax.swing.JButton();
        tbb_print.setToolTipText("Print");
        tbb_print.setIcon(printer);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        tbb_undo.setFocusable(false);
        tbb_undo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbb_undo.setMaximumSize(new java.awt.Dimension(35, 35));
        tbb_undo.setName("tbb_undo"); // NOI18N
        tbb_undo.setPreferredSize(new java.awt.Dimension(35, 35));
        tbb_undo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tbb_undo);
        jToolBar1.addSeparator();

        tbb_addStudent.setFocusable(false);
        tbb_addStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbb_addStudent.setMaximumSize(new java.awt.Dimension(35, 35));
        tbb_addStudent.setName("tbb_addStudent"); // NOI18N
        tbb_addStudent.setPreferredSize(new java.awt.Dimension(35, 35));
        tbb_addStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tbb_addStudent);
        jToolBar1.addSeparator();
        jToolBar1.addSeparator();

        tbb_find.setFocusable(false);
        tbb_find.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbb_find.setMaximumSize(new java.awt.Dimension(25, 35));
        tbb_find.setName("tbb_find"); // NOI18N
        tbb_find.setPreferredSize(new java.awt.Dimension(35, 35));
        tbb_find.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tbb_find);

        jTextField1.setMaximumSize(new java.awt.Dimension(1, 10));
        jTextField1.setName("jTextField1"); // NOI18N
        jToolBar1.add(jTextField1);
        jTextField1.setText("Hello");
        jTextField1.setEditable(false);
        jTextField1.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent fle) {
                jTextField1.setText("");
                jTextField1.setFont(new java.awt.Font(null, 1, 12));
                jTextField1.setForeground(new Color(0, 0, 0));
            }

            public void focusLost(FocusEvent fle) {
                jTextField1.setText(jTextField1.getText());

            }
        });

        tbb_findTF.setMaximumSize(new java.awt.Dimension(150, 20));
        tbb_findTF.setName("tbb_findTF"); // NOI18N
        jToolBar1.add(tbb_findTF);
        tbb_findTF.setText("Find");
        tbb_findTF.setForeground(Color.GRAY);
        tbb_findTF.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent fle) {
                // if(g==1){
                // g++;
                tbb_findTF.setText("");
                //}
                tbb_findTF.setFont(new java.awt.Font(null, 1, 12));
                tbb_findTF.setForeground(new Color(0, 0, 0));
            }

            public void focusLost(FocusEvent fle) {
                //g++;
                tbb_findTF.setText(tbb_findTF.getText());

            }
        });

        tbb_result.setFocusable(false);
        tbb_result.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbb_result.setMaximumSize(new java.awt.Dimension(35, 35));
        tbb_result.setName("tbb_result"); // NOI18N
        tbb_result.setPreferredSize(new java.awt.Dimension(35, 35));
        tbb_result.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tbb_result);
        jToolBar1.addSeparator();

//        tbb_prfrmncGraph.setFocusable(false);
//        tbb_prfrmncGraph.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        tbb_prfrmncGraph.setMaximumSize(new java.awt.Dimension(35, 35));
//        tbb_prfrmncGraph.setName("tbb_prfrmncGraph"); // NOI18N
//        tbb_prfrmncGraph.setPreferredSize(new java.awt.Dimension(35, 35));
//        tbb_prfrmncGraph.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
//        jToolBar1.add(tbb_prfrmncGraph);
//        jToolBar1.addSeparator();

        tbb_logOut.setFocusable(false);
        tbb_logOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbb_logOut.setMaximumSize(new java.awt.Dimension(35, 35));
        tbb_logOut.setName("tbb_logOut"); // NOI18N
        tbb_logOut.setPreferredSize(new java.awt.Dimension(35, 35));
        tbb_logOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tbb_logOut);
        jToolBar1.addSeparator();

//        tbb_config.setFocusable(false);
//        tbb_config.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//        tbb_config.setMaximumSize(new java.awt.Dimension(35, 35));
//        tbb_config.setName("tbb_config"); // NOI18N
//        tbb_config.setPreferredSize(new java.awt.Dimension(35, 35));
//        tbb_config.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
//        jToolBar1.add(tbb_config);
//        jToolBar1.addSeparator();

        tbb_print.setFocusable(false);
        tbb_print.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbb_print.setMaximumSize(new java.awt.Dimension(35, 35));
        tbb_print.setName("tbb_print"); // NOI18N
        tbb_print.setPreferredSize(new java.awt.Dimension(35, 35));
        tbb_print.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tbb_print);
        jToolBar1.addSeparator();

        tbb_help.setFocusable(false);
        tbb_help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbb_help.setMaximumSize(new java.awt.Dimension(35, 35));
        tbb_help.setName("tbb_help"); // NOI18N
        tbb_help.setPreferredSize(new java.awt.Dimension(35, 35));
        tbb_help.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tbb_help);
        jToolBar1.addSeparator();
    }

    javax.swing.JToolBar getToolBar() {
        return jToolBar1;
    }
    // Variables declaration - do not modify
    public javax.swing.JTextField jTextField1;
    public javax.swing.JToolBar jToolBar1;
    public javax.swing.JButton tbb_addStudent;
//    public javax.swing.JButton tbb_calculator;
//    public javax.swing.JButton tbb_config;
    public javax.swing.JButton tbb_find;
    public javax.swing.JTextField tbb_findTF;
    public javax.swing.JButton tbb_help;
    public javax.swing.JButton tbb_logOut;
//    public javax.swing.JButton tbb_notice;
//    public javax.swing.JButton tbb_prfrmncGraph;
//    public javax.swing.JButton tbb_redo;
    public javax.swing.JButton tbb_result;
//    public javax.swing.JButton tbb_save;
    public javax.swing.JButton tbb_undo;
    public javax.swing.JButton tbb_print;
    // End of variables declaration
}
