package com.hasib.app;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MarkSheet extends javax.swing.JPanel {

    /** Creates new form MarkSheet */
    public MarkSheet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

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

    private void initComponents() {
        but_back = new javax.swing.JButton();

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_subject = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_semester1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tp_otherAct1 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        tp_comments1 = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_semester2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tp_otherAct2 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        tp_comments2 = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_semester3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tp_otherAct3 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        tp_comments3 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        panel_stdinfo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_name = new javax.swing.JLabel();
        lb_class = new javax.swing.JLabel();
        lb_section = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_roll = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lb_session = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tp_schoolName = new javax.swing.JTextPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lb_totalStudents = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lb_passMark = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lb_minAtt = new javax.swing.JLabel();

//*****************************************************
        tbl_row = new Object[13];
//*****************************************************
        setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setRollover(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255))));

//************************************************************************		
        tbl_modelSubject = new javax.swing.table.DefaultTableModel();
        tbl_subject = new javax.swing.JTable(tbl_modelSubject);
        tbl_modelSubject.setColumnIdentifiers(new Object[]{"Subject Name", "Full marks"});

        for (int i = 0; i < 2; i++) {
            tbl_columnSubject = tbl_subject.getColumnModel().getColumn(i);
            if (i == 0) {
                tbl_columnSubject.setPreferredWidth(130);
            } else {
                tbl_columnSubject.setPreferredWidth(10);
            }
        }

        for (int i = 0; i < 13; i++) {
            tbl_row[i] = null;
            tbl_modelSubject.insertRow(i, tbl_row);
        }
//************************************************************************
        tbl_subject.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane5.setViewportView(tbl_subject);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Other Activities  :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Teachers Comments  :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE).addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE).addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE).addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jToolBar1.add(jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255))));

//*************************************************************************************************
        tbl_modelSemester1 = new javax.swing.table.DefaultTableModel();
        tbl_semester1 = new javax.swing.JTable(tbl_modelSemester1);
        tbl_modelSemester1.setColumnIdentifiers(new Object[]{"Class token", "Attendence", "Termtest", "subjective", "Objective", "Total", "Grade", "Heighest mark"});
        for (int i = 0; i < 13; i++) {
            tbl_row[i] = null;
            tbl_modelSemester1.insertRow(i, tbl_row);
        }
//*************************************************************************************************
        tbl_semester1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jScrollPane3.setViewportView(tbl_semester1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("First Semester");

        tp_otherAct1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jScrollPane1.setViewportView(tp_otherAct1);

        tp_comments1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jScrollPane9.setViewportView(tp_comments1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE).addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE).addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jToolBar1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255))));

//*************************************************************************************************
        tbl_modelSemester2 = new javax.swing.table.DefaultTableModel();
        tbl_semester2 = new javax.swing.JTable(tbl_modelSemester2);
        tbl_modelSemester2.setColumnIdentifiers(new Object[]{"Class token", "Attendence", "Termtest", "subjective", "Objective", "Total", "Grade", "Heighest mark"});
        for (int i = 0; i < 13; i++) {
            tbl_row[i] = null;
            tbl_modelSemester2.insertRow(i, tbl_row);
        }
//*************************************************************************************************
        tbl_semester2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jScrollPane4.setViewportView(tbl_semester2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Second Semester");

        tp_otherAct2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jScrollPane7.setViewportView(tp_otherAct2);

        tp_comments2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jScrollPane10.setViewportView(tp_comments2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE).addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE).addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE).addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jToolBar1.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255))));


//*************************************************************************************************
        tbl_modelSemester3 = new javax.swing.table.DefaultTableModel();
        tbl_semester3 = new javax.swing.JTable(tbl_modelSemester3);
        tbl_modelSemester3.setColumnIdentifiers(new Object[]{"Class token", "Attendence", "Termtest", "subjective", "Objective", "Total", "Grade", "Heighest mark"});
        for (int i = 0; i < 13; i++) {
            tbl_row[i] = null;
            tbl_modelSemester3.insertRow(i, tbl_row);
        }
