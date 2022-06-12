package 常用容器;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class Windows extends JFrame{
	public JPanel panel;
	JTextArea textArea;
	JButton button;
	JScrollPane scroll;
	JSplitPane split;
	public Windows() {
		panel = new JPanel();
		textArea = new JTextArea(12,40);
		scroll = new JScrollPane(textArea);
		button = new JButton("确定");
		split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,button,scroll);
		panel.setBackground(Color.pink);
		panel.add(split);
		//panel.add(button);
		//panel.add(textArea);
		add(panel,BorderLayout.CENTER);
		setLocation(100,100);
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
