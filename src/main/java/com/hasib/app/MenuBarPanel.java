package com.hasib.app;

class MenuBarPanel
{
	MenuBarPanel()
	{
		initComponent();
	}
	
	void initComponent()
	{
		
 		jMenuBar1 = new javax.swing.JMenuBar();
        jm_file = new javax.swing.JMenu();
        jm_user = new javax.swing.JMenu();
        jmi_new=new javax.swing.JMenuItem();
        jmi_save = new javax.swing.JMenuItem();
        jmi_saveas = new javax.swing.JMenuItem();
        jmi_print= new javax.swing.JMenuItem();
        jmi_printpreview= new javax.swing.JMenuItem();
        jmi_printoption= new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jmi_exit = new javax.swing.JMenuItem();
        jmi_signout = new javax.swing.JMenuItem();
        jm_edit = new javax.swing.JMenu();
        jm_view = new javax.swing.JMenu();
        jmi_fullscreen=new javax.swing.JMenuItem();
        jm_Theme=new javax.swing.JMenu();
        jmi_Theme1=new javax.swing.JMenuItem();
        jmi_Theme2=new javax.swing.JMenuItem();
        jmi_Theme3=new javax.swing.JMenuItem();
        jmi_Theme4=new javax.swing.JMenuItem();
        jmi_Theme5=new javax.swing.JMenuItem();
        jmi_Theme6=new javax.swing.JMenuItem();
        jmi_Theme7=new javax.swing.JMenuItem();
        jmi_Theme8=new javax.swing.JMenuItem();
        jmi_Theme9=new javax.swing.JMenuItem();
        jmi_Theme10=new javax.swing.JMenuItem();
        jmi_Theme11=new javax.swing.JMenuItem();
        jmi_Theme12=new javax.swing.JMenuItem();
        jm_tools = new javax.swing.JMenu();
        jmi_calculator = new javax.swing.JMenuItem();
        jmi_calender = new javax.swing.JMenuItem();
        jmi_clock = new javax.swing.JMenuItem();
        jmi_classschedule=new javax.swing.JMenuItem();
        jm_config = new javax.swing.JMenu();
        jmi_loginconfig=new javax.swing.JMenuItem();
        jmi_userconfig=new javax.swing.JMenuItem();
        jmi_subjectcustom=new javax.swing.JMenuItem();
        jmi_sectioncustom=new javax.swing.JMenuItem();
        jm_help = new javax.swing.JMenu();
        jmi_cradits=new javax.swing.JMenuItem();
        jmi_intro=new javax.swing.JMenuItem();
        jmi_newstudent =new javax.swing.JMenuItem();
        jmi_newteacher =new javax.swing.JMenuItem();
        jmi_newoperator=new javax.swing.JMenuItem();
        jmi_createuser=new javax.swing.JMenuItem();
		jMenuBar1.setFont(new java.awt.Font("Lucida Console", 0, 11));
		//***********************
        jm_file.setText("File");
        
        jmi_new.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmi_new.setText("New");
        jm_file.add(jmi_new);
		jm_file.add(new javax.swing.JSeparator());
		
        jmi_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmi_save.setText("Save");
        jm_file.add(jmi_save);
        
        jmi_saveas.setText("Save as");
        jm_file.add(jmi_saveas);
        jm_file.add(new javax.swing.JSeparator());
        
        jmi_print.setText("Print");
        jm_file.add(jmi_print);
        
        jmi_printpreview.setText("Print Preview");
        jm_file.add(jmi_printpreview);
        
        jmi_printoption.setText("Print Option");
        jm_file.add(jmi_printoption);
		jm_file.add(new javax.swing.JSeparator());
		
        jmi_signout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jmi_signout.setText("Log Out");
        jm_file.add(jmi_signout);
        jm_file.add(new javax.swing.JSeparator());

        jmi_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmi_exit.setText("Exit");
        jm_file.add(jmi_exit);

        jMenuBar1.add(jm_file);
		//*************************
		jm_user.setText("Users");
        
        jmi_createuser.setText("Create User");
        jm_user.add(jmi_createuser);
        
        jmi_userconfig.setText("Edit User");
        jm_user.add(jmi_userconfig);
        
        jMenuBar1.add(jm_user);
		//************************
        jm_edit.setText("Edit");
        jMenuBar1.add(jm_edit);
		//*************************
        jm_view.setText("View");
        
        jmi_fullscreen.setText("Full Screen mode");
        jm_view.add(jmi_fullscreen);
        
        jm_Theme.setText("Theme");
        
        jmi_Theme1.setText("smart");
        jm_Theme.add(jmi_Theme1);
        
        jmi_Theme2.setText("Noive");
        jm_Theme.add(jmi_Theme2);
        
        jmi_Theme3.setText("Mint");
        jm_Theme.add(jmi_Theme3);
        
        jmi_Theme4.setText("Mcwin");
        jm_Theme.add(jmi_Theme4);
        
        jmi_Theme5.setText("Luna");
        jm_Theme.add(jmi_Theme5);
        
        jmi_Theme6.setText("Hifi");
        jm_Theme.add(jmi_Theme6);
        
        jmi_Theme7.setText("Grafhite");
        jm_Theme.add(jmi_Theme7);
        
        jmi_Theme8.setText("Fast");
        jm_Theme.add(jmi_Theme8);
        
        jmi_Theme9.setText("Bernstein");
        jm_Theme.add(jmi_Theme9);
        
        jmi_Theme10.setText("Aluminium");
        jm_Theme.add(jmi_Theme10);
        
        jmi_Theme11.setText("Aero");
        jm_Theme.add(jmi_Theme11);
        
        jmi_Theme12.setText("Acryl");
        jm_Theme.add(jmi_Theme12);
        
        jm_view.add(jm_Theme);
        
        jMenuBar1.add(jm_view);
        //*************************
        jm_config.setText("Configure");
        
        //jmi_subjectcustom.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmi_subjectcustom.setText("Subject Customize");
        jm_config.add(jmi_subjectcustom);
        
        jmi_sectioncustom.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmi_sectioncustom.setText("Section Customize");
        jm_config.add(jmi_sectioncustom);
        
        //jm_config.add(new javax.swing.JSeparator());
        
        jMenuBar1.add(jm_config);
		//******************************
        jm_tools.setText("Tools");
        
        jmi_classschedule.setText("Class Schedule");
        jm_tools.add(jmi_classschedule);
        jm_tools.add(new javax.swing.JSeparator());
        
        jmi_calculator.setText("Calculator");
        jm_tools.add(jmi_calculator);
        
        jmi_calender.setText("Calender");
        jm_tools.add(jmi_calender);
        
        jmi_clock.setText("Clock");
        jm_tools.add(jmi_clock);
        
        jMenuBar1.add(jm_tools);
		//*************************
        jm_help.setText("Help");
        
        jmi_intro.setText("Intro");
        jm_help.add(jmi_intro);
        jm_help.add(new javax.swing.JSeparator());
        
        jmi_cradits.setText("Cradits");
        jm_help.add(jmi_cradits);
        
        jMenuBar1.add(jm_help);
        
        setEnable(false);
	}
	
