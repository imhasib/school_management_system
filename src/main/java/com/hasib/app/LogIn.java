package com.hasib.app;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

public class LogIn extends javax.swing.JPanel {

    javax.swing.ImageIcon adminico, teacherico, operatorico, studentico, loginico;//
    int counter = 0;

    public LogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    public void initComponents() {

        java.awt.GraphicsEnvironment env = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        java.awt.GraphicsDevice device = env.getDefaultScreenDevice();


        adminico = new javax.swing.ImageIcon("img\\admin.jpg");
        teacherico = new javax.swing.ImageIcon("img\\teacher.jpg");
        operatorico = new javax.swing.ImageIcon("img\\operator.jpg");
        studentico = new javax.swing.ImageIcon("img\\student.jpg");

        loginico = new javax.swing.ImageIcon("img\\try.jpg");

        //this = new javax.swing.JPanel();
        buttonpanel = new javax.swing.JPanel();
        jPanel4 = new panel_login();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton1.setIcon(adminico);
        jButton2 = new javax.swing.JButton();
        jButton2.setIcon(teacherico);
        jButton3 = new javax.swing.JButton();
        jButton3.setIcon(operatorico);
        jButton4 = new javax.swing.JButton();
        jButton4.setIcon(studentico);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        butLogIn = new javax.swing.JButton();
        butLogIn.setIcon(loginico);
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();


        buttonpanel.setBackground(new java.awt.Color(51, 51, 51));

        this.setBackground(new java.awt.Color(51, 51, 51));
        this.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 36));
        jLabel1.setForeground(new java.awt.Color(153, 204, 0));
        jLabel1.setText("Login As");

        jButton1.addActionListener(
                new java.awt.event.ActionListener() {

                    public void actionPerformed(java.awt.event.ActionEvent e) {


                        jPanel4.setVisible(true);

                        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
                        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
                        jLabel7.setForeground(new java.awt.Color(204, 204, 204));

                        jLabel4.setForeground(new java.awt.Color(153, 204, 0));
                        counter++;
                    }
                });

        jButton2.addActionListener(
                new java.awt.event.ActionListener() {

                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        jPanel4.setVisible(true);
                        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
                        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
                        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
                        jLabel5.setForeground(new java.awt.Color(153, 204, 0));
                        counter++;
                    }
                });

        jButton3.addActionListener(
                new java.awt.event.ActionListener() {

                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
                        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
                        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
                        jLabel6.setForeground(new java.awt.Color(153, 204, 0));
                        jPanel4.setVisible(true);
                        counter++;
                    }
                });

        jButton4.addActionListener(
                new java.awt.event.ActionListener() {

                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        if (counter == 0) {
                            jPanel4.setVisible(false);
                        }
                        if (counter > 0) {
                            jPanel4.setVisible(true);
                        }
                        javax.swing.JOptionPane.showMessageDialog(null, "Under Construction");
                    }
                });
        jPanel4.setVisible(false);
        jButton1.setText("jButton1");
        jButton1.setToolTipText("Admin"); // NOI18N

        jButton2.setText("jButton2");
        jButton2.setToolTipText("Teacher");

        jButton3.setText("jButton3");
        jButton3.setToolTipText("Operator");

        jButton4.setText("jButton4");
        jButton4.setToolTipText("Student");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 204, 0), 2, true), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel4.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("SolaimanLipi", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("User Name");

        jLabel3.setFont(new java.awt.Font("SolaimanLipi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Passward");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        butLogIn.setText("");
        butLogIn.setBackground(new java.awt.Color(204, 255, 0));
        /*
        butLogIn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ex)
        {
        butLogInActionPerformed(ex);
        }
        });
         */
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(butLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel4Layout.createSequentialGroup().addGap(34, 34, 34).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jLabel2).addGap(27, 27, 27)).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jPasswordField1).addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))).addContainerGap()));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(15, 15, 15).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE).addComponent(butLogIn).addContainerGap()));



        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Admin");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Teacher");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Operator");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Student");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel3Layout.createSequentialGroup().addGap(47, 47, 47).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel4).addGap(62, 62, 62))).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel5).addGap(53, 53, 53))).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel7).addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))).addContainerGap(33, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap(96, Short.MAX_VALUE).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(jLabel5).addComponent(jLabel6).addComponent(jLabel7)).addGap(25, 25, 25).addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(131, 131, 131)));
    }

    public void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    /*
    public void butLogInActionPerformed(ActionEvent e)
    {


    
    } 
     */

    javax.swing.JPanel getPanel() {
        return this;
    }
    // Variables declaration - do not modify
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton butLogIn;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    //public javax.swing.JPanel this;
    public javax.swing.JPanel jPanel4;
    javax.swing.JPanel buttonpanel;
    javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration
}

class panel_login extends javax.swing.JPanel {

    panel_login() {
        bgImage(this);
    }
    Image bgi;

    void bgImage(javax.swing.JPanel p) {
        bgi = Toolkit.getDefaultToolkit().getImage("img\\login_lock.gif");
        MediaTracker mt = new MediaTracker(p);
        mt.addImage(bgi, 0);
        try {
            mt.waitForAll();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bgi, 0, 0, null);
    }
}
