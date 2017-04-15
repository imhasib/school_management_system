package com.hasib.app;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class StudentFilter extends JPanel {

    boolean isfocusable = true;

    public StudentFilter() {
        initComponents();
        this.setOpaque(false);
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

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new JPanel();
        tf_name = new JTextField();
        jPanel2 = new JPanel();
        cb_class = new JComboBox();
        cb_section = new JComboBox();
        tf_roll = new JTextField();
        cb_year = new JComboBox();
        but_search = new JButton();

        setMinimumSize(new Dimension(100, 100));
        setPreferredSize(new Dimension(173, 242));

        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 153, 255)), "Search by name"));
        jPanel1.setOpaque(false);
        tf_name.setForeground(new Color(204, 204, 204));
        tf_name.setText("Search By Name");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(tf_name, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(tf_name, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE));

        jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 153, 255)), "Filtering"));
        jPanel2.setOpaque(false);
        cb_class.setModel(new DefaultComboBoxModel(new String[]{"Class", "Class I", "Class II", "Class III", "Class IV", "Class V", "Class VI", "Class VII", "Class VIII", "Class IX", "Class X", "Class Play", "Class K.G.", "Class Nursary"}));
        cb_class.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                cb_classActionPerformed(evt);
            }
        });

        cb_section.setModel(new DefaultComboBoxModel(new String[]{"Section"}));
        cb_section.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                cb_sectionActionPerformed(evt);
            }
        });

        tf_roll.setForeground(new Color(204, 204, 204));
        tf_roll.setText("Search By Roll no");
        //******************************

        tf_name.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent fle) {

                tf_name.setText("");
                //tf_name.setFont(new java.awt.Font(null, 1, 12));
                tf_name.setForeground(new Color(0, 0, 0));
            }

            public void focusLost(FocusEvent fle) {
                tf_name.setText(tf_name.getText());

            }
        });
        tf_roll.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent fle) {
                tf_roll.setText("");
                //tf_roll.setFont(new java.awt.Font(null, 1, 12));
                tf_roll.setForeground(new Color(0, 0, 0));
            }

            public void focusLost(FocusEvent fle) {
                tf_roll.setText(tf_roll.getText());

            }
        });
        //***********************************************
        String year[] = new String[102];
        year[0] = "Year";
        for (int i = 2010; i <= 2090; i++) {
            year[i - 2010] = "" + i;
        }
        cb_year.setModel(new DefaultComboBoxModel(year));

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cb_class, GroupLayout.Alignment.TRAILING, 0, 141, Short.MAX_VALUE).addComponent(cb_section, GroupLayout.Alignment.TRAILING, 0, 141, Short.MAX_VALUE).addComponent(tf_roll, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE).addComponent(cb_year, 0, 141, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(cb_class, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(cb_section, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(tf_roll, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(cb_year, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE).addContainerGap(13, Short.MAX_VALUE)));

        but_search.setText("Search");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jPanel2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(but_search).addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(18, 18, 18).addComponent(but_search).addContainerGap()));


    }

    private void cb_classActionPerformed(ActionEvent evt) {
    }

    private void cb_sectionActionPerformed(ActionEvent evt) {
    }

    public JPanel getpanel() {
        return this;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public JButton but_search;
    public JComboBox cb_class;
    public JComboBox cb_section;
    private JComboBox cb_year;
    private JPanel jPanel1;
    private JPanel jPanel2;
    public JTextField tf_name;
    public JTextField tf_roll;
    private UIManager.LookAndFeelInfo looks[];
    // End of variables declaration//GEN-END:variables
}
