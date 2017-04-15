package com.hasib.app;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

//UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");     
//UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");       
public class MainFrame extends JFrame {

    Dimension frameSize;
    ImageIcon headerico, bannerico;
    int lid;
    String[][] subByClassArray = new String[13][11];
    String[][] subCodeByClassArray = new String[13][11];
    String[][] secByClassArray = new String[13][8];
    String[] lookandfeels = new String[]{"com.birosoft.liquid.LiquidLookAndFeel", "com.jtattoo.plaf.smart.SmartLookAndFeel", "com.jtattoo.plaf.noire.NoireLookAndFeel", "com.jtattoo.plaf.mint.MintLookAndFeel", "com.jtattoo.plaf.mint.MintLookAndFeel", "com.jtattoo.plaf.mcwin.McWinLookAndFeel", "com.jtattoo.plaf.fast.FastLookAndFeel", "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel", "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel", "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel", "com.jtattoo.plaf.aero.AeroLookAndFeel", "com.jtattoo.plaf.acryl.AcrylLookAndFeel"};
    LogIn obLogIn;
    LeftPanel obLeftPanel;
    MenuBarPanel obMenuBarPanel;
    OperatorPanel obOperatorPanel;
    StudentPanel obStudentPanel;
    SelectAndInsertData obSelectAndInsertData;
    SubjectCustomize obSubjectCustomize;
    SectionCustomize obSectionCustomize;
    SearchResultViewer[] obSearchResultViewer;
    TeacherPanel obTeacherPanel;
    ToolBar obToolBar;
    preview obPreview;
    CreateUser obCreateUser;

    public MainFrame() throws java.sql.SQLException {
        initComponents();
        getSubByClass();
        getSecbyClass();
        change_look(11);
        frameSize = getSize();
    }

    private void change_look(int feel_and_look) {
        String s = "";
        looks = UIManager.getInstalledLookAndFeels();
        try {
            s = lookandfeels[feel_and_look];
            //UIManager.setLookAndFeel(looks[feel_and_look].getClassName());
            UIManager.setLookAndFeel(s);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();

        obLeftPanel.obAdvanceSearchPanel.obResultFilter.change_look(s);
        obLeftPanel.obAdvanceSearchPanel.obStudentFilter.change_look(s);
        obLeftPanel.obTreePanel.change_look(s);
        obStudentPanel.change_look(s);
        obTeacherPanel.change_look(s);
        obOperatorPanel.change_look(s);
        obStudentPanel.obProfiles.obMarkSheet.change_look(s);
        obToolBar.change_look(s);
    }

    private void initComponents() throws java.sql.SQLException {
        headerico = new ImageIcon("img\\header.jpg");
        bannerico = new ImageIcon("img\\banner.jpg");

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        MainPanel = new JPanel();
        changingPanel = new JPanel();
        layer = new JLayeredPane();
        jLabelheader = new JLabel();
        JLabelbanner = new JLabel();
        jLabelheader.setIcon(headerico);
        JLabelbanner.setIcon(bannerico);

        obMenuBarPanel = new MenuBarPanel();
        obSelectAndInsertData = new SelectAndInsertData();
        obLogIn = new LogIn();
        obTeacherPanel = new TeacherPanel();
        obOperatorPanel = new OperatorPanel();
        obLeftPanel = new LeftPanel();
        obToolBar = new ToolBar();
        obStudentPanel = new StudentPanel();
        obSubjectCustomize = new SubjectCustomize();
        obSectionCustomize = new SectionCustomize();
        obCreateUser = new CreateUser();
        lid = obSelectAndInsertData.getidvalue();
        obStudentPanel.obProfiles.obRegForm.tf_id.setText("" + lid);
        //##########################################
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(51, 51, 51));
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jLabelheader, BorderLayout.EAST);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(JLabelbanner, BorderLayout.WEST);

        changingPanel.setLayout(new BorderLayout());
        changingPanel.add(obLogIn.getPanel(), BorderLayout.CENTER);