	javax.swing.JMenuBar getMenuBar()
	{
		return jMenuBar1;
	}
	
	void setEnable(boolean b)
	{
		jmi_calculator.setEnabled(b);
		jmi_calender.setEnabled(b);
		jmi_classschedule.setEnabled(b);
		jmi_clock.setEnabled(b);
		jmi_print.setEnabled(b);
		jmi_printoption.setEnabled(b);
		jmi_printpreview.setEnabled(b);
		jmi_loginconfig.setEnabled(b);
		jmi_save.setEnabled(b);
		jmi_saveas.setEnabled(b);
		jmi_new.setEnabled(b);
		jmi_print.setEnabled(b);
		jmi_sectioncustom.setEnabled(b);
		jmi_subjectcustom.setEnabled(b);
		jmi_signout.setEnabled(b);
		jmi_userconfig.setEnabled(b);
		jmi_createuser.setEnabled(b);
	}
	
	public javax.swing.JMenu jm_file;
	public javax.swing.JMenu jm_user;
    public javax.swing.JMenu jm_edit;
    public javax.swing.JMenu jm_view;
    public javax.swing.JMenu jm_tools;
    public javax.swing.JMenu jm_help;
    public javax.swing.JMenu jm_config;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jmi_new;
    public javax.swing.JMenuItem jmi_save;
    public javax.swing.JMenuItem jmi_saveas;
    public javax.swing.JMenuItem jmi_print;
    public javax.swing.JMenuItem jmi_printpreview;
    public javax.swing.JMenuItem jmi_printoption;
    public javax.swing.JMenuItem jmi_exit;
    public javax.swing.JMenuItem jmi_signout;
    public javax.swing.JMenuItem jmi_calculator;
    public javax.swing.JMenuItem jmi_calender;
    public javax.swing.JMenuItem jmi_clock;
    public javax.swing.JMenuItem jmi_classschedule;
    public javax.swing.JMenuItem jmi_loginconfig;
    public javax.swing.JMenuItem jmi_userconfig;
    public javax.swing.JMenuItem jmi_subjectcustom;
    public javax.swing.JMenuItem jmi_sectioncustom;
    public javax.swing.JMenu jm_Theme;
    public javax.swing.JMenuItem jmi_Theme1;
    public javax.swing.JMenuItem jmi_Theme2;
    public javax.swing.JMenuItem jmi_Theme3;
    public javax.swing.JMenuItem jmi_Theme4;
    public javax.swing.JMenuItem jmi_Theme5;
    public javax.swing.JMenuItem jmi_Theme6;
    public javax.swing.JMenuItem jmi_Theme7;
    public javax.swing.JMenuItem jmi_Theme8;
    public javax.swing.JMenuItem jmi_Theme9;
    public javax.swing.JMenuItem jmi_Theme10;
    public javax.swing.JMenuItem jmi_Theme11;
    public javax.swing.JMenuItem jmi_Theme12;
    public javax.swing.JMenuItem jmi_intro;
    public javax.swing.JMenuItem jmi_cradits;
    public javax.swing.JMenuItem jmi_fullscreen;
    public javax.swing.JMenuItem jmi_newstudent;
    public javax.swing.JMenuItem jmi_newteacher;
    public javax.swing.JMenuItem jmi_newoperator;
    public javax.swing.JMenuItem jmi_createuser;
    public javax.swing.JSeparator jSeparator1;
}