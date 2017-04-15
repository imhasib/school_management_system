package com.hasib.app;

public class Profiles extends javax.swing.JPanel {
//*********************************************************************

    int id = 0, roll = 0, sessionyear = 0;
    String name, nickName, stdClass, section, father, mother, birthday, gender, religion, contact,
            home_add, current_add, prevSchool, note;
    RegForm obRegForm;
    ShowProfile obShowProfile;
    MarkSheet obMarkSheet;
//**********************************************************************	

    public Profiles() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPannel = new javax.swing.JPanel();
        cb_selectClass = new javax.swing.JComboBox();
        cb_selectSection = new javax.swing.JComboBox();
        cb_selectSession = new javax.swing.JComboBox();
        tf_selectRoll = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lbl_stutus = new javax.swing.JLabel();
        but_go = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_form = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        but_deleteStudent = new javax.swing.JButton();
        but_addStudent = new javax.swing.JButton();
        but_profile = new javax.swing.JButton();
        but_editStudent = new javax.swing.JButton();
        but_result = new javax.swing.JButton();
        changingPanel = new javax.swing.JPanel();
//**************************************************************************************
        obRegForm = new RegForm();
        obShowProfile = new ShowProfile();
        obMarkSheet = new MarkSheet();
//**************************************************************************************		

        setBackground(new java.awt.Color(255, 255, 255));

        headerPannel.setBackground(new java.awt.Color(51, 153, 255));
        headerPannel.setMaximumSize(new java.awt.Dimension(32767, 30));
        headerPannel.setMinimumSize(new java.awt.Dimension(100, 30));
        headerPannel.setPreferredSize(new java.awt.Dimension(776, 30));

        cb_selectClass.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Class", "Class I", "Class II", "Class III", "Class IV", "Class V", "Class VI", "Class VII", "Class VIII", "Class IX", "Class X", "Class Play", "Class K.G.", "Class Nursary"}));
        cb_selectClass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));

        cb_selectSection.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Section", "A", "B", "C"}));
        cb_selectSection.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
//******************************************************************************
        String[] year = new String[52];
        for (int i = 2010; i <= 2060; i++) {
            year[i - 2009] = "" + i;
        }
        year[0] = "Select Session";
