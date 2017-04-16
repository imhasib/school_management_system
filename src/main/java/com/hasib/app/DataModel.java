package com.hasib.app;

import java.sql.*;

public class DataModel {

    Connection con;
    Statement stmnt1;
    ResultSet result;

    public DataModel() throws SQLException {
        connectdba();
        initial();
    }

    void initial() {
        try {
            stmnt1.execute("create table std_info(id INT,name varchar(300),nickname varchar(40),stdclass varchar(15),section varchar(15),roll INT,sessionyear INT,father varchar(40),mother varchar(40),birthday varchar(20),gender varchar(15),religion varchar(20),contact varchar(40),current_add varchar(300),home_add varchar(300),prev_school varchar(200),note varchar(300),image varchar(300))");
            stmnt1.execute("create table lastid (id INT)");
            stmnt1.execute("insert into lastid values(1)");
            stmnt1.execute("create table class1 (id INT,roll INT,section varchar(7),year INT,semester INT,bangla_att INT,bangla_tt INT,bangla_sub INT,bangla_final INT,english_att INT,english_tt INT,english_sub INT,english_final INT,math_att INT,math_tt INT,math_sub INT,math_final INT,religion_att INT,religion_tt INT,religion_sub INT,religion_final INT)");
            stmnt1.execute("create table class2 (id INT,roll INT,section varchar(7),year INT,semester INT,bangla1_att INT,bangla1_tt INT,bangla1_sub INT,bangla1_final INT,bangla2_att INT,bangla2_tt INT,bangla2_sub INT,bangla2_final INT,english1_att INT,english1_tt INT,english1_sub INT,english1_final INT,english2_att INT,english2_tt INT,english2_sub INT,english2_final INT,math_att INT,math_tt INT,math_sub INT,math_final INT,religion_att INT,religion_tt INT,religion_sub INT,religion_final INT)");
            stmnt1.execute("create table class3 (id INT,roll INT,section varchar(7),year INT,semester INT,bangla1_att INT,bangla1_tt INT,bangla1_sub INT,bangla1_final INT,bangla2_att INT,bangla2_tt INT,bangla2_sub INT,bangla2_final INT,english1_att INT,english1_tt INT,english1_sub INT,english1_final INT,english2_att INT,english2_tt INT,english2_sub INT,english2_final INT,math_att INT,math_tt INT,math_sub INT,math_final INT,religion_att INT,religion_tt INT,religion_sub INT,religion_final INT)");
            stmnt1.execute("create table class4 (id INT,roll INT,section varchar(7),year INT,semester INT,bangla1_att INT,bangla1_tt INT,bangla1_sub INT,bangla1_final INT,bangla2_att INT,bangla2_tt INT,bangla2_sub INT,bangla2_final INT,english1_att INT,english1_tt INT,english1_sub INT,english1_final INT,english2_att INT,english2_tt INT,english2_sub INT,english2_final INT,math_att INT,math_tt INT,math_sub INT,math_final INT,religion_att INT,religion_tt INT,religion_sub INT,religion_final INT)");
            stmnt1.execute("create table class5 (id INT,roll INT,section varchar(7),year INT,semester INT,bangla1_att INT,bangla1_tt INT,bangla1_sub INT,bangla1_final INT,bangla2_att INT,bangla2_tt INT,bangla2_sub INT,bangla2_final INT,english1_att INT,english1_tt INT,english1_sub INT,english1_final INT,english2_att INT,english2_tt INT,english2_sub INT,english2_final INT,math_att INT,math_tt INT,math_sub INT,math_final INT,religion_att INT,religion_tt INT,religion_sub INT,religion_final INT)");
            stmnt1.execute("create table class6 (id INT,roll INT,section varchar(7),year INT,semester INT,bangla1_att INT,bangla1_tt INT,bangla1_sub INT,bangla1_obj INT,bangla1_final INT,bangla2_att INT,bangla2_tt INT,bangla2_sub INT,bangla2_obj INT,bangla2_final INT,english1_att INT,english1_tt INT,english1_sub INT,english1_obj INT,english1_final INT,english2_att INT,english2_tt INT,english2_sub INT,english2_obj INT,english2_final INT,math_att INT,math_tt INT,math_sub INT,math_final INT,religion_att INT,religion_tt INT,religion_sub INT,religion_obj INT,religion_final INT,generalscience_att INT,generalscience_tt INT,generalscience_sub INT,generalscience_obj INT,generalscience_final INT,socialscience_att INT,socialscience_tt INT,socialscience_sub INT,socialscience_obj INT,socialscience_final INT)");
            stmnt1.execute("create table class7 (id INT,roll INT,section varchar(7),year INT,semester INT,bangla1_att INT,bangla1_tt INT,bangla1_sub INT,bangla1_obj INT,bangla1_final INT,bangla2_att INT,bangla2_tt INT,bangla2_sub INT,bangla2_obj INT,bangla2_final INT,english1_att INT,english1_tt INT,english1_sub INT,english1_obj INT,english1_final INT,english2_att INT,english2_tt INT,english2_sub INT,english2_obj INT,english2_final INT,math_att INT,math_tt INT,math_sub INT,math_final INT,religion_att INT,religion_tt INT,religion_sub INT,religion_obj INT,religion_final INT,generalscience_att INT,generalscience_tt INT,generalscience_sub INT,generalscience_obj INT,generalscience_final INT,socialscience_att INT,socialscience_tt INT,socialscience_sub INT,socialscience_obj INT,socialscience_final INT)");
            stmnt1.execute("create table class8 (id INT,roll INT,section varchar(7),year INT,semester INT,bangla1_att INT,bangla1_tt INT,bangla1_sub INT,bangla1_obj INT,bangla1_final INT,bangla2_att INT,bangla2_tt INT,bangla2_sub INT,bangla2_obj INT,bangla2_final INT,english1_att INT,english1_tt INT,english1_sub INT,english1_obj INT,english1_final INT,english2_att INT,english2_tt INT,english2_sub INT,english2_obj INT,english2_final INT,math_att INT,math_tt INT,math_sub INT,math_final INT,religion_att INT,religion_tt INT,religion_sub INT,religion_obj INT,religion_final INT,generalscience_att INT,generalscience_tt INT,generalscience_sub INT,generalscience_obj INT,generalscience_final INT,socialscience_att INT,socialscience_tt INT,socialscience_sub INT,socialscience_obj INT,socialscience_final INT)");
            stmnt1.execute("create table sub_set_class1(subject varchar(50),subjectcode varchar(50))");
            stmnt1.execute("create table sub_set_class2(subject varchar(50),subjectcode varchar(50))");
            stmnt1.execute("create table sub_set_class3(subject varchar(50),subjectcode varchar(50))");
            stmnt1.execute("create table sub_set_class4(subject varchar(50),subjectcode varchar(50))");
            stmnt1.execute("create table sub_set_class5(subject varchar(50),subjectcode varchar(50))");
            stmnt1.execute("create table sub_set_class6(subject varchar(50),subjectcode varchar(50))");
            stmnt1.execute("create table sub_set_class7(subject varchar(50),subjectcode varchar(50))");
            stmnt1.execute("create table sub_set_class8(subject varchar(50),subjectcode varchar(50))");

            stmnt1.execute("Create table sec_set_class1(section varchar(8))");
            stmnt1.execute("Create table sec_set_class2(section varchar(8))");
            stmnt1.execute("Create table sec_set_class3(section varchar(8))");
            stmnt1.execute("Create table sec_set_class4(section varchar(8))");
            stmnt1.execute("Create table sec_set_class5(section varchar(8))");
            stmnt1.execute("Create table sec_set_class6(section varchar(8))");
            stmnt1.execute("Create table sec_set_class7(section varchar(8))");
            stmnt1.execute("Create table sec_set_class8(section varchar(8))");

            stmnt1.execute("insert into sub_set_class1 values('Bangla','Bangla_')");
            stmnt1.execute("insert into sub_set_class1 values('English','English_')");
            stmnt1.execute("insert into sub_set_class1 values('Math','Math_')");
            stmnt1.execute("insert into sub_set_class1 values('Religion','Religion_')");
            //stmnt1.execute("insert into sub_set_class1 values('General Science','GeneralScience_')");
            //stmnt1.execute("insert into sub_set_class1 values('Environment','Environment_')");
            //stmnt1.execute("insert into sub_set_class1 values('Drawing','Drawing_')");

            stmnt1.execute("insert into sub_set_class2 values('Bangla1','Bangla1_')");
            stmnt1.execute("insert into sub_set_class2 values('Bangla2','Bangla2_')");
            stmnt1.execute("insert into sub_set_class2 values('English1','English1_')");
            stmnt1.execute("insert into sub_set_class2 values('English2','English2_')");
            stmnt1.execute("insert into sub_set_class2 values('Math','Math_')");
            stmnt1.execute("insert into sub_set_class2 values('Religion','Religion_')");
            //stmnt1.execute("insert into sub_set_class2 values('General Science','GeneralScience_')");
            //stmnt1.execute("insert into sub_set_class2 values('Environment','Environment_')");
            //stmnt1.execute("insert into sub_set_class2 values('Drawing','Drawing_')");

            stmnt1.execute("insert into sub_set_class3 values('Bangla1','Bangla1_')");
            stmnt1.execute("insert into sub_set_class3 values('Bangla2','Bangla2_')");
            stmnt1.execute("insert into sub_set_class3 values('English1','English1_')");
            stmnt1.execute("insert into sub_set_class3 values('English2','English2_')");
            stmnt1.execute("insert into sub_set_class3 values('Math','Math_')");
            stmnt1.execute("insert into sub_set_class3 values('Religion','Religion_')");
            //stmnt1.execute("insert into sub_set_class3 values('General Science','GeneralScience_')");
            //stmnt1.execute("insert into sub_set_class3 values('Environment','Environment_')");
            //stmnt1.execute("insert into sub_set_class3 values('Drawing','Drawing_')");

            stmnt1.execute("insert into sub_set_class4 values('Bangla1','Bangla1_')");
            stmnt1.execute("insert into sub_set_class4 values('Bangla2','Bangla2_')");
            stmnt1.execute("insert into sub_set_class4 values('English1','English1_')");
            stmnt1.execute("insert into sub_set_class4 values('English2','English2_')");
            stmnt1.execute("insert into sub_set_class4 values('Math','Math_')");
            stmnt1.execute("insert into sub_set_class4 values('Religion','Religion_')");
            //stmnt1.execute("insert into sub_set_class4 values('General Science','GeneralScience_')");
            //stmnt1.execute("insert into sub_set_class4 values('Environment','Environment_')");
            //stmnt1.execute("insert into sub_set_class4 values('Drawing','Drawing_')");

            stmnt1.execute("insert into sub_set_class5 values('Bangla1','Bangla1_')");
            stmnt1.execute("insert into sub_set_class5 values('Bangla2','Bangla2_')");
            stmnt1.execute("insert into sub_set_class5 values('English1','English1_')");
            stmnt1.execute("insert into sub_set_class5 values('English2','English2_')");
            stmnt1.execute("insert into sub_set_class5 values('Math','Math_')");
            stmnt1.execute("insert into sub_set_class5 values('Religion','Religion_')");
            //stmnt1.execute("insert into sub_set_class5 values('General Science','GeneralScience_')");
            //stmnt1.execute("insert into sub_set_class5 values('Environment','Environment_')");
            //stmnt1.execute("insert into sub_set_class5 values('Drawing','Drawing_')");

            stmnt1.execute("insert into sub_set_class6 values('Bangla1','Bangla1_')");
            stmnt1.execute("insert into sub_set_class6 values('Bangla2','Bangla2_')");
            stmnt1.execute("insert into sub_set_class6 values('English1','English1_')");
            stmnt1.execute("insert into sub_set_class6 values('English2','English2_')");
            stmnt1.execute("insert into sub_set_class6 values('Math','Math_')");
            stmnt1.execute("insert into sub_set_class6 values('Religion','Religion_')");
            stmnt1.execute("insert into sub_set_class6 values('General Science','GeneralScience_')");
            stmnt1.execute("insert into sub_set_class6 values('Social Science','SocialScience_')");
            //stmnt1.execute("insert into sub_set_class6 values('Agricultural science','Agriculturalscience_')");

            stmnt1.execute("insert into sub_set_class7 values('Bangla1','Bangla1_')");
            stmnt1.execute("insert into sub_set_class7 values('Bangla2','Bangla2_')");
            stmnt1.execute("insert into sub_set_class7 values('English1','English1_')");
            stmnt1.execute("insert into sub_set_class7 values('English2','English2_')");
            stmnt1.execute("insert into sub_set_class7 values('Math','Math_')");
            stmnt1.execute("insert into sub_set_class7 values('Religion','Religion_')");
            stmnt1.execute("insert into sub_set_class7 values('General Science','GeneralScience_')");
            stmnt1.execute("insert into sub_set_class7 values('Social Science','SocialScience_')");
            //stmnt1.execute("insert into sub_set_class7 values('Agricultural science','Agriculturalscience_')");

            stmnt1.execute("insert into sub_set_class8 values('Bangla1','Bangla1_')");
            stmnt1.execute("insert into sub_set_class8 values('Bangla2','Bangla2_')");
            stmnt1.execute("insert into sub_set_class8 values('English1','English1_')");
            stmnt1.execute("insert into sub_set_class8 values('English2','English2_')");
            stmnt1.execute("insert into sub_set_class8 values('Math','Math_')");
            stmnt1.execute("insert into sub_set_class8 values('Religion','Religion_')");
            stmnt1.execute("insert into sub_set_class8 values('General Science','GeneralScience_')");
            stmnt1.execute("insert into sub_set_class8 values('Social Science','SocialScience_')");
            //stmnt1.execute("insert into sub_set_class8 values('Agricultural science','Agriculturalscience_')");

            stmnt1.execute("insert into sec_set_class1 values('A')");
            stmnt1.execute("insert into sec_set_class1 values('B')");

            stmnt1.execute("insert into sec_set_class2 values('A')");
            stmnt1.execute("insert into sec_set_class2 values('B')");

            stmnt1.execute("insert into sec_set_class3 values('A')");
            stmnt1.execute("insert into sec_set_class3 values('B')");

            stmnt1.execute("insert into sec_set_class4 values('A')");
            stmnt1.execute("insert into sec_set_class4 values('B')");

            stmnt1.execute("insert into sec_set_class5 values('A')");
            stmnt1.execute("insert into sec_set_class5 values('B')");

            stmnt1.execute("insert into sec_set_class6 values('A')");
            stmnt1.execute("insert into sec_set_class6 values('B')");

            stmnt1.execute("insert into sec_set_class7 values('A')");
            stmnt1.execute("insert into sec_set_class7 values('B')");

            stmnt1.execute("insert into sec_set_class8 values('A')");
            stmnt1.execute("insert into sec_set_class8 values('B')");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    void connectdba() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //String url = "jdbc:oracle:oci8:@";
        String url = "jdbc:mysql://localhost:3306/sms";
        con = DriverManager.getConnection(url, "root", "root");

        stmnt1 = con.createStatement();
    }

    public static void main(String[] args) throws SQLException {
        new DataModel();
    }
}
