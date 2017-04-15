package com.hasib.app;

import java.awt.BorderLayout;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class AdvanceSearchPanel extends javax.swing.JPanel {

    StudentFilter obStudentFilter;
    ResultFilter obResultFilter;

    public AdvanceSearchPanel() {
        initComponents();

        changingPanel.setLayout(new BorderLayout());
        changingPanel.add(obStudentFilter, BorderLayout.CENTER);
        changingPanel.setOpaque(false);
        bgImage(this);
    }

    void change_look(String feel_and_look) {
        looks = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(feel_and_look);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();
    }
    private UIManager.LookAndFeelInfo looks[];
    Image bgi;

    void bgImage(javax.swing.JPanel p) {
        bgi = Toolkit.getDefaultToolkit().getImage("img\\search_bg.gif");
        MediaTracker mt = new MediaTracker(p);
        mt.addImage(bgi, 0);
        try {
            mt.waitForAll();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bgi, -30, 20, null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        obStudentFilter = new StudentFilter();
        obResultFilter = new ResultFilter();

        but_studentprofile = new javax.swing.JButton();
        but_resultfilter = new javax.swing.JButton();
        changingPanel = new javax.swing.JPanel();

        changingPanel.setPreferredSize(new java.awt.Dimension(173, 242));

        javax.swing.GroupLayout changingPanelLayout = new javax.swing.GroupLayout(changingPanel);
        changingPanel.setLayout(changingPanelLayout);
        changingPanelLayout.setHorizontalGroup(
                changingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 173, Short.MAX_VALUE));
        changingPanelLayout.setVerticalGroup(
                changingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 268, Short.MAX_VALUE));

        but_studentprofile.setText("Student Profile");
        but_resultfilter.setText("Result Filter");
        but_studentprofile.setBackground(java.awt.Color.WHITE);
        but_resultfilter.setBackground(java.awt.Color.WHITE);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(but_studentprofile, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE).addComponent(but_resultfilter, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE).addComponent(changingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(but_studentprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(1, 1, 1).addComponent(but_resultfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(changingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)));

        //*************************************************
        but_resultfilter.setBackground(java.awt.Color.WHITE);              //## 
        but_resultfilter.setForeground(new java.awt.Color(0, 153, 255));   //##
        but_studentprofile.setBackground(new java.awt.Color(0, 153, 255)); //##
        but_studentprofile.setForeground(java.awt.Color.WHITE);
    }

    public javax.swing.JPanel getpanel() {
        return this;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton but_resultfilter;
    public javax.swing.JButton but_studentprofile;
    public javax.swing.JPanel changingPanel;
    // End of variables declaration//GEN-END:variables
}
