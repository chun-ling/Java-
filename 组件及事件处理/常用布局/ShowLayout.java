package ���ò���;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class ShowLayout extends JFrame{
	PanelGridLayout panelGrid;
	PaneNullLayout panelNull;
	JTabbedPane p;
	ShowLayout(){
		panelGrid = new PanelGridLayout();
		panelNull = new PaneNullLayout();
		p = new JTabbedPane();
		p.add("���񲼾ֵ����",panelGrid);
		p.add("�ղ��ֵ����",panelNull);
		add(p,BorderLayout.CENTER);
		add(new JButton("������BorderLayout����"),BorderLayout.NORTH);
		add(new JButton("��"),BorderLayout.SOUTH);
		add(new JButton("��"),BorderLayout.WEST);
		add(new JButton("��"),BorderLayout.EAST);
		setBounds(100,10,570,390);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		validate();
	}

}
