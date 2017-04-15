package com.hasib.app;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class TeacherPanel {

    public TeacherPanel() {
        initComponents();
    }

    void change_look(String feel_and_look) {
        looks = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(feel_and_look);
            SwingUtilities.updateComponentTreeUI(teacher);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();
    }
    private UIManager.LookAndFeelInfo looks[];

    @SuppressWarnings("unchecked")
    private void initComponents() {

        teacher = new javax.swing.JPanel();
        teacher_Tab_Pane = new javax.swing.JTabbedPane();
        teacher_info_panel = new javax.swing.JPanel();
        add_Teqacher_Panel = new javax.swing.JPanel();
        //teacher.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout Teacher_info_panelLayout = new javax.swing.GroupLayout(teacher_info_panel);
        teacher_info_panel.setLayout(Teacher_info_panelLayout);
        Teacher_info_panelLayout.setHorizontalGroup(
                Teacher_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 910, Short.MAX_VALUE));
        Teacher_info_panelLayout.setVerticalGroup(
                Teacher_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 683, Short.MAX_VALUE));

        teacher_Tab_Pane.addTab("Information", teacher_info_panel);

        javax.swing.GroupLayout Add_Teqacher_PanelLayout = new javax.swing.GroupLayout(add_Teqacher_Panel);
        add_Teqacher_Panel.setLayout(Add_Teqacher_PanelLayout);
        Add_Teqacher_PanelLayout.setHorizontalGroup(
                Add_Teqacher_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 910, Short.MAX_VALUE));
        Add_Teqacher_PanelLayout.setVerticalGroup(
                Add_Teqacher_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 683, Short.MAX_VALUE));

        teacher_Tab_Pane.addTab("Add Teacher", add_Teqacher_Panel);

        javax.swing.GroupLayout TeacherLayout = new javax.swing.GroupLayout(teacher);
        teacher.setLayout(TeacherLayout);
        TeacherLayout.setHorizontalGroup(
                TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(teacher_Tab_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE));
        TeacherLayout.setVerticalGroup(
                TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(teacher_Tab_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE));
    }

    javax.swing.JPanel getPanel() {
        return teacher;
    }
    private javax.swing.JPanel add_Teqacher_Panel;
    private javax.swing.JPanel teacher;
    private javax.swing.JTabbedPane teacher_Tab_Pane;
    private javax.swing.JPanel teacher_info_panel;
}