        setJMenuBar(obMenuBarPanel.getMenuBar());
        //********************** Login actions :
        obLogIn.butLogIn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                butLoginActionPerformed(e);
            }
        });

        loginKeyActions();
        //***************** MenuBaractions :
        obMenuBarPanel.jmi_exit.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
                });
        obMenuBarPanel.jmi_signout.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        logInPage();
                    }
                });

        obMenuBarPanel.jmi_createuser.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        jmi_createuserActionPerformed(e);
                    }
                });


        obMenuBarPanel.jmi_subjectcustom.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        jmi_subjectcustomActionPerformed(e);
                    }
                });
        obMenuBarPanel.jmi_sectioncustom.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        jmi_sectioncustomActionPerformed(e);
                    }
                });
        obMenuBarPanel.jmi_Theme1.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(1);
                    }
                });
        obMenuBarPanel.jmi_Theme2.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(2);
                    }
                });
        obMenuBarPanel.jmi_Theme3.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(3);
                    }
                });
        obMenuBarPanel.jmi_Theme4.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(4);
                    }
                });
        obMenuBarPanel.jmi_Theme5.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(5);
                    }
                });
        obMenuBarPanel.jmi_Theme6.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(6);
                    }
                });
        obMenuBarPanel.jmi_Theme7.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(7);
                    }
                });
        obMenuBarPanel.jmi_Theme8.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(8);
                    }
                });
        obMenuBarPanel.jmi_Theme9.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(9);
                    }
                });
        obMenuBarPanel.jmi_Theme10.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(10);
                    }
                });
        obMenuBarPanel.jmi_Theme11.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(11);
                    }
                });
        obMenuBarPanel.jmi_Theme12.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        change_look(12);
                    }
                });


        //****************************Internal frames
        obSubjectCustomize.but_new.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                subjectCustomize_but_newActionPerformed(e);
            }
        });
        obSubjectCustomize.but_edit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                subjectCustomize_but_editActionPerformed(e);
            }
        });
        obSubjectCustomize.but_delete.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                subjectCustomize_but_deleteActionPerformed(e);
            }
        });
        obSubjectCustomize.but_done.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                subjectCustomize_but_doneActionPerformed(e);
            }
        });
        obSubjectCustomize.cb_class.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                subjectCustomize_cb_classActionPerformed(e);
            }
        });
        obSubjectCustomize.list_subject.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me) {
                subjectCustomize_list_subjectMouseClicked(me);
            }
        });
        //************************************************
        obSectionCustomize.but_new.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sectionCustomize_but_newActionPerformed(e);
            }
        });
        obSectionCustomize.but_edit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sectionCustomize_but_editActionPerformed(e);
            }
        });
        obSectionCustomize.but_delete.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sectionCustomize_but_deleteActionPerformed(e);
            }
        });
        obSectionCustomize.but_done.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sectionCustomize_but_doneActionPerformed(e);
            }
        });
        obSectionCustomize.cb_class.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                sectionCustomize_cb_classActionPerformed(e);
            }
        });
        obSectionCustomize.list_section.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me) {
                sectionCustomize_list_sectionMouseClicked(me);
            }
        });
        //********************** LeftPanelActions :
        obLeftPanel.but_student.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                but_studentActionPerformed(evt);
            }
        });
        obLeftPanel.but_teacher.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                but_teacherActionPerformed(evt);
            }
        });
        obLeftPanel.but_operator.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                but_operatorActionPerformed(evt);
            }
        });

        //********************
        obLeftPanel.obAdvanceSearchPanel.obStudentFilter.but_search.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                studentFilterbut_searchActionPerformed(evt);
            }
        });

        AdvanceSearchPanelKeyBoardActions();
        //*************************ViewInfo :
        //***********************************Regform :
        //***********************************Showform :
        //*********************************InputResultForm :
        //***********************************Forms Actions :
        obStudentPanel.obProfiles.but_addStudent.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                form_but_addstudentActionPerformed(evt);
            }
        });
        obStudentPanel.obProfiles.but_result.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                form_but_resultActionPerformed(evt);
            }
        });
        obStudentPanel.obProfiles.but_editStudent.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                form_but_editActionPerformed(evt);
            }
        });
        obStudentPanel.obProfiles.but_deleteStudent.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                form_but_deleteActionPerformed(evt);
            }
        });
        obStudentPanel.obProfiles.obRegForm.but_add.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                form_but_addActionPerformed(evt);
            }
        });
        obStudentPanel.obProfiles.but_profile.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                form_but_profileActionPerformed(evt);
            }
        });
        obStudentPanel.obProfiles.but_go.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                form_but_goActionPerformed(e);
            }
        });
        obStudentPanel.obProfiles.cb_selectClass.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                form_cb_selectClassActionPerformed(e);
            }
        });
        obStudentPanel.obProfiles.cb_selectSection.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                form_cb_selectSectionActionPerformed(e);
            }
        });
        obStudentPanel.obProfiles.cb_selectSession.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                form_cb_selectSessionActionPerformed(e);
            }
        });
        obStudentPanel.obProfiles.obRegForm.cb_class.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                form_cb_classActionPerformed(e);
            }
        });
        obStudentPanel.obProfiles.obRegForm.cb_section.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                form_cb_sectionActionPerformed(e);
            }
        });
        obStudentPanel.obProfiles.tbl_form.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me) {
                form_tbl_formMouseClicked(me);
            }
        });
        obStudentPanel.obProfiles.obRegForm.tf_roll.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                form_tf_rollKeyPressed(ke);
            }
        });

        obStudentPanel.obProfiles.obMarkSheet.but_back.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                form_backActionPerformed(e);
            }
        });

        formsKeyboardActions();
        //***********************************
        obStudentPanel.obInputResultForm.cbstd_class.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                IRF_cbstd_classActionPerformed(e);
            }
        });
        obStudentPanel.obInputResultForm.cbsection.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                IRF_cbsectionActionPerformed(e);
            }
        });
        obStudentPanel.obInputResultForm.cbsemester.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cbsemesterActionPerformed(e);
            }
        });
        obStudentPanel.obInputResultForm.cbsubject.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cbsubjectActionPerformed(e);
            }
        });

        obStudentPanel.obInputResultForm.but_submit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                but_submitActionPerformed(e);
            }
        });
        obStudentPanel.obInputResultForm.but_clearAll.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                but_clearAllActionPerformed(e);
            }
        });
        obStudentPanel.obInputResultForm.marksTable.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                mrksTableKeyPressed(ke);
            }
        });
        obStudentPanel.obInputResultForm.but_ok.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                but_okActionPerformed(e);
            }
        });

        //*********************Advanced Search Panel :        
        obLeftPanel.obAdvanceSearchPanel.but_studentprofile.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                but_studentprofileActionPerformed(evt);
            }
        });

        obLeftPanel.obAdvanceSearchPanel.but_resultfilter.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                but_resultfilterActionPerformed(evt);
            }
        });
        //*********************************************************************
        obToolBar.tbb_addStudent.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                obStudentPanel.jTabbedPane1.setSelectedIndex(0);
                form_but_addstudentActionPerformed(e);
            }
        });
        obToolBar.tbb_result.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                obStudentPanel.jTabbedPane1.setSelectedIndex(1);
                form_but_resultActionPerformed(e);
            }
        });
        obToolBar.tbb_logOut.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                logInPage();
            }
        });
        obToolBar.tbb_print.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                obPreview = new preview(obStudentPanel.obProfiles.obShowProfile);
            }
        });

        //**************************************8

        MainPanel.setLayout(new BorderLayout());
        MainPanel.add(jPanel1, BorderLayout.NORTH);
        MainPanel.add(jPanel2, BorderLayout.WEST);
        MainPanel.add(changingPanel, BorderLayout.CENTER);

        layer.setLayout(new BorderLayout());

        layer.add(obSubjectCustomize, 0);
        layer.add(obSectionCustomize, 1);
        layer.add(obCreateUser, 2);

        layer.add(MainPanel, 3);


        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(layer, BorderLayout.CENTER);

        /*        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(changingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(changingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
         */ pack();
    }

    void logInPage() {
        int ask = JOptionPane.showConfirmDialog(this, "do u want to Logout", "Logout", JOptionPane.YES_NO_OPTION);
        if (ask == 0) {
            jPanel1.removeAll();
            jPanel1.add(jLabelheader, BorderLayout.CENTER);
            jPanel2.removeAll();
            jPanel2.add(JLabelbanner, BorderLayout.CENTER);
            changingPanel.removeAll();
            changingPanel.add(obLogIn.getPanel(), BorderLayout.CENTER);
            obMenuBarPanel.setEnable(false);
            setSize(frameSize);
            setLocation(200, 0);
            setResizable(false);
            repaint();
            show();
            setVisible(true);
        }
    }

    private void jPasswordField1ActionPerformed(ActionEvent evt) {
    }

    private void butLoginActionPerformed(ActionEvent e) {
        String userName = obLogIn.jTextField1.getText();
        String passward = obLogIn.jPasswordField1.getText();

        //check authentication

        setResizable(true);
        obMenuBarPanel.setEnable(true);
        jPanel1.removeAll();
        jPanel1.add(obToolBar.getToolBar(), BorderLayout.CENTER);
        jPanel2.removeAll();
        jPanel2.add(obLeftPanel.getPanel());
        changingPanel.removeAll();
        changingPanel.add(obStudentPanel.getPanel(), BorderLayout.CENTER);
        show();
        obLogIn.jTextField1.setText(null);
        obLogIn.jPasswordField1.setText(null);

    }

    void loginKeyActions() {
        obLogIn.jTextField1.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    butLoginActionPerformed(null);
                }
            }
        });
        obLogIn.jPasswordField1.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    butLoginActionPerformed(null);
                }
            }
        });
    }
    //****************MenuBar Actions:

    void jmi_subjectcustomActionPerformed(ActionEvent e) {
        //System.out.println("enter");
        subjectCustomize_cb_classActionPerformed(e);
        obSubjectCustomize.setVisible(true);
    }

    void jmi_sectioncustomActionPerformed(ActionEvent e) {
        //System.out.println("enter");
        obSectionCustomize.setVisible(true);
    }

    void jmi_createuserActionPerformed(ActionEvent e) {
        obCreateUser.setVisible(true);
    }
    //**********************internalframes Actions :
    boolean subcus_isnew = false, subcus_isedit = false, subcus_isreplace = false;

    void subjectCustomize_but_newActionPerformed(ActionEvent e) {
        //System.out.println(e);
        if (obSubjectCustomize.list_model.getSize() < 11) {
            obSubjectCustomize.panel_changing.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Add New Subject"));
            obSubjectCustomize.but_done.setText("Save");
            obSubjectCustomize.tf_new.setText(null);
            obSubjectCustomize.tf_new.setEnabled(true);
            obSubjectCustomize.but_done.setEnabled(true);
            obSubjectCustomize.but_edit.setEnabled(false);
            obSubjectCustomize.but_delete.setEnabled(false);

            subcus_isedit = false;
            subcus_isnew = true;
            subcus_isreplace = false;
        } else {
            JOptionPane.showMessageDialog(this, "Number of Subjects is Maximum");
        }
    }

    void subjectCustomize_but_editActionPerformed(ActionEvent e) {
        //System.out.println(e);
        obSubjectCustomize.panel_changing.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Edit Subject"));
        obSubjectCustomize.tf_new.setEnabled(true);
        obSubjectCustomize.but_done.setEnabled(true);
        obSubjectCustomize.but_done.setText("Edit");
        obSubjectCustomize.tf_new.setText((String) obSubjectCustomize.list_subject.getSelectedValue());
        subcus_isedit = true;
        subcus_isnew = false;
        subcus_isreplace = false;
    }

    void subjectCustomize_but_deleteActionPerformed(ActionEvent e) {
        //System.out.println(e);
        String selected_class, selected_sub, selected_subcode;
        int ask = JOptionPane.showConfirmDialog(this, "Confirmation", "Do you want to Submit your result", JOptionPane.YES_NO_OPTION);
        if (ask == 0) {
            selected_class = changeClassString((String) obSubjectCustomize.cb_class.getSelectedItem());
            selected_sub = (String) obSubjectCustomize.list_subject.getSelectedValue();
            selected_subcode = obSelectAndInsertData.getSubCode("select subjectcode from sub_set_" + selected_class + " where subject='" + selected_sub + "'");

            obSelectAndInsertData.deleteTuple("delete from sub_set_" + selected_class + " where subject='" + selected_sub + "'");
            obSelectAndInsertData.deleteTuple("Alter table " + selected_class + " drop(" + selected_subcode + "att)");
            obSelectAndInsertData.deleteTuple("Alter table " + selected_class + " drop(" + selected_subcode + "tt)");
            obSelectAndInsertData.deleteTuple("Alter table " + selected_class + " drop(" + selected_subcode + "sub)");
            if (selected_class.equals("class6") || selected_class.equals("class7") || selected_class.equals("class8")) {
                obSelectAndInsertData.deleteTuple("Alter table " + selected_class + " drop(" + selected_subcode + "obj)");
            }
            obSelectAndInsertData.deleteTuple("Alter table " + selected_class + " drop(" + selected_subcode + "final)");

            obSubjectCustomize.list_model.removeElement(selected_sub);
            obSubjectCustomize.panel_changing.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Customize"));

            getSubByClass();
        }
    }

    void subjectCustomize_but_doneActionPerformed(ActionEvent e) {
        String new_sub, selected_class, new_subCode, selected_sub;
        //System.out.println(e);
        selected_sub = (String) obSubjectCustomize.list_subject.getSelectedValue();
        new_sub = obSubjectCustomize.tf_new.getText();
        new_subCode = changeSubjectString(new_sub);
        selected_class = changeClassString((String) obSubjectCustomize.cb_class.getSelectedItem());
        if (new_sub != null) {
            if (obSubjectCustomize.list_model.getSize() < 11) {
                boolean isSubjectExist = false;
                for (int i = 0; i < 11; i++) {
                    isSubjectExist = new_sub.equals(subByClassArray[obSubjectCustomize.cb_class.getSelectedIndex() - 1][i]);
                    if (isSubjectExist == true) {
                        break;
                    }
                }
                if (isSubjectExist == false) {
                    if (subcus_isnew == true) {
                        obSelectAndInsertData.insertTuple("insert into sub_set_" + selected_class + " values('" + new_sub + "','" + new_subCode + "')");

                        obSelectAndInsertData.insertTuple("alter table " + selected_class + " add(" + new_subCode + "att number)");
                        obSelectAndInsertData.insertTuple("alter table " + selected_class + " add(" + new_subCode + "tt number)");
                        obSelectAndInsertData.insertTuple("alter table " + selected_class + " add(" + new_subCode + "sub number)");
                        if (selected_class.equals("class6") || selected_class.equals("class7") || selected_class.equals("class8")) {
                            obSelectAndInsertData.insertTuple("alter table " + selected_class + " add(" + new_subCode + "obj number)");
                        }
                        obSelectAndInsertData.insertTuple("alter table " + selected_class + " add(" + new_subCode + "final number)");

                        obSubjectCustomize.list_model.addElement(new_sub);
                        obSubjectCustomize.tf_new.setText(null);
                    } else if (subcus_isedit == true) {
                        obSelectAndInsertData.updateTuple("update sub_set_" + selected_class + " set subject='" + new_sub + "' where subject='" + selected_sub + "'");

                        obSubjectCustomize.list_model.add(obSubjectCustomize.list_subject.getSelectedIndex(), new_sub);
                        obSubjectCustomize.list_model.removeElement(selected_sub);
                    }
                    getSubByClass();
                } else {
                    JOptionPane.showMessageDialog(this, "the subject you have entered is exist Now , please Enter a New Name");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Number of Subjects is Maximum");
            }
        } else {
            JOptionPane.showMessageDialog(this, "there is no Entered subject");
        }
    }

    void subjectCustomize_cb_classActionPerformed(ActionEvent e) {
        if (obSubjectCustomize.cb_class.getSelectedIndex() != 0) {
            obSubjectCustomize.but_new.setEnabled(true);

            obSubjectCustomize.list_model.removeAllElements();
            for (int i = 0; i < 11; i++) {
                if (subByClassArray[obSubjectCustomize.cb_class.getSelectedIndex() - 1][i] != null) {
                    obSubjectCustomize.list_model.addElement("" + subByClassArray[obSubjectCustomize.cb_class.getSelectedIndex() - 1][i]);
                }
            }

            obSubjectCustomize.but_edit.setEnabled(false);
            obSubjectCustomize.but_delete.setEnabled(false);
        } else {
            obSubjectCustomize.but_new.setEnabled(false);
            obSubjectCustomize.but_edit.setEnabled(false);
            obSubjectCustomize.but_replace.setEnabled(false);
            obSubjectCustomize.but_delete.setEnabled(false);
        }
    }

    void subjectCustomize_list_subjectMouseClicked(MouseEvent me) {
        obSubjectCustomize.but_edit.setEnabled(true);
        obSubjectCustomize.but_delete.setEnabled(true);
        obSubjectCustomize.tf_new.setEnabled(false);
        obSubjectCustomize.but_done.setEnabled(false);
    }
    //******************************
    boolean seccus_isnew = false, seccus_isedit = false, seccus_isreplace = false;

    void sectionCustomize_but_newActionPerformed(ActionEvent e) {
        if (obSectionCustomize.list_model.getSize() < 8) {
            obSectionCustomize.panel_changing.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Add New Section"));
            obSectionCustomize.but_done.setText("Save");
            obSectionCustomize.tf_new.setText(null);
            obSectionCustomize.tf_new.setEnabled(true);
            obSectionCustomize.but_done.setEnabled(true);
            obSectionCustomize.but_edit.setEnabled(false);
            obSectionCustomize.but_delete.setEnabled(false);

            seccus_isedit = false;
            seccus_isnew = true;
        } else {
            JOptionPane.showMessageDialog(this, "Number of Section is Maximum");
        }
    }

    void sectionCustomize_but_editActionPerformed(ActionEvent e) {
        obSectionCustomize.panel_changing.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Edit Section"));
        obSectionCustomize.tf_new.setEnabled(true);
        obSectionCustomize.but_done.setEnabled(true);
        obSectionCustomize.but_done.setText("Edit");
        obSectionCustomize.tf_new.setText((String) obSectionCustomize.list_section.getSelectedValue());

        seccus_isedit = true;
        seccus_isnew = false;
    }

    void sectionCustomize_but_deleteActionPerformed(ActionEvent e) {
        String selected_class, selected_sec;
        int ask = JOptionPane.showConfirmDialog(this, "Confirmation", "Do you want to Remove this section", JOptionPane.YES_NO_OPTION);
        if (ask == 0) {
            selected_class = changeClassString((String) obSectionCustomize.cb_class.getSelectedItem());
            selected_sec = (String) obSectionCustomize.list_section.getSelectedValue();

            obSelectAndInsertData.deleteTuple("delete from sec_set_" + selected_class + " where section='" + selected_sec + "'");

            obSectionCustomize.list_model.removeElement(selected_sec);
            obSectionCustomize.panel_changing.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Customize"));

            getSecbyClass();
        }
    }

    void sectionCustomize_but_doneActionPerformed(ActionEvent e) {
        String new_sec, selected_class, selected_sec;
        selected_sec = (String) obSectionCustomize.list_section.getSelectedValue();
        new_sec = obSectionCustomize.tf_new.getText();
        selected_class = changeClassString((String) obSectionCustomize.cb_class.getSelectedItem());
        if (new_sec != null) {
            if (obSectionCustomize.list_model.getSize() < 8) {
                boolean isSectionExist = false;
                for (int i = 0; i < 8; i++) {
                    isSectionExist = new_sec.equals(secByClassArray[obSectionCustomize.cb_class.getSelectedIndex() - 1][i]);
                    if (isSectionExist == true) {
                        break;
                    }
                }
                if (isSectionExist == false) {
                    if (seccus_isnew == true) {
                        obSelectAndInsertData.insertTuple("insert into sec_set_" + selected_class + " values('" + new_sec + "')");

                        obSectionCustomize.list_model.addElement(new_sec);
                        obSectionCustomize.tf_new.setText(null);
                    } else if (seccus_isedit == true) {
                        obSelectAndInsertData.updateTuple("update sec_set_" + selected_class + " set section='" + new_sec + "' where section='" + selected_sec + "'");

                        obSectionCustomize.list_model.add(obSectionCustomize.list_section.getSelectedIndex(), new_sec);
                        obSectionCustomize.list_model.removeElement(selected_sec);
                    }
                    getSecbyClass();
                } else {
                    JOptionPane.showMessageDialog(this, "the Section you have entered is exist Now , please Enter a New Name");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Number of Section is Maximum");
            }
        } else {
            JOptionPane.showMessageDialog(this, "there is no Entered Section");
        }
    }

    void sectionCustomize_cb_classActionPerformed(ActionEvent e) {
        if (obSectionCustomize.cb_class.getSelectedIndex() != 0) {
            obSectionCustomize.but_new.setEnabled(true);

            obSectionCustomize.list_model.removeAllElements();
            for (int i = 0; i < 8; i++) {
                if (secByClassArray[obSectionCustomize.cb_class.getSelectedIndex() - 1][i] != null) {
                    obSectionCustomize.list_model.addElement("" + secByClassArray[obSectionCustomize.cb_class.getSelectedIndex() - 1][i]);
                }
            }

            obSectionCustomize.but_edit.setEnabled(false);
            obSectionCustomize.but_delete.setEnabled(false);
        } else {
            obSectionCustomize.but_new.setEnabled(false);
            obSectionCustomize.but_edit.setEnabled(false);
            obSectionCustomize.but_delete.setEnabled(false);
        }
    }

    void sectionCustomize_list_sectionMouseClicked(MouseEvent me) {
        obSectionCustomize.but_edit.setEnabled(true);
        obSectionCustomize.but_delete.setEnabled(true);
        obSectionCustomize.tf_new.setEnabled(false);
        obSectionCustomize.but_done.setEnabled(false);
    }
    //*************Buttons Panel Actions	

    private void but_studentActionPerformed(ActionEvent evt) {
        obLeftPanel.but_teacher.setBackground(Color.WHITE);              //##
        obLeftPanel.but_teacher.setForeground(new Color(0, 153, 255));   //##
        obLeftPanel.but_operator.setBackground(Color.WHITE);              //##
        obLeftPanel.but_operator.setForeground(new Color(0, 153, 255));
        obLeftPanel.but_student.setBackground(new Color(0, 153, 255)); //##
        obLeftPanel.but_student.setForeground(Color.WHITE);            //##

        changingPanel.removeAll();
        changingPanel.add(obStudentPanel.getPanel(), BorderLayout.CENTER);
        changingPanel.repaint();
        show();
    }

    private void but_teacherActionPerformed(ActionEvent evt) {
        obLeftPanel.but_student.setBackground(Color.WHITE);              //##
        obLeftPanel.but_student.setForeground(new Color(0, 153, 255));   //##
        obLeftPanel.but_operator.setBackground(Color.WHITE);              //##
        obLeftPanel.but_operator.setForeground(new Color(0, 153, 255));
        obLeftPanel.but_teacher.setBackground(new Color(0, 153, 255)); //##
        obLeftPanel.but_teacher.setForeground(Color.WHITE);

        changingPanel.removeAll();
        changingPanel.add(obTeacherPanel.getPanel(), BorderLayout.CENTER);
        changingPanel.repaint();
        show();
    }

    private void but_operatorActionPerformed(ActionEvent evt) {
        obLeftPanel.but_teacher.setBackground(Color.WHITE);              //##
        obLeftPanel.but_teacher.setForeground(new Color(0, 153, 255));   //##
        obLeftPanel.but_student.setBackground(Color.WHITE);              //##
        obLeftPanel.but_student.setForeground(new Color(0, 153, 255));
        obLeftPanel.but_operator.setBackground(new Color(0, 153, 255)); //##
        obLeftPanel.but_operator.setForeground(Color.WHITE);

        changingPanel.removeAll();
        changingPanel.add(obOperatorPanel.getPanel(), BorderLayout.CENTER);
        changingPanel.repaint();
        show();
    }
    //********************* advance Search actions :

    private void studentFilterbut_searchActionPerformed(ActionEvent evt) {
        int finalArray[] = new int[5000];
        String basicInfo[] = new String[7];
        int i = 0;
        int flag = 0;
        int counter1 = 0, counter2 = 0, counter = 0;
        String name = obLeftPanel.obAdvanceSearchPanel.obStudentFilter.tf_name.getText();
        String std_class = (String) obLeftPanel.obAdvanceSearchPanel.obStudentFilter.cb_class.getSelectedItem();
        int Roll = 0;
        String a_Roll = (String) obLeftPanel.obAdvanceSearchPanel.obStudentFilter.tf_roll.getText();
        if (a_Roll.equals("Search By Roll no")); else {
            if (a_Roll.equals("")) {
                Roll = 0;
            } else {
                Roll = Integer.parseInt((String) obLeftPanel.obAdvanceSearchPanel.obStudentFilter.tf_roll.getText());
            }
        }

        obStudentPanel.jTabbedPane1.setSelectedIndex(2);
        obStudentPanel.searchingPanel.removeAll();

        if (name.equals("") || name.equals("Search By Name")) {
            counter = 1;
            //System.out.print(counter);
        }

        if (Roll == 0) {
            counter1 = 1;
        }

        if (std_class.equals("Class")) {
            counter2 = 1;
        }

        if (counter1 == 0 && counter2 == 0) {
            finalArray = obSelectAndInsertData.searchArraySPname(name, std_class, Roll);
            Roll = 0;
            System.out.print(Roll);
        } else if (counter1 == 1 && counter2 == 0) {
            finalArray = obSelectAndInsertData.searchArraySPname(name, std_class);
            counter1 = 0;
            Roll = 0;
            //System.out.print(std_class);
        } else if (counter1 == 1 && counter2 == 1) {
            finalArray = obSelectAndInsertData.searchArraySPname(name);
            counter1 = 0;
            counter2 = 0;
            Roll = 0;
        } else if (counter == 1 && counter1 == 0 && counter2 == 1) {
            finalArray = obSelectAndInsertData.searchArraySPname(Roll);
            counter1 = 0;
            counter2 = 0;
            Roll = 0;
            System.out.print(counter + " " + counter1 + " " + counter2);
            flag = 1;
        } else if (counter1 == 0 && counter2 == 1) {
            if (flag != 1) {
                finalArray = obSelectAndInsertData.searchArraySPname(name, Roll);
                counter1 = 0;
                counter2 = 0;
                Roll = 0;
            } else {
                flag = 0;
            }
        }

        int resultFound = obSelectAndInsertData.getSearchResultFound();
        //JOptionPane.showConfirmDialog(null,name);

        obStudentPanel.searchingPanel.setLayout(new GridLayout(resultFound, 1));
        obSearchResultViewer = new SearchResultViewer[resultFound];

        while (finalArray[i] != 0) {
            //System.out.print(finalArray[i]);
            basicInfo = obSelectAndInsertData.getBasicInfo(finalArray[i]);
            obSearchResultViewer[i] = new SearchResultViewer();
            obStudentPanel.searchingPanel.add(obSearchResultViewer[i]);

            obSearchResultViewer[i].showName.setText(basicInfo[0]);
            obSearchResultViewer[i].showID.setText(basicInfo[1]);
            obSearchResultViewer[i].showRoll.setText(basicInfo[2]);
            obSearchResultViewer[i].showClass.setText(basicInfo[3]);
            obSearchResultViewer[i].showSession.setText(basicInfo[4]);
            obSearchResultViewer[i].showContact.setText(basicInfo[5]);

            obSearchResultViewer[i].showImage.setIcon(new ImageIcon("img\\upload.gif"));
            i++;
            final int tempid = Integer.parseInt(basicInfo[1]);
            obSearchResultViewer[i - 1].but_info.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    obStudentPanel.jTabbedPane1.setSelectedIndex(0);

                    obStudentPanel.obProfiles.setData(obSelectAndInsertData.getTuple(tempid));
                    obStudentPanel.obProfiles.setShowProfile();
                    repaint();
                    show();
                }
            });
            obSearchResultViewer[i - 1].but_result.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                }
            });
            obSearchResultViewer[i - 1].but_others.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                }
            });
        }
        obStudentPanel.jPanel8.add(new JScrollPane(obStudentPanel.searchingPanel), BorderLayout.CENTER);
        obStudentPanel.jPanel8.setBackground(Color.white);
        obStudentPanel.searchingPanel.setBackground(Color.white);
        //obStudentPanel.searchingPanel.show();
        setVisible(true);
        repaint();
        show();
    }

    void AdvanceSearchPanelKeyBoardActions() {
        obLeftPanel.obAdvanceSearchPanel.obStudentFilter.tf_name.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    studentFilterbut_searchActionPerformed(null);
                }
            }
        });
        obLeftPanel.obAdvanceSearchPanel.obStudentFilter.tf_roll.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    studentFilterbut_searchActionPerformed(null);
                }
            }
        });
    }
    //*************ObViewinfo's Actions :
    //**************Regform's Actions :
    //**************ShowForm's Actions
    //*************************InputResultForm :
    //********************************Forms Actions:
    boolean isEditprofile = false, isRegForm = true, isStudentProfile = false, isSectionChanging = false, isClassChanging = false;
    String[] temp_singleDataArray = new String[18];

    void form_tbl_formMouseClicked(MouseEvent me) {
        try {
            obSelectAndInsertData.result.absolute(obStudentPanel.obProfiles.tbl_form.getSelectedRow() + 1);
            for (int i = 0; i < 17; i++) {
                temp_singleDataArray[i] = obSelectAndInsertData.result.getString(i + 1);
            }
        } catch (java.sql.SQLException sqle) {
            System.out.println(sqle);
            sqle.printStackTrace();
        }
        if (isRegForm == true) {
            obStudentPanel.obProfiles.setData(temp_singleDataArray);
        } else {
            if (isEditprofile == true) {
                obStudentPanel.obProfiles.setDataRegform(temp_singleDataArray);
                obStudentPanel.obProfiles.setRegForm();
            } else {
                obStudentPanel.obProfiles.setData(temp_singleDataArray);
                obStudentPanel.obProfiles.setShowProfile();
            }

            obStudentPanel.obProfiles.but_deleteStudent.setEnabled(true);
            obStudentPanel.obProfiles.but_result.setEnabled(true);
            obStudentPanel.obProfiles.but_editStudent.setEnabled(true);

            setVisible(true);
        }
    }

    void form_cb_selectClassActionPerformed(ActionEvent e) {
        if (isClassChanging == false) {
            form_but_profileActionPerformed(null);
            obStudentPanel.obProfiles.cb_selectSection.setEnabled(true);
            obStudentPanel.obProfiles.cb_selectSession.setEnabled(true);
            obStudentPanel.obProfiles.tf_selectRoll.setEnabled(true);
            obStudentPanel.obProfiles.but_go.setEnabled(true);
            obStudentPanel.obProfiles.but_deleteStudent.setEnabled(false);
            obStudentPanel.obProfiles.but_editStudent.setEnabled(false);

            isSectionChanging = true;
            obStudentPanel.obProfiles.cb_selectSection.removeAllItems();
            obStudentPanel.obProfiles.cb_selectSection.addItem("Select Section");
            for (int j = 0; j < 8; j++) {
                if (obStudentPanel.obProfiles.cb_selectClass.getSelectedIndex() != 0 && secByClassArray[obStudentPanel.obProfiles.cb_selectClass.getSelectedIndex() - 1][j] != null) {
                    obStudentPanel.obProfiles.cb_selectSection.addItem(secByClassArray[obStudentPanel.obProfiles.cb_selectClass.getSelectedIndex() - 1][j]);
                }
            }

            resetValuonTable((String) obStudentPanel.obProfiles.cb_selectClass.getSelectedItem(),
                    (String) obStudentPanel.obProfiles.cb_selectSection.getSelectedItem(),
                    (String) obStudentPanel.obProfiles.cb_selectSession.getSelectedItem());
            obStudentPanel.obProfiles.clearallProfilesInfo();
        }
    }

    void form_cb_selectSectionActionPerformed(ActionEvent e) {
        if (isSectionChanging == false) {
            resetValuonTable((String) obStudentPanel.obProfiles.cb_selectClass.getSelectedItem(),
                    (String) obStudentPanel.obProfiles.cb_selectSection.getSelectedItem(),
                    (String) obStudentPanel.obProfiles.cb_selectSession.getSelectedItem());
        }
        isSectionChanging = false;
    }

    void form_cb_selectSessionActionPerformed(ActionEvent e) {
        resetValuonTable((String) obStudentPanel.obProfiles.cb_selectClass.getSelectedItem(),
                (String) obStudentPanel.obProfiles.cb_selectSection.getSelectedItem(),
                (String) obStudentPanel.obProfiles.cb_selectSession.getSelectedItem());
    }

    void form_but_goActionPerformed(ActionEvent e) {
        String[][] temp_dataArray;
        int numberOfRow = 0;
        Object[] temp_object = new Object[3];

        try {
            if (obStudentPanel.obProfiles.cb_selectClass.getSelectedIndex() == 0) {
                temp_dataArray = obSelectAndInsertData.getTuples("select * from std_info where roll=" + Integer.parseInt(obStudentPanel.obProfiles.tf_selectRoll.getText()));
            } else {
                temp_dataArray = obSelectAndInsertData.getTuples("select * from std_info where stdclass='"
                        + (String) obStudentPanel.obProfiles.cb_selectClass.getSelectedItem()
                        + "' and roll=" + Integer.parseInt(obStudentPanel.obProfiles.tf_selectRoll.getText()));
            }

            numberOfRow = obStudentPanel.obProfiles.tbl_model.getRowCount();
            for (int i = 0; i < numberOfRow; i++) {
                obStudentPanel.obProfiles.tbl_model.removeRow(0);
            }
            numberOfRow = temp_dataArray.length;
            for (int i = 0; i < numberOfRow; i++) {
                temp_object[0] = temp_dataArray[i][4];
                temp_object[1] = temp_dataArray[i][5];
                temp_object[2] = temp_dataArray[i][1];

                obStudentPanel.obProfiles.tbl_model.insertRow(i, temp_object);
            }
            obStudentPanel.obProfiles.clearallProfilesInfo();
        } catch (NumberFormatException nme) {
            JOptionPane.showMessageDialog(this, "U must insert a  roll number", "Error !!!", JOptionPane.ERROR_MESSAGE);
            obStudentPanel.obProfiles.tf_selectRoll.setText(null);
        }
    }

    void form_but_addstudentActionPerformed(ActionEvent evt) {
        obStudentPanel.obProfiles.obRegForm.but_add.setIcon(new ImageIcon("img\\but_addStudent.gif"));
        if (isRegForm == false) {
            int tl = 0;
            obStudentPanel.obProfiles.clearall();

            tl = obStudentPanel.obProfiles.tbl_model.getRowCount();
            for (int i = 0; i < tl; i++) {
                obStudentPanel.obProfiles.tbl_model.removeRow(0);
            }

            lid = obSelectAndInsertData.getidvalue();
            obStudentPanel.obProfiles.obRegForm.tf_id.setText("" + lid);

            obStudentPanel.obProfiles.cb_selectClass.setSelectedIndex(0);
            obStudentPanel.obProfiles.but_deleteStudent.setEnabled(false);
            obStudentPanel.obProfiles.but_result.setEnabled(false);
            obStudentPanel.obProfiles.but_editStudent.setEnabled(false);
            obStudentPanel.obProfiles.cb_selectSection.setEnabled(false);
            obStudentPanel.obProfiles.cb_selectSession.setEnabled(false);
            //obStudentPanel.obProfiles.cb_selectClass.setEnabled(false);
            obStudentPanel.obProfiles.tf_selectRoll.setEnabled(false);
            obStudentPanel.obProfiles.but_go.setEnabled(false);

            obStudentPanel.obProfiles.setRegForm();
            setVisible(true);
            isRegForm = true;
            isStudentProfile = false;
        }
    }

    void form_but_resultActionPerformed(ActionEvent evt) {
        String subjects[] = new String[11];
        String subjectsCode[] = new String[11];
        int[] subjectmarks = new int[4];
        int subjectfinalmarks = 0;
        int totalmarks1 = 0, totalmarks2 = 0, totalmarks3 = 0;
        String stdClass = changeClassString(obStudentPanel.obProfiles.obShowProfile.lb_class.getText());
        int selectedid = Integer.parseInt(obStudentPanel.obProfiles.obShowProfile.lb_id.getText());
        int count = 3;
        String query = "";

        obStudentPanel.jPanel7.removeAll();
        obStudentPanel.jPanel7.add(obStudentPanel.obProfiles.obMarkSheet.getPanel(), BorderLayout.CENTER);
        if (obStudentPanel.obProfiles.cb_selectClass.getSelectedIndex() != 0) {
            obStudentPanel.obProfiles.obMarkSheet.lb_name.setText(temp_singleDataArray[1]);
            obStudentPanel.obProfiles.obMarkSheet.lb_class.setText(temp_singleDataArray[3]);
            obStudentPanel.obProfiles.obMarkSheet.lb_section.setText(temp_singleDataArray[4]);
            obStudentPanel.obProfiles.obMarkSheet.lb_roll.setText(temp_singleDataArray[5]);
            obStudentPanel.obProfiles.obMarkSheet.lb_session.setText(temp_singleDataArray[6]);
            for (int i = 0; i < 11; i++) {
                if (subByClassArray[obStudentPanel.obProfiles.cb_selectClass.getSelectedIndex() - 1][i] != null) {
                    subjects[i] = subByClassArray[obStudentPanel.obProfiles.cb_selectClass.getSelectedIndex() - 1][i];
                    subjectsCode[i] = subCodeByClassArray[obStudentPanel.obProfiles.cb_selectClass.getSelectedIndex() - 1][i];
                    obStudentPanel.obProfiles.obMarkSheet.tbl_subject.setValueAt(subjects[i], i, 0);

                    if (obStudentPanel.obProfiles.cb_selectClass.getSelectedIndex() < 6) {
                        count = 3;
                        query = "select " + subjectsCode[i] + "att," + subjectsCode[i] + "tt," + subjectsCode[i] + "sub from " + stdClass + " where id=" + selectedid + " and semester=";
                    } else if (obStudentPanel.obProfiles.cb_selectClass.getSelectedIndex() > 5) {
                        count = 4;
                        query = "select " + subjectsCode[i] + "att," + subjectsCode[i] + "tt," + subjectsCode[i] + "sub," + subjectsCode[i] + "obj from " + stdClass + " where id=" + selectedid + " and semester=";
                    }
                    subjectmarks = obSelectAndInsertData.getSubjectMarks(count, query + 1);
                    for (int m = 0; m < count; m++) {
                        try {
                            obStudentPanel.obProfiles.obMarkSheet.tbl_semester1.setValueAt("" + subjectmarks[m], i, m + 1);
                        } catch (ArrayIndexOutOfBoundsException aioobe) {
                            obStudentPanel.obProfiles.obMarkSheet.tbl_semester1.setValueAt(null, i, m + 1);
                            aioobe.printStackTrace();
                        }
                    }
                    try {
                        subjectfinalmarks = subjectmarks[0] + subjectmarks[1] + subjectmarks[2] + subjectmarks[3];
                    } catch (ArrayIndexOutOfBoundsException ae) {
                        subjectfinalmarks = subjectmarks[0] + subjectmarks[1] + subjectmarks[2];
                        ae.printStackTrace();
                    }
                    obStudentPanel.obProfiles.obMarkSheet.tbl_semester1.setValueAt("" + subjectfinalmarks, i, 5);
                    obStudentPanel.obProfiles.obMarkSheet.tbl_semester1.setValueAt(getGrade(subjectfinalmarks), i, 6);

                    totalmarks1 = totalmarks1 + subjectfinalmarks;

                    subjectmarks = obSelectAndInsertData.getSubjectMarks(count, query + 2);
                    for (int m = 0; m < count; m++) {
                        try {
                            obStudentPanel.obProfiles.obMarkSheet.tbl_semester2.setValueAt("" + subjectmarks[m], i, m + 1);
                        } catch (ArrayIndexOutOfBoundsException aioobe) {
                            obStudentPanel.obProfiles.obMarkSheet.tbl_semester2.setValueAt(null, i, m + 1);
                            aioobe.printStackTrace();
                        }

                    }
                    try {
                        subjectfinalmarks = subjectmarks[0] + subjectmarks[1] + subjectmarks[2] + subjectmarks[3];
                    } catch (ArrayIndexOutOfBoundsException ae) {
                        subjectfinalmarks = subjectmarks[0] + subjectmarks[1] + subjectmarks[2];
                        ae.printStackTrace();
                    }
                    obStudentPanel.obProfiles.obMarkSheet.tbl_semester2.setValueAt("" + subjectfinalmarks, i, 5);
                    obStudentPanel.obProfiles.obMarkSheet.tbl_semester2.setValueAt(getGrade(subjectfinalmarks), i, 6);

                    totalmarks2 = totalmarks2 + subjectfinalmarks;

                    subjectmarks = obSelectAndInsertData.getSubjectMarks(count, query + 3);
                    for (int m = 0; m < count; m++) {
                        try {
                            obStudentPanel.obProfiles.obMarkSheet.tbl_semester3.setValueAt("" + subjectmarks[m], i, m + 1);
                        } catch (ArrayIndexOutOfBoundsException aioobe) {
                            obStudentPanel.obProfiles.obMarkSheet.tbl_semester3.setValueAt("" + subjectmarks[m], i, m + 1);
                        }
                    }
                    try {
                        subjectfinalmarks = subjectmarks[0] + subjectmarks[1] + subjectmarks[2] + subjectmarks[3];
                    } catch (ArrayIndexOutOfBoundsException ae) {
                        subjectfinalmarks = subjectmarks[0] + subjectmarks[1] + subjectmarks[2];
                        ae.printStackTrace();
                    }
                    obStudentPanel.obProfiles.obMarkSheet.tbl_semester3.setValueAt("" + subjectfinalmarks, i, 5);
                    obStudentPanel.obProfiles.obMarkSheet.tbl_semester3.setValueAt(getGrade(subjectfinalmarks), i, 6);

                    totalmarks3 = totalmarks3 + subjectfinalmarks;

                    obStudentPanel.obProfiles.obMarkSheet.tbl_subject.setValueAt("100", i, 1);

                }
            }
            obStudentPanel.obProfiles.obMarkSheet.tbl_subject.setValueAt("Total Mark", 11, 0);
            obStudentPanel.obProfiles.obMarkSheet.tbl_subject.setValueAt("Position", 12, 0);

            obStudentPanel.obProfiles.obMarkSheet.tbl_semester1.setValueAt("" + totalmarks1, 11, 5);
            obStudentPanel.obProfiles.obMarkSheet.tbl_semester2.setValueAt("" + totalmarks2, 11, 5);
            obStudentPanel.obProfiles.obMarkSheet.tbl_semester3.setValueAt("" + totalmarks3, 11, 5);
        }
        show();
    }

    void form_but_editActionPerformed(ActionEvent evt) {
        if (isEditprofile == false) {
            obStudentPanel.obProfiles.obRegForm.but_add.setIcon(new ImageIcon("img\\edit.gif"));
            String[] temp_dataArray = new String[18];
            try {
                for (int i = 0; i < 18; i++) {
                    temp_dataArray[i] = obSelectAndInsertData.result.getString(i + 1);
                }

                obStudentPanel.obProfiles.setDataRegform(temp_dataArray);
                obStudentPanel.obProfiles.setRegForm();
                obStudentPanel.obProfiles.but_deleteStudent.setEnabled(false);

                setVisible(true);
                isEditprofile = true;
            } catch (java.sql.SQLException sqle) {
                System.out.println("but_edit error");
                System.out.println(sqle);
            }

            isStudentProfile = false;
        }
    }

    void form_but_deleteActionPerformed(ActionEvent evt) {
        int cursor = 0;
        try {
            obSelectAndInsertData.deleteSingleTuple(obSelectAndInsertData.result.getInt(1));
            obSelectAndInsertData.deleteSingleTuple(obSelectAndInsertData.result.getInt(1), changeClassString(obSelectAndInsertData.result.getString(4)));
            cursor = obSelectAndInsertData.result.getRow();
            obSelectAndInsertData.result.absolute(cursor);
        } catch (java.sql.SQLException sqle) {
            try {
                obSelectAndInsertData.result.first();
            } catch (java.sql.SQLException sqle2) {
                JOptionPane.showMessageDialog(this, "no more student inthis class");
                System.out.println("Showform catch in delete button error");
            }
        }

        if (isEditprofile == true) {
            obStudentPanel.obProfiles.clearall();
            obStudentPanel.obProfiles.setShowProfile();
        }

        obStudentPanel.obProfiles.clearallProfilesInfo();
        resetValuonTable((String) obStudentPanel.obProfiles.cb_selectClass.getSelectedItem(),
                (String) obStudentPanel.obProfiles.cb_selectSection.getSelectedItem(),
                (String) obStudentPanel.obProfiles.cb_selectSession.getSelectedItem());
    }

    void form_but_addActionPerformed(ActionEvent evt) {
        if ("".equals(obStudentPanel.obProfiles.obRegForm.tf_name.getText()) || obStudentPanel.obProfiles.obRegForm.tf_name.getText() == null || (obStudentPanel.obProfiles.obRegForm.cb_class.getSelectedIndex() == 0) || (obStudentPanel.obProfiles.obRegForm.cb_section.getSelectedIndex() == 0)
                || "".equals(obStudentPanel.obProfiles.obRegForm.tf_roll.getText()) || obStudentPanel.obProfiles.obRegForm.tf_roll.getText() == null || (obStudentPanel.obProfiles.obRegForm.cb_session.getSelectedIndex() == 0)) {
            JOptionPane.showMessageDialog(this, "you must fillup the " + "*" + "marked fields", "Error!!!", JOptionPane.ERROR_MESSAGE);
            if ("".equals(obStudentPanel.obProfiles.obRegForm.tf_name.getText()) || obStudentPanel.obProfiles.obRegForm.tf_name.getText() == null) {
                obStudentPanel.obProfiles.obRegForm.jLabel3.setForeground(new Color(255, 153, 0));
            } else {
                obStudentPanel.obProfiles.obRegForm.jLabel3.setForeground(new Color(0, 0, 0));
            }
            if (obStudentPanel.obProfiles.obRegForm.cb_class.getSelectedIndex() == 0) {
                obStudentPanel.obProfiles.obRegForm.jLabel5.setForeground(new Color(255, 153, 0));
            } else {
                obStudentPanel.obProfiles.obRegForm.jLabel5.setForeground(new Color(0, 0, 0));
            }
            if (obStudentPanel.obProfiles.obRegForm.cb_section.getSelectedIndex() == 0) {
                obStudentPanel.obProfiles.obRegForm.jLabel6.setForeground(new Color(255, 153, 0));
            } else {
                obStudentPanel.obProfiles.obRegForm.jLabel6.setForeground(new Color(0, 0, 0));
            }
            if ("".equals(obStudentPanel.obProfiles.obRegForm.tf_roll.getText()) || obStudentPanel.obProfiles.obRegForm.tf_roll.getText() == null) {
                obStudentPanel.obProfiles.obRegForm.jLabel7.setForeground(new Color(255, 153, 0));
            } else {
                obStudentPanel.obProfiles.obRegForm.jLabel7.setForeground(new Color(0, 0, 0));
            }
            if (obStudentPanel.obProfiles.obRegForm.cb_session.getSelectedIndex() == 0) {
                obStudentPanel.obProfiles.obRegForm.lbl_session.setForeground(new Color(255, 153, 0));
            } else {
                obStudentPanel.obProfiles.obRegForm.lbl_session.setForeground(new Color(0, 0, 0));
            }
        } else {
            try {
                obStudentPanel.obProfiles.collectdata();

                if (isEditprofile == false) {
                    obSelectAndInsertData.insertTuple("insert into std_info values(" + obStudentPanel.obProfiles.id + ",'" + obStudentPanel.obProfiles.name + "','" + obStudentPanel.obProfiles.nickName + "','"
                            + obStudentPanel.obProfiles.stdClass + "','" + obStudentPanel.obProfiles.section + "'," + obStudentPanel.obProfiles.roll + "," + obStudentPanel.obProfiles.sessionyear + ",'" + obStudentPanel.obProfiles.father + "','"
                            + obStudentPanel.obProfiles.mother + "','" + obStudentPanel.obProfiles.birthday + "','" + obStudentPanel.obProfiles.gender + "','" + obStudentPanel.obProfiles.religion + "','" + obStudentPanel.obProfiles.contact + "','" + obStudentPanel.obProfiles.current_add
                            + "','" + obStudentPanel.obProfiles.home_add + "','" + obStudentPanel.obProfiles.prevSchool + "','" + obStudentPanel.obProfiles.note + "','null')");
                    for (int i = 1; i < 4; i++) {
                        obSelectAndInsertData.insertTuple("insert into " + changeClassString(obStudentPanel.obProfiles.stdClass)
                                + "(id,roll,section,year,semester) values(" + obStudentPanel.obProfiles.id + "," + obStudentPanel.obProfiles.roll + ",'"
                                + obStudentPanel.obProfiles.section + "'," + obStudentPanel.obProfiles.sessionyear + "," + i + ")");
                    }

                    obSelectAndInsertData.updateLastid(obStudentPanel.obProfiles.id);
                    obStudentPanel.obProfiles.obRegForm.tf_id.setText("" + (obStudentPanel.obProfiles.id + 1));
                    obStudentPanel.obProfiles.clearall();
                    resetValuonTable(obStudentPanel.obProfiles.stdClass, obStudentPanel.obProfiles.section, "" + obStudentPanel.obProfiles.sessionyear);
                } else {
                    obStudentPanel.obProfiles.collectdata();
                    obSelectAndInsertData.updateTuple("update std_info set name='" + obStudentPanel.obProfiles.name
                            + "',nickname='" + obStudentPanel.obProfiles.nickName + "',stdclass='" + obStudentPanel.obProfiles.stdClass
                            + "',section='" + obStudentPanel.obProfiles.section + "',roll=" + obStudentPanel.obProfiles.roll + ",sessionyear="
                            + obStudentPanel.obProfiles.sessionyear + ",father='" + obStudentPanel.obProfiles.father + "',mother='"
                            + obStudentPanel.obProfiles.mother + "',birthday='" + obStudentPanel.obProfiles.birthday + "',gender='"
                            + obStudentPanel.obProfiles.gender + "',religion='" + obStudentPanel.obProfiles.religion + "',current_add='"
                            + obStudentPanel.obProfiles.current_add + "',home_add='" + obStudentPanel.obProfiles.home_add + "',contact='"
                            + obStudentPanel.obProfiles.contact + "',prev_school='" + obStudentPanel.obProfiles.prevSchool + "',note='"
                            + obStudentPanel.obProfiles.obRegForm.tp_note.getText() + "' where id=" + obStudentPanel.obProfiles.id);

                    obStudentPanel.obProfiles.clearall();
                    obStudentPanel.obProfiles.obRegForm.but_add.setText("Add");
                    obStudentPanel.obProfiles.setShowProfile();
                    obStudentPanel.obProfiles.setData(obStudentPanel.obProfiles.getSingleDataArray());
                    obStudentPanel.obProfiles.but_deleteStudent.setEnabled(true);

                    resetValuonTable((String) obStudentPanel.obProfiles.cb_selectClass.getSelectedItem(),
                            (String) obStudentPanel.obProfiles.cb_selectSection.getSelectedItem(),
                            (String) obStudentPanel.obProfiles.cb_selectSession.getSelectedItem());
                    setVisible(true);

                    isEditprofile = false;
                }
                obStudentPanel.obProfiles.obRegForm.jLabel3.setForeground(new Color(0, 0, 0));
                obStudentPanel.obProfiles.obRegForm.jLabel5.setForeground(new Color(0, 0, 0));
                obStudentPanel.obProfiles.obRegForm.jLabel6.setForeground(new Color(0, 0, 0));
                obStudentPanel.obProfiles.obRegForm.jLabel7.setForeground(new Color(0, 0, 0));
                obStudentPanel.obProfiles.obRegForm.lbl_session.setForeground(new Color(0, 0, 0));
            } catch (NumberFormatException nume) {
                JOptionPane.showMessageDialog(this, "you must insert number in the roll field", "Error!!!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    void form_but_profileActionPerformed(ActionEvent e) {
        if (isStudentProfile == false) {
            //obStudentPanel.obProfiles.cb_selectClass.setEnabled(true);
            obStudentPanel.obProfiles.tf_selectRoll.setEnabled(true);
            obStudentPanel.obProfiles.but_go.setEnabled(true);
            obStudentPanel.obProfiles.but_editStudent.setEnabled(false);
            obStudentPanel.obProfiles.setShowProfile();

            setVisible(true);

            isRegForm = false;
            isStudentProfile = true;
            isEditprofile = false;
        }
    }

    void form_cb_classActionPerformed(ActionEvent e) {
        isSectionChanging = true;
        obStudentPanel.obProfiles.obRegForm.cb_section.removeAllItems();
        obStudentPanel.obProfiles.obRegForm.cb_section.addItem("Select Section");
        for (int j = 0; j < 8; j++) {
            if (obStudentPanel.obProfiles.obRegForm.cb_class.getSelectedIndex() != 0 && secByClassArray[obStudentPanel.obProfiles.obRegForm.cb_class.getSelectedIndex() - 1][j] != null) {
                obStudentPanel.obProfiles.obRegForm.cb_section.addItem(secByClassArray[obStudentPanel.obProfiles.obRegForm.cb_class.getSelectedIndex() - 1][j]);
            }
        }

        if (isEditprofile == false) {
            if (obStudentPanel.obProfiles.obRegForm.cb_class.getSelectedIndex() == 0); else {
                resetValuonTable((String) obStudentPanel.obProfiles.obRegForm.cb_class.getSelectedItem(),
                        (String) obStudentPanel.obProfiles.obRegForm.cb_section.getSelectedItem(),
                        (String) obStudentPanel.obProfiles.obRegForm.cb_session.getSelectedItem());

                isClassChanging = true;
                obStudentPanel.obProfiles.cb_selectClass.setSelectedItem(obStudentPanel.obProfiles.obRegForm.cb_class.getSelectedItem());
                isClassChanging = false;
            }
        }
    }

    void form_cb_sectionActionPerformed(ActionEvent e) {
        if (isEditprofile == false && isSectionChanging == false) {
            if (obStudentPanel.obProfiles.obRegForm.cb_class.getSelectedIndex() == 0); else {
                resetValuonTable((String) obStudentPanel.obProfiles.obRegForm.cb_class.getSelectedItem(),
                        (String) obStudentPanel.obProfiles.obRegForm.cb_section.getSelectedItem(),
                        (String) obStudentPanel.obProfiles.obRegForm.cb_session.getSelectedItem());
            }
        }
        isSectionChanging = false;
    }

    void resetValuonTable(String selectedClass,
            String selectedSection,
            String selectedSession) {
        String[][] temp_dataArray;
        int dl, tl;
        Object[] temp_obj = new Object[3];

        if ("Class".equals(selectedClass)); //javax.swing.JOptionPane.showMessageDialog(this,"Class Selection Needed","Information!!!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        else {
            temp_dataArray = obSelectAndInsertData.getTuples(selectedClass, selectedSection, selectedSession);

            dl = temp_dataArray.length;
            tl = obStudentPanel.obProfiles.tbl_model.getRowCount();
            for (int i = 0; i < tl; i++) {
                obStudentPanel.obProfiles.tbl_model.removeRow(0);
            }

            for (int i = 0; i < dl; i++) {
                //obStudentPanel.obProfiles.tbl_form.setValueAt(temp_dataArray[i][5],i,0);
                //obStudentPanel.obProfiles.tbl_form.setValueAt(temp_dataArray[i][1],i,1);
                //obStudentPanel.obProfiles.tbl_form.setValueAt(temp_dataArray[i][4],i,2);
                temp_obj[0] = temp_dataArray[i][4];
                temp_obj[1] = temp_dataArray[i][5];
                temp_obj[2] = temp_dataArray[i][1];
                obStudentPanel.obProfiles.tbl_model.insertRow(i, temp_obj);
            }
        }
    }

    void form_backActionPerformed(ActionEvent e) {
        obStudentPanel.jPanel7.removeAll();
        obStudentPanel.jPanel7.add(obStudentPanel.obProfiles, BorderLayout.CENTER);
        repaint();
        show();
    }

    void form_tf_rollKeyPressed(KeyEvent ke) {
        //System.out.println(ke.getKeyCode());
    }

    String getGrade(int mark) {
        String grade = "";
        if (mark >= 80 && mark < 100) {
            grade = "A+";
        } else if (mark >= 70 && mark < 80) {
            grade = "A";
        } else if (mark >= 60 && mark < 70) {
            grade = "A-";
        } else if (mark >= 50 && mark < 60) {
            grade = "B";
        } else if (mark >= 40 && mark < 50) {
            grade = "C";
        } else {
            grade = "F";
        }
        return grade;
    }

    public void formsKeyboardActions() {
        obStudentPanel.obProfiles.obRegForm.tf_name.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        obStudentPanel.obProfiles.obRegForm.tf_nickName.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        obStudentPanel.obProfiles.obRegForm.cb_class.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        obStudentPanel.obProfiles.obRegForm.cb_section.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        obStudentPanel.obProfiles.obRegForm.tf_roll.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        obStudentPanel.obProfiles.obRegForm.cb_session.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        obStudentPanel.obProfiles.obRegForm.tf_father.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        obStudentPanel.obProfiles.obRegForm.tf_mother.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        obStudentPanel.obProfiles.obRegForm.cb_gender.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        obStudentPanel.obProfiles.obRegForm.cb_religion.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        obStudentPanel.obProfiles.obRegForm.tf_contact.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_addActionPerformed(null);
                }
            }
        });
        //********************
        obStudentPanel.obProfiles.tf_selectRoll.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == 10) {
                    form_but_goActionPerformed(null);
                }
            }
        });


    }
