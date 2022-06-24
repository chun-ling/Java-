package �����;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import ˫ɫ��Ի���.SetFont;

public class TreeWin extends JFrame{
	JTree tree;
	JTextArea showText;
	TreesListener listener;
	TreeWin(){
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("��Ʒ");
		DefaultMutableTreeNode nodeTV = new DefaultMutableTreeNode("���ӻ���");
		DefaultMutableTreeNode nodePhone = new DefaultMutableTreeNode("�ֻ���");
		DefaultMutableTreeNode tv1 = new DefaultMutableTreeNode(new Goods("�������",4000));
		DefaultMutableTreeNode tv2 = new DefaultMutableTreeNode(new Goods("��������",4500));
		DefaultMutableTreeNode phone1 = new DefaultMutableTreeNode(new Goods("ŵ�����ֻ�",3000));
		DefaultMutableTreeNode phone2 = new DefaultMutableTreeNode(new Goods("�����ֻ�",3500));
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
		Font f = new Font("����",Font.PLAIN,22);
		SetFont.setFont(f, showText,tree);
		validate();
	}

}
