package com.hasib.app;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import javax.swing.*;
import java.awt.*;

public class StudentPanel {
//******************************************************************

    InputResultForm obInputResultForm;
    Profiles obProfiles;
//********************************************************************

    public StudentPanel() throws java.sql.SQLException {
        initComponents();
    }

    void change_look(String feel_and_look) {
        looks = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(feel_and_look);
            SwingUtilities.updateComponentTreeUI(Student);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();
    }
    private UIManager.LookAndFeelInfo looks[];

    @SuppressWarnings("unchecked")
    private void initComponents() throws java.sql.SQLException {
        obInputResultForm = new InputResultForm();

        Student = new JPanel();
        jTabbedPane1 = new JTabbedPane();
        jPanel6 = new JPanel();
        jPanel7 = new JPanel();
        jPanel8 = new JPanel();
        editingPanel = new JPanel();
        showingPanel = new JPanel();
        showformPanel = new JPanel();
        searchingPanel = new JPanel();
//**************************************************************
        obProfiles = new Profiles();
//**************************************************************
        jTabbedPane1.setBackground(Color.WHITE);
        jPanel7.setLayout(new BorderLayout());
        jPanel7.add(obProfiles);
        jTabbedPane1.addTab("Information", jPanel7);


        jPanel6.setLayout(new BorderLayout());
        jPanel6.add(obInputResultForm.getPanel());
        jTabbedPane1.addTab("Result", new JScrollPane(jPanel6));

        jPanel8.setLayout(new BorderLayout());
        jPanel8.setBackground(Color.WHITE);
        //jPanel8.add(new JScrollPane(searchingPanel),BorderLayout.CENTER);
        jTabbedPane1.addTab("Search Result", jPanel8);

        /*		jPanel8.setLayout(new BorderLayout());
        jPanel8.add(new JScrollPane(obRegform.getPanel()));
        jTabbedPane1.addTab("Add Student", jPanel8);

        showformPanel.setLayout(new BorderLayout());
        showingPanel=ps;
        showformPanel.add(new JScrollPane(obShowform.getPanel()));
        jTabbedPane1.addTab("Showform",showformPanel);

        //searchingPanel.setLayout(new FlowLayout());

         */
        Student.setBackground(Color.WHITE);
        GroupLayout StudentLayout = new GroupLayout(Student);
        Student.setLayout(StudentLayout);
        StudentLayout.setHorizontalGroup(
                StudentLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE));
        StudentLayout.setVerticalGroup(
                StudentLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE));
    }

    JPanel getPanel() {
        return Student;
    }
    private JPanel Student;
    private JPanel editingPanel;
    private JPanel showingPanel;
    public JPanel searchingPanel;
    private JPanel jPanel6;
    JPanel jPanel7;
    public JPanel jPanel8;
    private JPanel showformPanel;
    public JTabbedPane jTabbedPane1;
}