//*************************************************************************************************
        tbl_semester3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jScrollPane6.setViewportView(tbl_semester3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Third Semester");

        tp_otherAct3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jScrollPane8.setViewportView(tp_otherAct3);

        tp_comments3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jScrollPane11.setViewportView(tp_comments3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE).addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE).addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE).addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jToolBar1.add(jPanel6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_stdinfo.setBackground(new java.awt.Color(102, 204, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Name  :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Class  :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Section  :");

        lb_name.setFont(new java.awt.Font("Tahoma", 1, 12));
        //lb_name.setForeground(new java.awt.Color(255, 0, 51));
        lb_name.setText("Abdullah Al Hasib");

        lb_class.setFont(new java.awt.Font("Tahoma", 1, 12));
        //lb_class.setForeground(new java.awt.Color(255, 0, 51));
        lb_class.setText("Class I");

        lb_section.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        //lb_section.setForeground(new java.awt.Color(255, 0, 51));
        lb_section.setText("A");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Roll  :");

        lb_roll.setFont(new java.awt.Font("Tahoma", 1, 12));
        //lb_roll.setForeground(new java.awt.Color(255, 0, 51));
        lb_roll.setText("93");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Session  :");

        lb_session.setFont(new java.awt.Font("Tahoma", 1, 12));
        //lb_session.setForeground(new java.awt.Color(255, 0, 51));
        lb_session.setText("2010");

        javax.swing.GroupLayout panel_stdinfoLayout = new javax.swing.GroupLayout(panel_stdinfo);
        panel_stdinfo.setLayout(panel_stdinfoLayout);
        panel_stdinfoLayout.setHorizontalGroup(
                panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(panel_stdinfoLayout.createSequentialGroup().addContainerGap().addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(panel_stdinfoLayout.createSequentialGroup().addGap(18, 18, 18).addComponent(lb_roll, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE).addGap(212, 212, 212)).addGroup(panel_stdinfoLayout.createSequentialGroup().addGap(18, 18, 18).addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_stdinfoLayout.createSequentialGroup().addComponent(lb_class, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(137, 137, 137)).addComponent(lb_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lb_session, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lb_section, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)).addContainerGap()));
        panel_stdinfoLayout.setVerticalGroup(
                panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(panel_stdinfoLayout.createSequentialGroup().addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(panel_stdinfoLayout.createSequentialGroup().addContainerGap().addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(lb_name)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(lb_class)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(lb_roll))).addGroup(panel_stdinfoLayout.createSequentialGroup().addGap(37, 37, 37).addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(lb_section)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(panel_stdinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel15).addComponent(lb_session)))).addContainerGap()));

        tp_schoolName.setBackground(new java.awt.Color(102, 204, 255));
        tp_schoolName.setEditable(false);
        tp_schoolName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane12.setViewportView(tp_schoolName);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(panel_stdinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE).addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel_stdinfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)).addContainerGap()));

        jPanel8.setBackground(new java.awt.Color(102, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Total number of students :");

        lb_totalStudents.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_totalStudents.setText("100");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Pass mark :");

        lb_passMark.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_passMark.setText("40%");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Minimum Attendence :");

        lb_minAtt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_minAtt.setText("80%");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(jLabel17).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lb_totalStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(103, 103, 103).addComponent(jLabel19).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(lb_passMark).addGap(175, 175, 175).addComponent(jLabel21).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lb_minAtt).addContainerGap(170, Short.MAX_VALUE)));
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(lb_totalStudents).addComponent(jLabel19).addComponent(lb_passMark).addComponent(jLabel21).addComponent(lb_minAtt)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))).addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));

//*******************************************************
        tbl_semester1.setSelectionModel(tbl_subject.getSelectionModel());
        tbl_semester2.setSelectionModel(tbl_subject.getSelectionModel());
        tbl_semester3.setSelectionModel(tbl_subject.getSelectionModel());
        jToolBar1.setFloatable(false);
//*******************************************************
    }// </editor-fold>//GEN-END:initComponents

    javax.swing.JPanel getPanel() {
        javax.swing.JPanel marksPanel = new javax.swing.JPanel();
        javax.swing.JPanel headerPanel = new javax.swing.JPanel();
        //javax.swing.JPanel marksPanel=new javax.swing.JPanel;
        but_back.setIcon(new javax.swing.ImageIcon("img\\undo.gif"));

        marksPanel.setLayout(new java.awt.BorderLayout());
        headerPanel.setLayout(new java.awt.BorderLayout());
        headerPanel.add(but_back, java.awt.BorderLayout.WEST);

        marksPanel.add(headerPanel, java.awt.BorderLayout.NORTH);
        marksPanel.add(new javax.swing.JScrollPane(this), java.awt.BorderLayout.CENTER);

        return marksPanel;
    }
    javax.swing.JButton but_back;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel lb_class;
    public javax.swing.JLabel lb_minAtt;
    public javax.swing.JLabel lb_name;
    public javax.swing.JLabel lb_passMark;
    public javax.swing.JLabel lb_roll;
    public javax.swing.JLabel lb_section;
    public javax.swing.JLabel lb_session;
    public javax.swing.JLabel lb_totalStudents;
    private javax.swing.JPanel panel_stdinfo;
    public javax.swing.JTable tbl_semester1;
    public javax.swing.JTable tbl_semester2;
    public javax.swing.JTable tbl_semester3;
    public javax.swing.JTable tbl_subject;
    public javax.swing.JTextPane tp_comments1;
    public javax.swing.JTextPane tp_comments2;
    public javax.swing.JTextPane tp_comments3;
    public javax.swing.JTextPane tp_otherAct1;
    public javax.swing.JTextPane tp_otherAct2;
    public javax.swing.JTextPane tp_otherAct3;
    public javax.swing.JTextPane tp_schoolName;
    //************************************************************
    javax.swing.table.DefaultTableModel tbl_modelSemester1;
    javax.swing.table.DefaultTableModel tbl_modelSemester2;
    javax.swing.table.DefaultTableModel tbl_modelSemester3;
    javax.swing.table.DefaultTableModel tbl_modelSubject;
    public javax.swing.table.TableColumn tbl_columnSubject;
    Object[] tbl_row;
    //************************************************************
    // End of variables declaration//GEN-END:variables
}