//********************************************************************
    int r_nrow = 0;
    boolean isSubmitable = false;
    String[][] temp_r_n;
    String temp_class = "", temp_subject = "", temp_section = "", temp_semester = "";

    void IRF_cbstd_classActionPerformed(ActionEvent e) {
        //System.out.println(obInputResultForm.cbstd_class.getSelectedIndex());
        if (obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() != 0) {
            obStudentPanel.obInputResultForm.cbsubject.removeAllItems();
            obStudentPanel.obInputResultForm.cbsubject.addItem("Select Subject");
            for (int j = 0; j < 11; j++) {
                if (subByClassArray[obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() - 1][j] != null) {
                    obStudentPanel.obInputResultForm.cbsubject.addItem(subByClassArray[obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() - 1][j]);
                }
            }

            obStudentPanel.obInputResultForm.cbsection.removeAllItems();
            obStudentPanel.obInputResultForm.cbsection.addItem("Select Section");
            for (int j = 0; j < 8; j++) {
                if (obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() != 0 && secByClassArray[obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() - 1][j] != null) {
                    obStudentPanel.obInputResultForm.cbsection.addItem(secByClassArray[obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() - 1][j]);
                }
            }
        }
    }

    void IRF_cbsectionActionPerformed(ActionEvent e) {
    }

    void cbsemesterActionPerformed(ActionEvent e) {
    }

    void cbsubjectActionPerformed(ActionEvent e) {
    }

    void but_okActionPerformed(ActionEvent e) {
        int tl = 0;

        if (obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() != 0
                && obStudentPanel.obInputResultForm.cbsection.getSelectedIndex() != 0
                && obStudentPanel.obInputResultForm.cbsemester.getSelectedIndex() != 0
                && obStudentPanel.obInputResultForm.cbsubject.getSelectedIndex() != 0) {
            tl = obStudentPanel.obInputResultForm.myTableModel.getRowCount();
            for (int i = 0; i < tl; i++) {
                obStudentPanel.obInputResultForm.myTableModel.removeRow(0);
            }

            temp_class = changeClassString((String) obStudentPanel.obInputResultForm.cbstd_class.getSelectedItem());
            temp_section = (String) obStudentPanel.obInputResultForm.cbsection.getSelectedItem();
            temp_subject = subCodeByClassArray[obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() - 1][obStudentPanel.obInputResultForm.cbsubject.getSelectedIndex() - 1];
            temp_semester = "" + obStudentPanel.obInputResultForm.cbsemester.getSelectedIndex();

            temp_r_n = obSelectAndInsertData.getroll_name(temp_class, (String) obStudentPanel.obInputResultForm.cbsection.getSelectedItem(), temp_semester);
            r_nrow = temp_r_n.length;

            String[][] temp_marks;
            if (obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() == 1) {
                temp_marks = obSelectAndInsertData.getMarks(3, "select " + temp_subject + "att," + temp_subject + "tt," + temp_subject + "sub " + "from " + temp_class + " where section='" + temp_section + "' and semester=" + temp_semester + " order by roll");
            } else if (1 < obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() && obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() < 6) {
                temp_marks = obSelectAndInsertData.getMarks(3, "select " + temp_subject + "att," + temp_subject + "tt," + temp_subject + "sub " + "from " + temp_class + " where section='" + temp_section + "' and semester=" + temp_semester + " order by roll");
            } else if (5 < obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() && obStudentPanel.obInputResultForm.cbstd_class.getSelectedIndex() < 9) {
                temp_marks = obSelectAndInsertData.getMarks(4, "select " + temp_subject + "att," + temp_subject + "tt," + temp_subject + "sub," + temp_subject + "obj," + temp_subject + "final " + "from " + temp_class + " where section='" + temp_section + "' and semester=" + temp_semester + " order by roll");
            } else {
                temp_marks = null;
            }

            Object[] temp_obj = new Object[7];
            for (int i = 0; i < r_nrow; i++) {
                for (int j = 1; j < 3; j++) {
                    temp_obj[j - 1] = temp_r_n[i][j];
                }
                for (int j = 2; j < 6; j++) {
                    try {
                        temp_obj[j] = temp_marks[i][j - 2];
                    } catch (ArrayIndexOutOfBoundsException ae) {
                        ae.printStackTrace();
                        temp_obj[j] = null;
                    }
                }
                try {
                    temp_obj[6] = "" + (Integer.parseInt(temp_marks[i][0])
                            + Integer.parseInt(temp_marks[i][1]) + Integer.parseInt(temp_marks[i][2])
                            + Integer.parseInt(temp_marks[i][3]));
                } catch (ArrayIndexOutOfBoundsException ae) {
                    ae.printStackTrace();
                    temp_obj[6] = null;
                    ;
                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                    temp_obj[6] = null;
                    ;
                }
                obStudentPanel.obInputResultForm.myTableModel.insertRow(i, temp_obj);
            }
            isSubmitable = true;

            obStudentPanel.obInputResultForm.but_submit.setEnabled(true);
            obStudentPanel.obInputResultForm.but_clearAll.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Select Class,Section,Semester,Subject");
        }
    }

    void but_submitActionPerformed(ActionEvent e) {
        if (isSubmitable) {
            int ask = JOptionPane.showConfirmDialog(this, "Confirmation", "Do you want to Submit your result", JOptionPane.YES_NO_OPTION);
            if (ask == 0) {
                int finalmarks = 0, att = 0, tt = 0, sub = 0, obj = 0;
                try {
                    att = Integer.parseInt((String) obStudentPanel.obInputResultForm.marksTable.getValueAt(obStudentPanel.obInputResultForm.marksTable.getSelectedRow(), 0));
                } catch (NumberFormatException nme) {
                    att = 0;
                    nme.printStackTrace();
                }
                try {
                    tt = Integer.parseInt((String) obStudentPanel.obInputResultForm.marksTable.getValueAt(obStudentPanel.obInputResultForm.marksTable.getSelectedRow(), 1));
                } catch (NumberFormatException nme) {
                    tt = 0;
                    nme.printStackTrace();
                }
                try {
                    sub = Integer.parseInt((String) obStudentPanel.obInputResultForm.marksTable.getValueAt(obStudentPanel.obInputResultForm.marksTable.getSelectedRow(), 2));
                } catch (NumberFormatException nme) {
                    sub = 0;
                    nme.printStackTrace();
                }
                try {
                    obj = Integer.parseInt((String) obStudentPanel.obInputResultForm.marksTable.getValueAt(obStudentPanel.obInputResultForm.marksTable.getSelectedRow(), 3));
                } catch (NumberFormatException nme) {
                    obj = 0;
                    nme.printStackTrace();
                }

                finalmarks = att + tt + sub + obj;

                //System.out.println("insert into "+temp_class+"(semester,"+temp_subject+"att,"+temp_subject+"tt,"+temp_subject+"sub,"+temp_subject+"final) values("+temp_semester+","+temp_data[i][0]+",'"+temp_data[i][1]+"',"+temp_data[i][2]+","+temp_data[i][3]+","+temp_data[i][4]+")");
                if (temp_class.equals("class1") || temp_class.equals("class2") || temp_class.equals("class3") || temp_class.equals("class4") || temp_class.equals("class5")) {
                    for (int i = 0; i < r_nrow; i++) {
                        obSelectAndInsertData.updateTuple("update " + temp_class + " set semester="
                                + temp_semester + "," + temp_subject + "att=" + att + ","
                                + temp_subject + "tt=" + tt + "," + temp_subject
                                + "sub=" + sub + "," + temp_subject + "final="
                                + finalmarks + " where id=" + temp_r_n[i][0] + " and semester=" + temp_semester);
                    }
                }

                if (temp_class.equals("class6") || temp_class.equals("class7") || temp_class.equals("class8")) {
                    for (int i = 0; i < r_nrow; i++) {
                        obSelectAndInsertData.updateTuple("update " + temp_class + " set semester="
                                + temp_semester + "," + temp_subject + "att=" + att + ","
                                + temp_subject + "tt=" + tt + "," + temp_subject + "sub="
                                + sub + "," + temp_subject + "obj=" + obj
                                + "," + temp_subject + "final=" + finalmarks + " where id="
                                + temp_r_n[i][0] + " and semester=" + temp_semester);
                    }
                }
            }

        }
    }

    void but_clearAllActionPerformed(ActionEvent e) {
    }

    String changeClassString(String tcs) {
        String temp = "null";
        if (tcs.equals("Class I")) {
            temp = "class1";
        } else if (tcs.equals("Class II")) {
            temp = "class2";
        } else if (tcs.equals("Class III")) {
            temp = "class3";
        } else if (tcs.equals("Class IV")) {
            temp = "class4";
        } else if (tcs.equals("Class V")) {
            temp = "class5";
        } else if (tcs.equals("Class VI")) {
            temp = "class6";
        } else if (tcs.equals("Class VII")) {
            temp = "class7";
        } else if (tcs.equals("Class VIII")) {
            temp = "class8";
        } else if (tcs.equals("Class IX")) {
            temp = "class9";
        } else if (tcs.equals("Class X")) {
            temp = "class10";
        }

        return temp;
    }

    String changeSubjectString(String css) {
        String temp = "";
        java.util.StringTokenizer subToken;
        subToken = new java.util.StringTokenizer(css);

        while (subToken.hasMoreTokens()) {
            temp = temp + subToken.nextToken();
        }
        //System.out.println(temp);
        temp = temp + "_";
        return temp;
    }

    void mrksTableKeyPressed(KeyEvent ke) {
        if (isSubmitable) {
            //System.out.println(ke.getKeyCode());
            if (40 >= ke.getKeyCode() || ke.getKeyCode() >= 37) {
                if (obStudentPanel.obInputResultForm.marksTable.getSelectedRow() < r_nrow) {
                    int tm = 0, att = 0, tt = 0, sub = 0, obj = 0;
                    try {
                        att = Integer.parseInt((String) obStudentPanel.obInputResultForm.marksTable.getValueAt(obStudentPanel.obInputResultForm.marksTable.getSelectedRow(), 0));
                    } catch (NumberFormatException nme) {
                        att = 0;
                        nme.printStackTrace();
                    }
                    try {
                        tt = Integer.parseInt((String) obStudentPanel.obInputResultForm.marksTable.getValueAt(obStudentPanel.obInputResultForm.marksTable.getSelectedRow(), 1));
                    } catch (NumberFormatException nme) {
                        tt = 0;
                        nme.printStackTrace();
                    }
                    try {
                        sub = Integer.parseInt((String) obStudentPanel.obInputResultForm.marksTable.getValueAt(obStudentPanel.obInputResultForm.marksTable.getSelectedRow(), 2));
                    } catch (NumberFormatException nme) {
                        sub = 0;
                        nme.printStackTrace();
                    }
                    try {
                        obj = Integer.parseInt((String) obStudentPanel.obInputResultForm.marksTable.getValueAt(obStudentPanel.obInputResultForm.marksTable.getSelectedRow(), 3));
                    } catch (NumberFormatException nme) {
                        obj = 0;
                        nme.printStackTrace();
                    }

                    tm = att + tt + sub + obj;
                    obStudentPanel.obInputResultForm.marksTable.setValueAt("" + tm, obStudentPanel.obInputResultForm.marksTable.getSelectedRow(), 4);
                }
            }
        }
    }
    //********************************* Advance Search Panel :

    private void but_studentprofileActionPerformed(ActionEvent evt) {
        //################################CODE EDITED###########################################################
        obLeftPanel.obAdvanceSearchPanel.but_resultfilter.setBackground(Color.WHITE);              //##
        obLeftPanel.obAdvanceSearchPanel.but_resultfilter.setForeground(new Color(0, 153, 255));   //##
        obLeftPanel.obAdvanceSearchPanel.but_studentprofile.setBackground(new Color(0, 153, 255)); //##
        obLeftPanel.obAdvanceSearchPanel.but_studentprofile.setForeground(Color.WHITE);            //##
        //######################################################################################################
        obLeftPanel.obAdvanceSearchPanel.changingPanel.removeAll();
        obLeftPanel.obAdvanceSearchPanel.changingPanel.add(obLeftPanel.obAdvanceSearchPanel.obStudentFilter, BorderLayout.CENTER);
        repaint();
        show();
    }

    private void but_resultfilterActionPerformed(ActionEvent evt) {
        //################################CODE EDITED###########################################################
        obLeftPanel.obAdvanceSearchPanel.but_studentprofile.setBackground(Color.WHITE);
        obLeftPanel.obAdvanceSearchPanel.but_studentprofile.setForeground(new Color(0, 153, 255));
        obLeftPanel.obAdvanceSearchPanel.but_resultfilter.setBackground(new Color(0, 153, 255));
        obLeftPanel.obAdvanceSearchPanel.but_resultfilter.setForeground(Color.WHITE);
        //######################################################################################################
        obLeftPanel.obAdvanceSearchPanel.changingPanel.removeAll();
        obLeftPanel.obAdvanceSearchPanel.changingPanel.add(obLeftPanel.obAdvanceSearchPanel.obResultFilter, BorderLayout.CENTER);
        repaint();
        show();

    }
    //*******************main method :

    void getSubByClass() {
        subByClassArray = obSelectAndInsertData.getSubByClass();
        subCodeByClassArray = obSelectAndInsertData.getSubCodeByClass();
    }

    void getSecbyClass() {
        secByClassArray = obSelectAndInsertData.getSecByClass();
    }

    // Variables declaration - do not modify
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton info;
    private JButton result;
    private JButton addstudent;
    private JLabel jLabelheader;
    private JLabel JLabelbanner;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel changingPanel;
    private JPanel MainPanel;
    private UIManager.LookAndFeelInfo looks[];
    private JLayeredPane layer;
    // End of variables declaration
}
