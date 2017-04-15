package com.hasib.app;

public class RegForm extends javax.swing.JPanel {

    public RegForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        changingPannel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lb_image = new javax.swing.JLabel();
        but_upload = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_session = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        tf_nickName = new javax.swing.JTextField();
        tf_roll = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cb_section = new javax.swing.JComboBox();
        cb_class = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        tf_father = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_mother = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cb_bdDay = new javax.swing.JComboBox();
        cb_bdMonth = new javax.swing.JComboBox();
        cb_bdYear = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cb_gender = new javax.swing.JComboBox();
        cb_religion = new javax.swing.JComboBox();
        tf_contact = new javax.swing.JTextField();
        tf_prevSchool = new javax.swing.JTextField();
        cb_session = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tp_note = new javax.swing.JEditorPane();
        but_add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tp_homeAdd = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tp_currentAdd = new javax.swing.JTextPane();

        changingPannel.setBackground(new java.awt.Color(255, 255, 255));
        changingPannel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        changingPannel.setPreferredSize(new java.awt.Dimension(1000, 579));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 255), new java.awt.Color(102, 204, 255)));

        lb_image.setText("                     Image");
        lb_image.setIcon(new javax.swing.ImageIcon("img\\upload.gif"));
        lb_image.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 5, true));

        but_upload.setText("Upload");
        but_upload.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_uploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(62, 62, 62).addComponent(but_upload)).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(lb_image, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(lb_image, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_upload)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Student ID:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("* Full Name:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nick Name:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("* Class:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("* Section:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("* Roll:");

        lbl_session.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_session.setText("* Session:");

        tf_id.setBackground(new java.awt.Color(236, 246, 250));
        tf_id.setEnabled(false);

        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("You must Fill the Field Marked *");

        cb_section.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Section", "A", "B", "C"}));

        cb_class.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Class", "Class I", "Class II", "Class III", "Class IV", "Class V", "Class VI", "Class VII", "Class VIII", "Class IX", "Class X", "Class Play", "Class K.G.", "Class Nursary"}));

        jLabel10.setText("Father's Name:");

        jLabel11.setText("Mother's Name:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Date of Birth:");
        //*********************************************************************************
        String day[] = new String[32];
        for (int i = 1; i <= 31; i++) {
            day[i] = "" + i;
        }
        day[0] = "Day";
        String month[] = new String[13];
        for (int i = 1; i <= 12; i++) {
            month[i] = "" + i;
        }
        month[0] = "Month";
        String year[] = new String[52];
        for (int i = 1990; i <= 2040; i++) {
            year[i - 1989] = "" + i;
        }
        year[0] = "Year";
        //************************************************************************************
        cb_bdDay.setModel(new javax.swing.DefaultComboBoxModel(day));

        cb_bdMonth.setModel(new javax.swing.DefaultComboBoxModel(month));

        cb_bdYear.setModel(new javax.swing.DefaultComboBoxModel(year));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Gender:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Religion:");

        jLabel15.setText("Contact:");

        jLabel16.setText("Current Address:");

        jLabel17.setText("Home Address:");

        jLabel18.setText("Previous School:");

        cb_gender.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Gender", "Male", "Female", "Others"}));

        cb_religion.setEditable(true);
        cb_religion.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Riligion", "Muslim", "Hindu", "Christian", "Buddhism"}));
        //******************************************************************************
        for (int i = 2010; i <= 2060; i++) {
            year[i - 2009] = "" + i;
        }
        year[0] = "Select Session";
        //*********************************************************************************
        cb_session.setModel(new javax.swing.DefaultComboBoxModel(year));

        tp_note.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Note", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        tp_note.setFont(new java.awt.Font("Constantia", 0, 12));
        jScrollPane3.setViewportView(tp_note);

        but_add.setText("");
        but_add.setIcon(new javax.swing.ImageIcon("img\\but_addStudent.gif"));

        tp_homeAdd.setToolTipText("Permanent Address");
        jScrollPane2.setViewportView(tp_homeAdd);

        tp_currentAdd.setToolTipText("Present Address");
        jScrollPane4.setViewportView(tp_currentAdd);

        javax.swing.GroupLayout changingPannelLayout = new javax.swing.GroupLayout(changingPannel);
        changingPannel.setLayout(changingPannelLayout);
        changingPannelLayout.setHorizontalGroup(
                changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changingPannelLayout.createSequentialGroup().addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(changingPannelLayout.createSequentialGroup().addContainerGap().addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(changingPannelLayout.createSequentialGroup().addGap(17, 17, 17).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(changingPannelLayout.createSequentialGroup().addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE).addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE).addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE).addGroup(javax.swing.GroupLayout.Alignment.LEADING, changingPannelLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)).addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE).addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(lbl_session, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGap(15, 15, 15)).addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(changingPannelLayout.createSequentialGroup().addGap(10, 10, 10).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel15).addComponent(jLabel13).addComponent(jLabel12).addComponent(jLabel14))))).addGroup(changingPannelLayout.createSequentialGroup().addGap(14, 14, 14).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(but_add).addComponent(jLabel18).addComponent(jLabel17)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(changingPannelLayout.createSequentialGroup().addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addComponent(tf_prevSchool, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addGroup(javax.swing.GroupLayout.Alignment.LEADING, changingPannelLayout.createSequentialGroup().addComponent(cb_bdDay, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(cb_bdMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(cb_bdYear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(tf_mother, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addComponent(tf_father, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addComponent(cb_session, javax.swing.GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE).addComponent(tf_contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addComponent(cb_religion, javax.swing.GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE).addComponent(cb_gender, javax.swing.GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE).addComponent(tf_roll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addComponent(cb_section, javax.swing.GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE).addComponent(cb_class, javax.swing.GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE).addComponent(tf_nickName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addComponent(tf_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE).addComponent(tf_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)).addGap(18, 18, 18).addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)).addContainerGap()));
        changingPannelLayout.setVerticalGroup(
                changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(changingPannelLayout.createSequentialGroup().addContainerGap().addComponent(jLabel9).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(changingPannelLayout.createSequentialGroup().addGap(7, 7, 7).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tf_nickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(cb_class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel5)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(cb_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tf_roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel7)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(cb_session, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lbl_session)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(tf_father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(8, 8, 8).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tf_mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel11)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel12).addComponent(cb_bdDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(cb_bdMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(cb_bdYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(cb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(cb_religion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel14)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tf_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(tf_prevSchool)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(changingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(but_add, 60, 60, Short.MAX_VALUE).addComponent(jScrollPane3, 60, 60, Short.MAX_VALUE)).addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(changingPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(changingPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    private void but_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_uploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_but_uploadActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton but_add;
    public javax.swing.JButton but_upload;
    public javax.swing.JComboBox cb_bdDay;
    public javax.swing.JComboBox cb_bdMonth;
    public javax.swing.JComboBox cb_bdYear;
    public javax.swing.JComboBox cb_class;
    public javax.swing.JComboBox cb_gender;
    public javax.swing.JComboBox cb_religion;
    public javax.swing.JComboBox cb_section;
    public javax.swing.JComboBox cb_session;
    private javax.swing.JPanel changingPannel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lb_image;
    public javax.swing.JLabel lbl_session;
    public javax.swing.JTextField tf_contact;
    public javax.swing.JTextField tf_father;
    public javax.swing.JTextField tf_id;
    public javax.swing.JTextField tf_mother;
    public javax.swing.JTextField tf_name;
    public javax.swing.JTextField tf_nickName;
    public javax.swing.JTextField tf_prevSchool;
    public javax.swing.JTextField tf_roll;
    public javax.swing.JEditorPane tp_note;
    public javax.swing.JTextPane tp_currentAdd;
    public javax.swing.JTextPane tp_homeAdd;
    // End of variables declaration//GEN-END:variables
}
