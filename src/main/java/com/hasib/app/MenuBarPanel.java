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
        jSeparator1 = new javax.swing.JSeparator();
        jmi_exit = new javax.swing.JMenuItem();
        jmi_signout = new javax.swing.JMenuItem();
        jm_view = new javax.swing.JMenu();
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
        jm_config = new javax.swing.JMenu();
        jmi_subjectcustom=new javax.swing.JMenuItem();
        jmi_sectioncustom=new javax.swing.JMenuItem();
        jm_help = new javax.swing.JMenu();
        jmi_cradits=new javax.swing.JMenuItem();
        jmi_intro=new javax.swing.JMenuItem();
        jmi_createuser=new javax.swing.JMenuItem();
		jMenuBar1.setFont(new java.awt.Font("Lucida Console", 0, 11));
		//***********************
        jm_file.setText("File");
		
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
        
        jMenuBar1.add(jm_user);

		//*************************
        jm_view.setText("View");
        
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
		jmi_sectioncustom.setEnabled(b);
		jmi_subjectcustom.setEnabled(b);
		jmi_signout.setEnabled(b);
		jmi_createuser.setEnabled(b);
	}
	
	public javax.swing.JMenu jm_file;
	public javax.swing.JMenu jm_user;
    public javax.swing.JMenu jm_view;
    public javax.swing.JMenu jm_help;
    public javax.swing.JMenu jm_config;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jmi_exit;
    public javax.swing.JMenuItem jmi_signout;
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
    public javax.swing.JMenuItem jmi_createuser;
    public javax.swing.JSeparator jSeparator1;
}