package com.hasib.app;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;

public class TreePanel {

    public TreePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    void change_look(String feel_and_look) {
        looks = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(feel_and_look);
            SwingUtilities.updateComponentTreeUI(Tree_Panel);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();
    }
    public UIManager.LookAndFeelInfo looks[];

    public void initComponents() {
        Tree_Panel = new javax.swing.JPanel();
        jTree1 = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();

        Tree_Panel.setBackground(new java.awt.Color(51, 51, 51));
        jTree1.setFont(new java.awt.Font("Tahoma", 1, 12));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Administrator");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Student");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Information");

        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Result");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Add Student");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Show Form");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Teacher");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Informationl");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Add Teacher");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Show Form");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Operator");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Information");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Add Operator");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Show Form");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        /*        javax.swing.GroupLayout Tree_PanelLayout = new javax.swing.GroupLayout(Tree_Panel);
        Tree_Panel.setLayout(Tree_PanelLayout);
        Tree_PanelLayout.setHorizontalGroup(
        Tree_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        Tree_PanelLayout.setVerticalGroup(
        Tree_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1232, Short.MAX_VALUE)
        );
         */ Tree_Panel.setLayout(new java.awt.BorderLayout());
        Tree_Panel.add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }

    javax.swing.JPanel getPanel() {
        return Tree_Panel;
    }
    public javax.swing.JPanel Tree_Panel;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTree jTree1;
}
