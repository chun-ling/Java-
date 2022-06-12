package 常用布局;

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
		p.add("网格布局的面板",panelGrid);
		p.add("空布局的面板",panelNull);
		add(p,BorderLayout.CENTER);
		add(new JButton("窗体是BorderLayout布局"),BorderLayout.NORTH);
		add(new JButton("南"),BorderLayout.SOUTH);
		add(new JButton("西"),BorderLayout.WEST);
		add(new JButton("东"),BorderLayout.EAST);
		setBounds(100,10,570,390);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		validate();
	}

}
