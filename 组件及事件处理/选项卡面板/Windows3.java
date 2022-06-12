package 选项卡面板;
import 常用容器.Windows;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Windows3 extends JFrame{
	JPanel panel,p;
	JTextArea textArea;
	JButton button;
	JTabbedPane tabbedPane;
	Windows win;
	public Windows3() {
		win = new Windows();
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel = new JPanel();
		p = new JPanel();
		textArea = new JTextArea(12,40);
		button = new JButton("确定");
		//button.setSize(10, 10);
		p.add(button);
		//panel.setBackground(Color.pink);
		tabbedPane.add("文本区",textArea);
		tabbedPane.add("按钮",p);
		tabbedPane.add("面板",win.panel);
		add(tabbedPane,BorderLayout.CENTER);
		setLocation(100,100);
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
