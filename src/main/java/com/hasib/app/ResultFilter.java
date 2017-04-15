package com.hasib.app;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class ResultFilter extends javax.swing.JPanel {

    public ResultFilter() {
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
    private UIManager.LookAndFeelInfo looks[];

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cb_class = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        cb_subject = new javax.swing.JComboBox();
        cb_semester = new javax.swing.JComboBox();
        cb_section = new javax.swing.JComboBox();
        cb_year = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        tf_lowerthan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_upperthan = new javax.swing.JTextField();
        cb_grade = new javax.swing.JComboBox();
        but_search = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(173, 242));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "Select Class"));
        jPanel1.setOpaque(false);

        cb_class.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Class", "Class I", "Class II", "Class III", "Class IV", "Class V", "Class VI", "Class VII", "Class VIII", "Class IX", "Class X", "Class Play", "Class K.G.", "Class Nursary"}));
        cb_class.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_classActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(cb_class, javax.swing.GroupLayout.Alignment.TRAILING, 0, 141, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(cb_class, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "Filtering"));
        jPanel2.setOpaque(false);

        cb_subject.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Subject"}));
        cb_subject.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_subjectActionPerformed(evt);
            }
        });

        cb_semester.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Semester", "Semester-I", "Semester-II", "Semester-III"}));
        cb_semester.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_semesterActionPerformed(evt);
            }
        });

        cb_section.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Section"}));
        cb_section.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sectionActionPerformed(evt);
            }
        });

        String year[] = new String[102];
        year[0] = "Year";
        for (int i = 1990; i <= 2090; i++) {
            year[i - 1989] = "" + i;
        }
        cb_year.setModel(new javax.swing.DefaultComboBoxModel(year));
        cb_year.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_yearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(cb_subject, 0, 141, Short.MAX_VALUE).addGroup(jPanel2Layout.createSequentialGroup().addComponent(cb_semester, 0, 75, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(cb_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(cb_year, 0, 141, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(cb_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(cb_semester, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(cb_section, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(cb_year, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filter Marks/Grade"));
        jPanel3.setOpaque(false);

        tf_lowerthan.setToolTipText("Less then");

        jLabel1.setText("< Marks <");

        tf_upperthan.setToolTipText("Grater then");

        cb_grade.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Grade", "Item 2", "Item 3", "Item 4"}));
        cb_grade.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_gradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addComponent(tf_upperthan, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE).addGap(2, 2, 2).addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(tf_lowerthan, javax.swing.GroupLayout.DEFAULT_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(cb_grade, 0, 141, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tf_lowerthan, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(tf_upperthan, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel1)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(cb_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));

        but_search.setText("Search");
        but_search.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(but_search, javax.swing.GroupLayout.Alignment.TRAILING)).addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_search).addContainerGap()));
    }

    private void cb_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_classActionPerformed

    private void cb_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_subjectActionPerformed

    private void cb_semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_semesterActionPerformed

    private void cb_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_sectionActionPerformed

    private void cb_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_yearActionPerformed

    private void cb_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_gradeActionPerformed

    private void but_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_but_searchActionPerformed

    public javax.swing.JPanel getpanel() {
        return this;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton but_search;
    public javax.swing.JComboBox cb_class;
    public javax.swing.JComboBox cb_grade;
    public javax.swing.JComboBox cb_section;
    public javax.swing.JComboBox cb_semester;
    public javax.swing.JComboBox cb_subject;
    public javax.swing.JComboBox cb_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField tf_lowerthan;
    public javax.swing.JTextField tf_upperthan;
    // End of variables declaration//GEN-END:variables
}
