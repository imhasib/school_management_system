package com.hasib.app;

import java.sql.*;
import java.util.StringTokenizer;

class SelectAndInsertData {

    Connection con;
    Statement stmnt1, stmnt_marks, stmnt_getTuple, stmnt_edit, stmnt_sub, stmnt_result, stmnt_search1, stmnt_search2, stmnt_basicInfo, stmnt_login;
    ResultSet result, resultLast_id, singleresult, result_id_r_n, result_sub, result_marks, result_temp, result_search1, result_search2, result_basicInfo, result_login;
    int searchResultFound = 0;
    String[][] dataArray = new String[300][18];

    SelectAndInsertData() throws SQLException {
        connectdba();
        //showdata(numberOfTuple);
    }

    void insertTuple(String s) {
        //System.out.println(s);
        try {
            stmnt1.execute(s);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        //System.out.println(s);
    }

    String[][] getTuples(String stdClass, String section, String sessionYear) {
        String[][] temp_dataArray;
        int len = 0;
        //System.out.println(stdClass+"	"+section+"	"+"	"+sessionYear);
        if (stdClass.equals("Select Class")); else {
            try {
                if (sessionYear.equals("Select Session")) {
                    sessionYear = "2010";
                }
                if (section.equals("Select Section")) {
                    result = stmnt_getTuple.executeQuery("select * from std_info where stdclass='" + stdClass + "' and sessionyear=" + sessionYear + " order by section,roll");
                } else {
                    result = stmnt_getTuple.executeQuery("select * from std_info where stdclass='" + stdClass + "' and section='" + section + "' and sessionyear=" + sessionYear + " order by roll");
                }

                while (result.next()) {
                    for (int j = 0; j < 18; j++) {
                        dataArray[result.getRow() - 1][j] = result.getString(j + 1);
                    }
                    len++;
                }
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }

        temp_dataArray = new String[len][18];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 18; j++) {
                temp_dataArray[i][j] = dataArray[i][j];
            }
        }

        return temp_dataArray;
    }

    String[][] getTuples(String s) {
        String[][] temp_dataArray = new String[20][18]; //imagine section=7
        String[][] temp_dataArray2;
        int a = 0;
        try {
            result = stmnt_getTuple.executeQuery(s);
            while (result.next()) {
                for (int j = 0; j < 18; j++) {
                    temp_dataArray[a][j] = result.getString(j + 1);
                }
                a++;
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        temp_dataArray2 = new String[a][18];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 18; j++) {
                temp_dataArray2[i][j] = temp_dataArray[i][j];
            }
        }
        //for(int i=0;i<a;i++)
        //System.out.println(""+temp_dataArray2[i][4]+"	"+temp_dataArray2[i][5]+"	"+temp_dataArray2[i][1]);
        return temp_dataArray2;
    }

