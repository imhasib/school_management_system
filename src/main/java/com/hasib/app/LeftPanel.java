package com.hasib.app;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LeftPanel {

    TreePanel obTreePanel;
    AdvanceSearchPanel obAdvanceSearchPanel;

    LeftPanel() {
        initComponent();
    }

    void change_look(String feel_and_look) {
        looks = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(feel_and_look);
            SwingUtilities.updateComponentTreeUI(buttonsPanel);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();
    }
    private UIManager.LookAndFeelInfo looks[];

    void initComponent() {
        obTreePanel = new TreePanel();
        obAdvanceSearchPanel = new AdvanceSearchPanel();

        leftPanel = new javax.swing.JPanel();
        leftPanel.setLayout(new BorderLayout());
        getButtonsPanel();
        leftPanel.add(buttonsPanel, BorderLayout.NORTH);
        leftPanel.add(obTreePanel.getPanel(), BorderLayout.CENTER);
        leftPanel.add(obAdvanceSearchPanel, BorderLayout.SOUTH);
    }

    void getButtonsPanel() {
        buttonsPanel = new javax.swing.JPanel();
        but_student = new javax.swing.JButton();
        but_teacher = new javax.swing.JButton();
        but_operator = new javax.swing.JButton();

        //*****************************************
        //obTreePanel.jTree1.setOpaque(false);
        //*******************************************

        buttonsPanel.setBackground(new java.awt.Color(255, 255, 255));

        but_operator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        but_operator.setText("  Operatopr");
        but_operator.setBorder(null);
        but_operator.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        but_teacher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        but_teacher.setText("  Teacher");
        but_teacher.setBorder(null);
        but_teacher.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        but_student.setBackground(new java.awt.Color(255, 255, 255));
        but_student.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        but_student.setForeground(new java.awt.Color(0, 153, 255));
        but_student.setText("  Students");
        but_student.setBorder(null);
        but_student.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
                buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup().addContainerGap(23, Short.MAX_VALUE).addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(but_teacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(but_operator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(but_student, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))));
        buttonsPanelLayout.setVerticalGroup(
                buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(but_student, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_operator, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));
        //****************************************************
        but_teacher.setBackground(java.awt.Color.WHITE);              //## 
        but_teacher.setForeground(new java.awt.Color(0, 153, 255));   //##
        but_operator.setBackground(java.awt.Color.WHITE);              //##
        but_operator.setForeground(new java.awt.Color(0, 153, 255));
        but_student.setBackground(new java.awt.Color(0, 153, 255)); //##
        but_student.setForeground(java.awt.Color.WHITE);
    }

    javax.swing.JPanel getPanel() {
        return leftPanel;
    }
    // Variables declaration - do not modify
    public javax.swing.JButton but_operator;
    public javax.swing.JButton but_student;
    public javax.swing.JButton but_teacher;
    private javax.swing.JPanel buttonsPanel;
    public javax.swing.JPanel leftPanel;
    // End of variables declaration
}
