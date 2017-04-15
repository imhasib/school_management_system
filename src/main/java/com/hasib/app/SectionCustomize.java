package com.hasib.app;

public class SectionCustomize extends javax.swing.JInternalFrame {

    public SectionCustomize() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        but_new = new javax.swing.JButton();
        but_edit = new javax.swing.JButton();
        but_rename = new javax.swing.JButton();
        but_delete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cb_class = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        //list_section = new javax.swing.JList();
        panel_changing = new javax.swing.JPanel();
        tf_new = new javax.swing.JTextField();
        lb_new = new javax.swing.JLabel();
        but_done = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tp_status = new javax.swing.JTextPane();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        but_new.setText("New");

        but_edit.setText("Edit");

        but_rename.setText("Rename");

        but_delete.setText("Delete");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(but_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE).addComponent(but_new, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE).addComponent(but_rename, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE).addComponent(but_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)).addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(but_new).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_edit).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_rename).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(but_delete).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        cb_class.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb_class.setForeground(new java.awt.Color(51, 51, 51));
        cb_class.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Select Class", "Class I", "Class II", "Class III", "Class IV", "Class V", "Class VI", "Class VII", "Class VIII", "Class IX", "Class X", "Class Play", "Class K.G.", "Class Nursary"}));

        //****************************************************************
        list_model = new javax.swing.DefaultListModel();
        list_section = new javax.swing.JList(list_model);
        list_selectionModel = new javax.swing.DefaultListSelectionModel();
        list_selectionModel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list_section.setSelectionModel(list_selectionModel);
        //****************************************************************
        jScrollPane1.setViewportView(list_section);
        list_section.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Section List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 255))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(cb_class, javax.swing.GroupLayout.Alignment.LEADING, 0, 147, Short.MAX_VALUE).addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)).addContainerGap()));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(cb_class, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)));

        panel_changing.setBackground(new java.awt.Color(255, 255, 255));
        panel_changing.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Customize"));

        tf_new.setText("jTextField2");
        tf_new.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        tf_new.setEnabled(false);

        lb_new.setFont(new java.awt.Font("Tahoma", 1, 11));
        lb_new.setText("New :");

        but_done.setText("New");
        but_done.setEnabled(false);

        javax.swing.GroupLayout panel_changingLayout = new javax.swing.GroupLayout(panel_changing);
        panel_changing.setLayout(panel_changingLayout);
        panel_changingLayout.setHorizontalGroup(
                panel_changingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(panel_changingLayout.createSequentialGroup().addContainerGap().addGroup(panel_changingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(but_done, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(panel_changingLayout.createSequentialGroup().addComponent(lb_new).addGap(28, 28, 28).addComponent(tf_new, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))).addContainerGap()));
        panel_changingLayout.setVerticalGroup(
                panel_changingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(panel_changingLayout.createSequentialGroup().addContainerGap().addGroup(panel_changingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tf_new, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lb_new)).addGap(12, 12, 12).addComponent(but_done).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        tp_status.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Status"));
        jScrollPane2.setViewportView(tp_status);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addComponent(panel_changing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(panel_changing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        //**************************************************************
        but_new.setEnabled(false);
        but_edit.setEnabled(false);
        but_delete.setEnabled(false);
        but_rename.setVisible(false);
        setTitle("Section Customize");
        //***************************************************************

        pack();
    }
    // Variables declaration - do not modify
    public javax.swing.JButton but_delete;
    public javax.swing.JButton but_done;
    public javax.swing.JButton but_edit;
    public javax.swing.JButton but_new;
    public javax.swing.JButton but_rename;
    public javax.swing.JComboBox cb_class;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel panel_changing;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_new;
    public javax.swing.JList list_section;
    public javax.swing.JTextField tf_new;
    public javax.swing.JTextPane tp_status;
    //***********************************************
    public javax.swing.DefaultListModel list_model;
    public javax.swing.DefaultListSelectionModel list_selectionModel;
    // End of variables declaration
}
