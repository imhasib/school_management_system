package com.hasib.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class InputResultForm
{
	InputResultForm()
	{		
		initComponent();
	}
	
	void initComponent()
	{
		input_panel=new JPanel();
		upperComboboxPanel=new JPanel();
		lowerbuttonPanel=new JPanel();
		cbstd_class=new JComboBox();
		cbsection=new JComboBox();
		cbsemester=new JComboBox();
		cbsubject=new JComboBox();
		but_ok=new JButton("OK");
		but_submit=new JButton("Submit");
		but_clearAll=new JButton("Clear All");
		
		cbstd_class.setModel(new DefaultComboBoxModel(new String[] {"Select Class","Class I","Class II","Class III","Class IV", "Class V", "Class VI", "Class VII", "Class VIII", "Class IX", "Class X", "Class Play", "Class K.G.", "Class Nursary"}));
		cbsection.setModel(new DefaultComboBoxModel(new String[] {"Select Section"}));
		cbsubject.setModel(new DefaultComboBoxModel(new String[] {"Select Subject"}));
		cbsemester.setModel(new DefaultComboBoxModel(new String[] {"Select Semester","Semester-I","Semester-II","Semester-III"}));
		
		input_panel.setLayout(new BorderLayout());
		upperComboboxPanel.setLayout(new FlowLayout());
		lowerbuttonPanel.setLayout(new FlowLayout());
		
		myTableModel= new javax.swing.table.DefaultTableModel();
		myTableModel.setColumnIdentifiers(new Object[]{"Roll", "Name","Attendence","Termtest","Subjectiove","Objective","Total Marks"});
		
	    TableColumnModel cm = new DefaultTableColumnModel() 
	    {
	      
			int col=0;
	      public void addColumn(TableColumn tc) {
	        
	        if(col>1)
	        {
	        	tc.setMinWidth(117);
	        	super.addColumn(tc);
	        }
	        col++;
	      }
	    };
	
	    TableColumnModel rowHeaderModel = new DefaultTableColumnModel() 
	    {
			int col=0;
		      public void addColumn(TableColumn tc) 
		      {
		          if(col<2)
		          {
		          	if(col==0)
		          	{
		          	tc.setMaxWidth(tc.getPreferredWidth());
		          	super.addColumn(tc);
		          	}
		          	else
		          	{
		          		tc.setMinWidth(165);
		          		tc.setMaxWidth(tc.getPreferredWidth());
		          		super.addColumn(tc);
		          	}
		          }
		          col++;
		      }
	    };
	
	    marksTable = new JTable(myTableModel, cm);
	    r_nTable = new JTable(myTableModel, rowHeaderModel);
	    marksTable.createDefaultColumnsFromModel();
	    r_nTable.createDefaultColumnsFromModel();
	
	    marksTable.setSelectionModel(r_nTable.getSelectionModel());
	    r_nTable.setSelectionModel(marksTable.getSelectionModel());
	
	    r_nTable.setBackground(Color.lightGray);
	    r_nTable.setColumnSelectionAllowed(true);
	    r_nTable.setCellSelectionEnabled(true);
	
	    JViewport jv = new JViewport();
	    jv.setView(r_nTable);
	    jv.setPreferredSize(r_nTable.getMaximumSize());
	
	    marksTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	
	    JScrollPane jsp = new JScrollPane(marksTable);
	    jsp.setRowHeader(jv);
	    jsp.setCorner(ScrollPaneConstants.UPPER_LEFT_CORNER, r_nTable.getTableHeader());
	    
	    upperComboboxPanel.add(new JLabel("Class"));
	    upperComboboxPanel.add(cbstd_class);
	    upperComboboxPanel.add(new JLabel("Section"));
	    upperComboboxPanel.add(cbsection);
	    upperComboboxPanel.add(new JLabel("Semester"));
	    upperComboboxPanel.add(cbsemester);
	    upperComboboxPanel.add(new JLabel("Subject"));
	    upperComboboxPanel.add(cbsubject);
	    upperComboboxPanel.add(but_ok);
	    lowerbuttonPanel.add(but_clearAll);
	    lowerbuttonPanel.add(but_submit);
	    
	    input_panel.add(jsp, BorderLayout.CENTER);
	    input_panel.add(upperComboboxPanel, BorderLayout.NORTH);
	    input_panel.add(lowerbuttonPanel,BorderLayout.SOUTH);
	    
	    but_submit.setEnabled(false);
	    but_clearAll.setEnabled(false);
	    //but_ok.setEnabled(false);
	}
	
	JPanel getPanel()
	{
		return input_panel;
	}
	
	JPanel input_panel;
	JPanel upperComboboxPanel;
	JPanel lowerbuttonPanel;
	JComboBox cbstd_class;
	JComboBox cbsection;
	JComboBox cbsemester;
	JComboBox cbsubject;
	JButton but_ok;
	JButton but_submit;
	JButton but_clearAll;
	JTable marksTable;
	JTable r_nTable;
	javax.swing.table.DefaultTableModel myTableModel;
}