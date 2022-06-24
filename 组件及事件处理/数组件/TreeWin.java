package 数组件;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import 双色球对话框.SetFont;

public class TreeWin extends JFrame{
	JTree tree;
	JTextArea showText;
	TreesListener listener;
	TreeWin(){
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("商品");
		DefaultMutableTreeNode nodeTV = new DefaultMutableTreeNode("电视机类");
		DefaultMutableTreeNode nodePhone = new DefaultMutableTreeNode("手机类");
		DefaultMutableTreeNode tv1 = new DefaultMutableTreeNode(new Goods("长虹电视",4000));
		DefaultMutableTreeNode tv2 = new DefaultMutableTreeNode(new Goods("海尔电视",4500));
		DefaultMutableTreeNode phone1 = new DefaultMutableTreeNode(new Goods("诺基亚手机",3000));
		DefaultMutableTreeNode phone2 = new DefaultMutableTreeNode(new Goods("三星手机",3500));
		root.add(nodeTV);
		root.add(nodePhone);
		nodeTV.add(tv2);
		nodeTV.add(tv1);
		nodePhone.add(phone2);
		nodePhone.add(phone1);
		tree = new JTree(root);
		listener = new TreesListener();
		listener.setView(this);
		tree.addTreeSelectionListener(listener);
		showText = new JTextArea();
		setLayout(new GridLayout(3,3));
		add(new JScrollPane(tree));
		add(new JScrollPane(showText));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(80,80,600,500);
		Font f = new Font("宋体",Font.PLAIN,22);
		SetFont.setFont(f, showText,tree);
		validate();
	}

}
