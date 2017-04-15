package com.hasib.app;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try {
            // TODO code application logic here
            MainFrame mf = new MainFrame();
            mf.setVisible(true);
            mf.setLocation(200, 0);
            mf.setResizable(false);
            Image wi = Toolkit.getDefaultToolkit().getImage("WindowIcon.png");
            mf.setIconImage(wi);
            mf.setTitle("SBA Based School Management System");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