//*********************************************************************************

        cb_selectSession.setModel(new javax.swing.DefaultComboBoxModel(year));	//modified
        cb_selectSession.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));

        tf_selectRoll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel19.setText("Roll:");

        lbl_stutus.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbl_stutus.setForeground(new java.awt.Color(255, 255, 255));
        lbl_stutus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_stutus.setText("Student's Information Profile");

        //but_go.setText("");
        but_go.setIcon(new javax.swing.ImageIcon("img\\go.gif"));

        javax.swing.GroupLayout headerPannelLayout = new javax.swing.GroupLayout(headerPannel);
        headerPannel.setLayout(headerPannelLayout);
        headerPannelLayout.setHorizontalGroup(
                headerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(headerPannelLayout.createSequentialGroup().addContainerGap().addComponent(cb_selectClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(8, 8, 8).addComponent(cb_selectSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel19).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(tf_selectRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_go, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(cb_selectSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE).addComponent(lbl_stutus).addGap(21, 21, 21)));
        headerPannelLayout.setVerticalGroup(
                headerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(headerPannelLayout.createSequentialGroup().addGroup(headerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lbl_stutus, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE).addComponent(tf_selectRoll, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE).addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(cb_selectSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(cb_selectClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(but_go).addComponent(cb_selectSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(14, 14, 14)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));

//*************************************************************************************************
        tbl_model = new javax.swing.table.DefaultTableModel();
        tbl_form = new javax.swing.JTable(tbl_model);
        tbl_model.setColumnIdentifiers(new Object[]{"Sec", "Roll", "Name"});

        tbl_column = null;
        for (int i = 0; i < 3; i++) {
            tbl_column = tbl_form.getColumnModel().getColumn(i);
            if (i == 2) {
                tbl_column.setPreferredWidth(110);
            } else {
                tbl_column.setPreferredWidth(10);
            }
        }
//*************************************************************************************************
        tbl_form.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_form.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tbl_form);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        but_deleteStudent.setText("Delete Student");

        but_addStudent.setText("Add Student");

        but_profile.setText("Student's Profile");

        but_editStudent.setText("Edit Student Info");

        but_result.setText("Student's Result");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(57, 57, 57).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(but_result, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE).addComponent(but_profile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE).addComponent(but_deleteStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE).addComponent(but_editStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE).addComponent(but_addStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)).addGap(44, 44, 44)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(but_addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_editStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_deleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_result, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(1, Short.MAX_VALUE)));

        changingPanel.setBackground(new java.awt.Color(255, 255, 255));
        /*
        javax.swing.GroupLayout changingPanelLayout = new javax.swing.GroupLayout(changingPanel);
        changingPanel.setLayout(changingPanelLayout);
        changingPanelLayout.setHorizontalGroup(
        changingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 596, Short.MAX_VALUE)
        );
        changingPanelLayout.setVerticalGroup(
        changingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 566, Short.MAX_VALUE)
        );
         */
//**************************************************************************************
        changingPanel.setLayout(new java.awt.BorderLayout());
        javax.swing.JScrollPane changingPanelScroller = new javax.swing.JScrollPane(changingPanel);
//**************************************************************************************
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(changingPanelScroller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(headerPannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(headerPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(changingPanelScroller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap()));
//**************************************************************************************
        changingPanel.add(obRegForm);
        but_deleteStudent.setEnabled(false);
        but_result.setEnabled(false);
        but_editStudent.setEnabled(false);
        cb_selectSection.setEnabled(false);
        cb_selectSession.setEnabled(false);
        //cb_selectClass.setEnabled(false);
        tf_selectRoll.setEnabled(false);
        but_go.setEnabled(false);
//**************************************************************************************        
    }
//**************************************************************************************

    public void collectdata() {
        id = Integer.parseInt(obRegForm.tf_id.getText());
        name = obRegForm.tf_name.getText();
        nickName = obRegForm.tf_nickName.getText();
        stdClass = (String) obRegForm.cb_class.getSelectedItem();
        section = (String) obRegForm.cb_section.getSelectedItem();
        roll = Integer.parseInt(obRegForm.tf_roll.getText());
        sessionyear = Integer.parseInt((String) obRegForm.cb_session.getSelectedItem());
        father = obRegForm.tf_father.getText();
        mother = obRegForm.tf_mother.getText();
        birthday = (String) obRegForm.cb_bdDay.getSelectedItem() + " / " + (String) obRegForm.cb_bdMonth.getSelectedItem() + " / " + (String) obRegForm.cb_bdYear.getSelectedItem();
        gender = (String) obRegForm.cb_gender.getSelectedItem();
        religion = (String) obRegForm.cb_religion.getSelectedItem();
        contact = obRegForm.tf_contact.getText();
        current_add = obRegForm.tp_currentAdd.getText();
        home_add = obRegForm.tp_homeAdd.getText();
        prevSchool = obRegForm.tf_prevSchool.getText();
        note = obRegForm.tp_note.getText();

        //	System.out.print(id+roll+name+nickName+stdClass+section+father+mother+birthday+gender+religion+contact
        //			+home_add+current_add+prevSchool+sessionyear);
    }

    String[] getSingleDataArray() {
        String[] temp_dataArray = new String[18];

        temp_dataArray[0] = "" + id;
        temp_dataArray[1] = name;
        temp_dataArray[2] = nickName;
        temp_dataArray[3] = stdClass;
        temp_dataArray[4] = section;
        temp_dataArray[5] = "" + roll;
        temp_dataArray[6] = "" + sessionyear;
        temp_dataArray[7] = father;
        temp_dataArray[8] = mother;
        temp_dataArray[9] = birthday;
        temp_dataArray[10] = gender;
        temp_dataArray[11] = religion;
        temp_dataArray[12] = contact;
        temp_dataArray[13] = current_add;
        temp_dataArray[14] = home_add;
        temp_dataArray[15] = prevSchool;
        temp_dataArray[16] = note;
        temp_dataArray[17] = "";

        return temp_dataArray;
    }

    void clearall() {
        obRegForm.tf_name.setText(null);
        obRegForm.tf_nickName.setText(null);
        obRegForm.cb_class.setSelectedItem("Class");
        obRegForm.cb_section.setSelectedItem("Section");
        obRegForm.tf_roll.setText(null);
        obRegForm.cb_session.setSelectedItem("Session");
        obRegForm.tf_father.setText(null);
        obRegForm.tf_mother.setText(null);
        obRegForm.cb_bdDay.setSelectedItem("Day");
        obRegForm.cb_bdMonth.setSelectedItem("Month");
        obRegForm.cb_bdYear.setSelectedItem("Year");
        obRegForm.cb_gender.setSelectedItem("Gender");
        obRegForm.cb_religion.setSelectedItem("Religion");
        obRegForm.tf_contact.setText(null);
        obRegForm.tp_homeAdd.setText(null);
        obRegForm.tp_currentAdd.setText(null);
        obRegForm.tf_prevSchool.setText(null);
        obRegForm.tp_note.setText(null);
    }

    void clearallProfilesInfo() {
        obShowProfile.lb_id.setText(null);
        obShowProfile.lb_name.setText(null);
        obShowProfile.lb_nickName.setText(null);
        obShowProfile.lb_class.setText(null);
        obShowProfile.lb_section.setText(null);
        obShowProfile.lb_roll.setText(null);
        obShowProfile.lb_session.setText(null);
        obShowProfile.lb_father.setText(null);
        obShowProfile.lb_mother.setText(null);
        obShowProfile.lb_birthday.setText(null);

        obShowProfile.lb_gender.setText(null);
        obShowProfile.lb_religion.setText(null);
        obShowProfile.lb_contact.setText(null);
        obShowProfile.lb_homeAdd.setText(null);
        obShowProfile.lb_currentAdd.setText(null);
        obShowProfile.lb_prevSchool.setText(null);
        obShowProfile.tp_note.setText(null);
    }

    void setData(String[] dataArray) {
        obShowProfile.lb_id.setText(dataArray[0]);
        obShowProfile.lb_name.setText(dataArray[1]);
        obShowProfile.lb_nickName.setText(dataArray[2]);
        obShowProfile.lb_class.setText(dataArray[3]);
        obShowProfile.lb_section.setText(dataArray[4]);
        obShowProfile.lb_roll.setText(dataArray[5]);
        obShowProfile.lb_session.setText(dataArray[6]);
        obShowProfile.lb_father.setText(dataArray[7]);
        obShowProfile.lb_mother.setText(dataArray[8]);
        obShowProfile.lb_birthday.setText(dataArray[9]);
        obShowProfile.lb_gender.setText(dataArray[10]);
        obShowProfile.lb_religion.setText(dataArray[11]);
        obShowProfile.lb_contact.setText(dataArray[12]);
        obShowProfile.lb_currentAdd.setText(dataArray[13]);
        obShowProfile.lb_homeAdd.setText(dataArray[14]);
        obShowProfile.lb_prevSchool.setText(dataArray[15]);
        obShowProfile.tp_note.setText(dataArray[16]);
    }

    void setDataRegform(String[] dataArray) {
        int[] b_d = new int[3];
        java.util.StringTokenizer dateTokens;
        int i = 0;

        dateTokens = new java.util.StringTokenizer(dataArray[9]);

        while (dateTokens.hasMoreTokens()) {
            try {
                b_d[i] = Integer.parseInt(dateTokens.nextToken());
                i++;
            } catch (NumberFormatException nfe) {
                //System.out.println("birth day number formet exception");
                nfe.printStackTrace();
            }
        }

        obRegForm.tf_id.setText(dataArray[0]);
        obRegForm.tf_name.setText(dataArray[1]);
        obRegForm.tf_nickName.setText(dataArray[2]);
        obRegForm.cb_class.setSelectedItem(dataArray[3]);
        obRegForm.cb_section.setSelectedItem(dataArray[4]);
        obRegForm.tf_roll.setText(dataArray[5]);
        obRegForm.cb_session.setSelectedItem(dataArray[6]);

        obRegForm.tf_father.setText(dataArray[7]);
        obRegForm.tf_mother.setText(dataArray[8]);

        obRegForm.cb_bdDay.setSelectedItem(b_d[1]);
        obRegForm.cb_bdMonth.setSelectedItem(b_d[1]);
        obRegForm.cb_bdYear.setSelectedItem(b_d[1]);

        obRegForm.cb_gender.setSelectedItem(dataArray[10]);
        obRegForm.cb_religion.setSelectedItem(dataArray[11]);
        obRegForm.tf_contact.setText(dataArray[12]);
        obRegForm.tp_currentAdd.setText(dataArray[13]);
        obRegForm.tp_homeAdd.setText(dataArray[14]);
        obRegForm.tf_prevSchool.setText(dataArray[15]);
        obRegForm.tp_note.setText(dataArray[16]);
    }

    void setRegForm() {
        changingPanel.removeAll();
        changingPanel.add(obRegForm);
        changingPanel.repaint();
    }

    void setShowProfile() {
        changingPanel.removeAll();
        changingPanel.add(obShowProfile);
        changingPanel.repaint();
    }
//****************************************************************************************
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton but_addStudent;
    public javax.swing.JButton but_deleteStudent;
    public javax.swing.JButton but_editStudent;
    public javax.swing.JButton but_go;
    public javax.swing.JButton but_profile;
    public javax.swing.JButton but_result;
    public javax.swing.JComboBox cb_selectClass;
    public javax.swing.JComboBox cb_selectSection;
    public javax.swing.JComboBox cb_selectSession;
    public javax.swing.JPanel changingPanel;
    private javax.swing.JPanel headerPannel;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_stutus;
    public javax.swing.JTable tbl_form;
    public javax.swing.JTextField tf_selectRoll;
    //**************************************************
    public javax.swing.table.TableColumn tbl_column;
    javax.swing.table.DefaultTableModel tbl_model;
    //***************************************************
    // End of variables declaration//GEN-END:variables
}
