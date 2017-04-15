package com.hasib.app;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class OperatorPanel {

    public OperatorPanel() {
        initComponents();
    }

    void change_look(String feel_and_look) {
        looks = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(feel_and_look);
            SwingUtilities.updateComponentTreeUI(Operator);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();
    }
    private UIManager.LookAndFeelInfo looks[];

    @SuppressWarnings("unchecked")
    private void initComponents() {

        Operator = new javax.swing.JPanel();
        Operator_Tab_Pane = new javax.swing.JTabbedPane();
        Operator_info_panel = new javax.swing.JPanel();
        Add_Operator_Panel = new javax.swing.JPanel();

        //Operator.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout Operator_info_panelLayout = new javax.swing.GroupLayout(Operator_info_panel);
        Operator_info_panel.setLayout(Operator_info_panelLayout);
        Operator_info_panelLayout.setHorizontalGroup(
                Operator_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 910, Short.MAX_VALUE));
        Operator_info_panelLayout.setVerticalGroup(
                Operator_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 683, Short.MAX_VALUE));

        Operator_Tab_Pane.addTab("Information", Operator_info_panel);

        javax.swing.GroupLayout Add_Operator_PanelLayout = new javax.swing.GroupLayout(Add_Operator_Panel);
        Add_Operator_Panel.setLayout(Add_Operator_PanelLayout);
        Add_Operator_PanelLayout.setHorizontalGroup(
                Add_Operator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 910, Short.MAX_VALUE));
        Add_Operator_PanelLayout.setVerticalGroup(
                Add_Operator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 683, Short.MAX_VALUE));

        Operator_Tab_Pane.addTab("Add Operator", Add_Operator_Panel);

        javax.swing.GroupLayout OperatorLayout = new javax.swing.GroupLayout(Operator);
        Operator.setLayout(OperatorLayout);
        OperatorLayout.setHorizontalGroup(
                OperatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Operator_Tab_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE));
        OperatorLayout.setVerticalGroup(
                OperatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Operator_Tab_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE));
    }

    javax.swing.JPanel getPanel() {
        return Operator;
    }
    private javax.swing.JPanel Add_Operator_Panel;
    private javax.swing.JPanel Operator;
    private javax.swing.JTabbedPane Operator_Tab_Pane;
    private javax.swing.JPanel Operator_info_panel;
}