    String[] getTuple(int s_id) {
        String[] ss = new String[18];
        try {
            singleresult = stmnt1.executeQuery("select * from std_info where id=" + s_id);
            if (singleresult.next()) {
                for (int j = 0; j < 18; j++) {
                    ss[j] = singleresult.getString(j + 1);
                }
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return ss;
    }

    void deleteTuple(String s) {
        try {
            stmnt1.execute(s);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }

    void deleteSingleTuple(int d_id) {
        try {
            stmnt1.execute("delete from std_info where id=" + d_id);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }

    void deleteSingleTuple(int d_id, String c) {
        try {
            stmnt1.execute("delete from " + c + " where id=" + d_id);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    void updateTuple(String s) {
        try {
            //System.out.println(s);
            stmnt_edit.executeUpdate(s);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    void updateLastid(int id) {
        try {
            stmnt1.executeUpdate("update lastid set id=" + (id + 1) + " where id=" + id);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    int getidvalue() {
        int giv = 0;
        try {
            resultLast_id = stmnt1.executeQuery("select * from lastid");
            if (resultLast_id.next()) {
                giv = resultLast_id.getInt(1);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return giv;
    }

    String[][] getSubByClass() {
        String[][] temp_sub = new String[13][11];
        try {
            for (int i = 0; i < 8; i++) {
                result_sub = stmnt_sub.executeQuery("select subject from sub_set_class" + (i + 1));
                int j = 0;
                while (result_sub.next()) {
                    temp_sub[i][j] = result_sub.getString(1);
                    j++;
                }
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return temp_sub;
    }

    String[][] getSubCodeByClass() {
        String[][] temp_sub = new String[13][11];
        try {
            for (int i = 0; i < 8; i++) {
                result_sub = stmnt_sub.executeQuery("select subjectcode from sub_set_class" + (i + 1));
                int j = 0;
                while (result_sub.next()) {
                    temp_sub[i][j] = result_sub.getString(1);
                    j++;
                }
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return temp_sub;
    }

    String getSubCode(String s) {
        String temp_subCode = "";
        try {
            result_temp = stmnt_sub.executeQuery(s);
            result_temp.next();
            temp_subCode = result_temp.getString(1);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return temp_subCode;
    }

    String[][] getSecByClass() {
        String[][] temp_sec = new String[13][8];
        try {
            for (int i = 0; i < 8; i++) {
                result_temp = stmnt1.executeQuery("select section from sec_set_class" + (i + 1) + " order by section");
                int j = 0;
                while (result_temp.next()) {
                    temp_sec[i][j] = result_temp.getString(1);
                    j++;
                }
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return temp_sec;
    }

    String[][] getroll_name(String c, String s, String sem) {
        String[][] temp_r_n = new String[200][3];
        String[][] temp2_r_n;
        int a = 0;
        try {
            //System.out.println("select "+c+".id,"+c+".roll,std_info.name from "+c+",std_info where "+c+".section='"+s+"' and "+c+".id=std_info.id and "+c+".semester="+sem+" order by roll");
            result_id_r_n = stmnt_marks.executeQuery("select " + c + ".id," + c + ".roll,std_info.name from " + c + ",std_info where " + c + ".section='" + s + "' and " + c + ".id=std_info.id and " + c + ".semester=" + sem + " order by roll");
            while (result_id_r_n.next()) {
                for (int j = 0; j < 3; j++) {
                    temp_r_n[a][j] = result_id_r_n.getString(j + 1);
                }
                a++;
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        temp2_r_n = new String[a][3];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 3; j++) {
                temp2_r_n[i][j] = temp_r_n[i][j];
            }
        }
        return temp2_r_n;
    }

    String[][] getMarks(int nc, String s) {
        String[][] temp_marks = new String[200][5];
        String[][] temp2_marks;
        int a = 0;

        try {
            //System.out.println(s);
            result_marks = stmnt_marks.executeQuery(s);
            while (result_marks.next()) {
                for (int j = 0; j < nc; j++) {
                    if ((result_marks.getString(j + 1) == null)) {
                        temp_marks[a][j] = "";
                    } else {
                        temp_marks[a][j] = result_marks.getString(j + 1);
                    }
                }
                a++;
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        temp2_marks = new String[a][5];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 5; j++) {
                if ((temp_marks[i][j] == null)) {
                    temp2_marks[i][j] = "";
                } else {
                    temp2_marks[i][j] = temp_marks[i][j];
                }
            }
        }
        return temp2_marks;
    }

    int[] getSubjectMarks(int count, String s) {
        int[] subjectMarks = new int[count];

        try {
            result_temp = stmnt1.executeQuery(s);
            while (result_temp.next()) {
                for (int j = 0; j < count; j++) {
                    subjectMarks[j] = result_temp.getInt(j + 1);
                }
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return subjectMarks;
    }

    int[] searchArraySPname(String name) {
        String tokens[] = new String[10];
        String str1 = "", str2 = "";
        int A1[] = new int[1000];//FulName Matched id
        int A2[] = new int[5000];//Name Tokens Matched id
        int A3[] = new int[5000];
        int finalArray[] = new int[5000];
        int spaceCounter = 0;
        int breaker = 0;

        int i = 0;
        int count1 = 0, count2 = 0;
        StringTokenizer st = new StringTokenizer(name, " ");
        while (st.hasMoreTokens()) {
            tokens[i] = st.nextToken();
            i++;
        }
        //Get FulName Matched id starts
        try {
            str1 = "select id from std_info where REGEXP_LIKE(name,'" + name + "','i')" + "order by name";
            result_search1 = stmnt_search1.executeQuery(str1);
            while (result_search1.next()) {
                A1[count1] = result_search1.getInt(1);
                count1++;
                //	System.out.print(result_search1.getInt(1));
            }

            //Get FulName Matched id sends
            if (i == 1) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')" + "order by name";
            } else if (i == 2) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i')" + "order by name";
            } else if (i == 3) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i')" + "order by name";
            } else if (i == 4) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') or REGEXP_LIKE(name,'" + tokens[3] + "','i')" + "order by name";
            } else if (i >= 5) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') or REGEXP_LIKE(name,'" + tokens[3] + "','i') or REGEXP_LIKE(name,'" + tokens[4] + "','i')" + "order by name";
            }

            result_search2 = stmnt_search2.executeQuery(str2);
            while (result_search2.next()) {
                A2[count2] = result_search2.getInt(1);
                count2++;
                //	System.out.print(result_search2.getInt(1));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        //Final Array Make starts
        System.out.println("");
        for (int i1 = 0; i1 < count2; i1++) {
            for (int i2 = 0; i2 < count1; i2++) {
                if (A2[i1] == A1[i2]) {
                    breaker++;
                }
            }
            if (breaker != 0) {
                spaceCounter++;
                breaker = 0;
            } else if (breaker == 0) {
                int in = A2[i1];
                A3[i1 - spaceCounter + 1] = in;
                //System.out.print(A3[i1-spaceCounter+1]);
                //System.out.println("");
            }
        }
        //Really final!!!!!
        for (int i3 = 0; i3 < count2; i3++) {
            if (i3 < count1) {
                int r = A1[i3];
                finalArray[i3] = r;
            } else if (i3 >= count1) {
                int rr = A3[i3 - count1 + 1];
                finalArray[i3] = rr;
            }
        }
        searchResultFound = count2;
        //Final Array Make finishes
        return finalArray;
    }

    int[] searchArraySPname(String name, String std_class) {
        String tokens[] = new String[10];
        String str1 = "", str2 = "";
        int A1[] = new int[1000];//FulName Matched id
        int A2[] = new int[5000];//Name Tokens Matched id
        int A3[] = new int[5000];
        int finalArray[] = new int[5000];
        int spaceCounter = 0;
        int breaker = 0;

        int i = 0;
        int count1 = 0, count2 = 0;
        StringTokenizer st = new StringTokenizer(name, " ");
        while (st.hasMoreTokens()) {
            tokens[i] = st.nextToken();
            i++;
        }
        //Get FulName Matched id starts
        try {
            str1 = "select id from std_info where REGEXP_LIKE(name,'" + name + "','i') and stdClass='" + std_class + "' order by name";
            System.out.println(str1);
            result_search1 = stmnt_search1.executeQuery(str1);
            while (result_search1.next()) {
                A1[count1] = result_search1.getInt(1);
                count1++;
                //	System.out.print(result_search1.getInt(1));
            }

            //Get FulName Matched id sends
            if (i == 1) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')and stdClass='" + std_class + "' order by name";
            } else if (i == 2) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') and stdClass='" + std_class + "' order by name";
            } else if (i == 3) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') and stdClass='" + std_class + "' order by name";
            } else if (i == 4) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') or REGEXP_LIKE(name,'" + tokens[3] + "','i') and stdClass='" + std_class + "' order by name";
            } else if (i >= 5) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') or REGEXP_LIKE(name,'" + tokens[3] + "','i') or REGEXP_LIKE(name,'" + tokens[4] + "','i') and stdClass='" + std_class + "' order by name";
            }

            System.out.println(str2);

            result_search2 = stmnt_search2.executeQuery(str2);
            while (result_search2.next()) {
                A2[count2] = result_search2.getInt(1);
                count2++;
                //	System.out.print(result_search2.getInt(1));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        //Final Array Make starts
        System.out.println("");
        for (int i1 = 0; i1 < count2; i1++) {
            for (int i2 = 0; i2 < count1; i2++) {
                if (A2[i1] == A1[i2]) {
                    breaker++;
                }
            }
            if (breaker != 0) {
                spaceCounter++;
                breaker = 0;
            } else if (breaker == 0) {
                int in = A2[i1];
                A3[i1 - spaceCounter + 1] = in;
                //System.out.print(A3[i1-spaceCounter+1]);
                //System.out.println("");
            }
        }
        //Really final!!!!!
        for (int i3 = 0; i3 < count2; i3++) {
            if (i3 < count1) {
                int r = A1[i3];
                finalArray[i3] = r;
            } else if (i3 >= count1) {
                int rr = A3[i3 - count1 + 1];
                finalArray[i3] = rr;
            }
        }
        searchResultFound = count2;
        //Final Array Make finishes
        return finalArray;
    }

    int[] searchArraySPname(String name, String std_class, int Roll) {
        String tokens[] = new String[10];
        String str1 = "", str2 = "";
        int A1[] = new int[1000];//FulName Matched id
        int A2[] = new int[5000];//Name Tokens Matched id
        int A3[] = new int[5000];
        int finalArray[] = new int[5000];
        int spaceCounter = 0;
        int breaker = 0;

        int i = 0;
        int count1 = 0, count2 = 0;
        StringTokenizer st = new StringTokenizer(name, " ");
        while (st.hasMoreTokens()) {
            tokens[i] = st.nextToken();
            i++;
        }
        //Get FulName Matched id starts
        try {
            str1 = "select id from std_info where REGEXP_LIKE(name,'" + name + "','i') and stdClass='" + std_class + "' and roll=" + Roll + " order by name";
            System.out.println(str1);
            result_search1 = stmnt_search1.executeQuery(str1);
            while (result_search1.next()) {
                A1[count1] = result_search1.getInt(1);
                count1++;
                //	System.out.print(result_search1.getInt(1));
            }

            //Get FulName Matched id sends
            if (i == 1) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')and stdClass='" + std_class + "' and roll=" + Roll + " order by name";
            } else if (i == 2) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') and stdClass='" + std_class + "' and roll=" + Roll + " order by name";
            } else if (i == 3) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') and stdClass='" + std_class + "' and roll=" + Roll + " order by name";
            } else if (i == 4) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') or REGEXP_LIKE(name,'" + tokens[3] + "','i') and stdClass='" + std_class + "' and roll=" + Roll + " order by name";
            } else if (i >= 5) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') or REGEXP_LIKE(name,'" + tokens[3] + "','i') or REGEXP_LIKE(name,'" + tokens[4] + "','i') and stdClass='" + std_class + "' and roll=" + Roll + " order by name";
            }

            System.out.println(str2);

            result_search2 = stmnt_search2.executeQuery(str2);
            while (result_search2.next()) {
                A2[count2] = result_search2.getInt(1);
                count2++;
                //	System.out.print(result_search2.getInt(1));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        //Final Array Make starts
        System.out.println("");
        for (int i1 = 0; i1 < count2; i1++) {
            for (int i2 = 0; i2 < count1; i2++) {
                if (A2[i1] == A1[i2]) {
                    breaker++;
                }
            }
            if (breaker != 0) {
                spaceCounter++;
                breaker = 0;
            } else if (breaker == 0) {
                int in = A2[i1];
                A3[i1 - spaceCounter + 1] = in;
                //System.out.print(A3[i1-spaceCounter+1]);
                //System.out.println("");
            }
        }
        //Really final!!!!!
        for (int i3 = 0; i3 < count2; i3++) {
            if (i3 < count1) {
                int r = A1[i3];
                finalArray[i3] = r;
            } else if (i3 >= count1) {
                int rr = A3[i3 - count1 + 1];
                finalArray[i3] = rr;
            }
        }
        searchResultFound = count2;
        //Final Array Make finishes
        return finalArray;
    }

    int[] searchArraySPname(String name, int Roll) {
        String tokens[] = new String[10];
        String str1 = "", str2 = "";
        int A1[] = new int[1000];//FulName Matched id
        int A2[] = new int[5000];//Name Tokens Matched id
        int A3[] = new int[5000];
        int finalArray[] = new int[5000];
        int spaceCounter = 0;
        int breaker = 0;

        int i = 0;
        int count1 = 0, count2 = 0;
        StringTokenizer st = new StringTokenizer(name, " ");
        while (st.hasMoreTokens()) {
            tokens[i] = st.nextToken();
            i++;
        }
        //Get FulName Matched id starts
        try {
            str1 = "select id from std_info where REGEXP_LIKE(name,'" + name + "','i') and roll=" + Roll + " order by name";
            System.out.println(str1);
            result_search1 = stmnt_search1.executeQuery(str1);
            while (result_search1.next()) {
                A1[count1] = result_search1.getInt(1);
                count1++;
                //	System.out.print(result_search1.getInt(1));
            }

            //Get FulName Matched id sends
            if (i == 1) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')and roll=" + Roll + " order by name";
            } else if (i == 2) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') and roll=" + Roll + " order by name";
            } else if (i == 3) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') and roll=" + Roll + " order by name";
            } else if (i == 4) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') or REGEXP_LIKE(name,'" + tokens[3] + "','i') and roll=" + Roll + " order by name";
            } else if (i >= 5) {
                str2 = "select id from std_info where REGEXP_LIKE(name,'" + tokens[0] + "','i')or REGEXP_LIKE(name,'" + tokens[1] + "','i') or REGEXP_LIKE(name,'" + tokens[2] + "','i') or REGEXP_LIKE(name,'" + tokens[3] + "','i') or REGEXP_LIKE(name,'" + tokens[4] + "','i') and roll=" + Roll + " order by name";
            }

            System.out.println(str2);

            result_search2 = stmnt_search2.executeQuery(str2);
            while (result_search2.next()) {
                A2[count2] = result_search2.getInt(1);
                count2++;
                //	System.out.print(result_search2.getInt(1));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        //Final Array Make starts
        System.out.println("");
        for (int i1 = 0; i1 < count2; i1++) {
            for (int i2 = 0; i2 < count1; i2++) {
                if (A2[i1] == A1[i2]) {
                    breaker++;
                }
            }
            if (breaker != 0) {
                spaceCounter++;
                breaker = 0;
            } else if (breaker == 0) {
                int in = A2[i1];
                A3[i1 - spaceCounter + 1] = in;
                //System.out.print(A3[i1-spaceCounter+1]);
                //System.out.println("");
            }
        }
        //Really final!!!!!
        for (int i3 = 0; i3 < count2; i3++) {
            if (i3 < count1) {
                int r = A1[i3];
                finalArray[i3] = r;
            } else if (i3 >= count1) {
                int rr = A3[i3 - count1 + 1];
                finalArray[i3] = rr;
            }
        }
        searchResultFound = count2;
        //Final Array Make finishes
        return finalArray;
    }

    int[] searchArraySPname(int Roll) {
        String str1 = "";
        int finalArray[] = new int[5000];
        int count1 = 0;

        try {
            str1 = "select id from std_info where roll=" + Roll + " order by name";
            System.out.println(str1);
            result_search1 = stmnt_search1.executeQuery(str1);
            while (result_search1.next()) {
                finalArray[count1] = result_search1.getInt(1);
                count1++;
                System.out.println(finalArray[count1]);
                //	System.out.print(result_search1.getInt(1));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        searchResultFound = count1;
        //Final Array Make finishes
        return finalArray;
    }

    int getSearchResultFound() {
        return searchResultFound;
    }

    String[] getBasicInfo(int r) {
        String str1 = "", str2 = "";
        String basicInfoArray[] = new String[7];

        try {
            str1 = "Select name,id,roll,stdclass,sessionyear,contact from std_info where id=" + r;
            result_basicInfo = stmnt_basicInfo.executeQuery(str1);
            while (result_basicInfo.next()) {
                basicInfoArray[0] = result_basicInfo.getString(1);
                basicInfoArray[1] = result_basicInfo.getString(2);
                basicInfoArray[2] = result_basicInfo.getString(3);
                basicInfoArray[3] = result_basicInfo.getString(4);
                basicInfoArray[4] = result_basicInfo.getString(5);
                basicInfoArray[5] = result_basicInfo.getString(6);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return basicInfoArray;
    }

    void connectdba() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //String url = "jdbc:oracle:oci8:@127.0.0.1:8080";
        String url = "jdbc:mysql://localhost:3306/sms";
        con = DriverManager.getConnection(url, "root", "root");

        stmnt1 = con.createStatement();
        stmnt_marks = con.createStatement();
        stmnt_getTuple = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        stmnt_edit = con.createStatement();
        stmnt_sub = con.createStatement();
        stmnt_result = con.createStatement();
        stmnt_search1 = con.createStatement();
        stmnt_search2 = con.createStatement();
        stmnt_basicInfo = con.createStatement();
        stmnt_login = con.createStatement();
    }
}
