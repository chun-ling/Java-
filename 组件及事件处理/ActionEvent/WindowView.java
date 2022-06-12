package ActionEvent;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowView extends JFrame {
	public JTextField inputText;
	public JTextArea textShow;
	public JButton button;
	PoliceListener listener;
	public WindowView() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	void init() {
		// TODO Auto-generated method stub
		setLayout(new FlowLayout());
		Font font = new Font("宋体",Font.PLAIN,20);
		inputText = new JTextField(20);
		inputText.setFont(font);
		button = new JButton("确定");
		button.setFont(font);
		font = new Font("宋体",Font.BOLD,22);
		textShow = new JTextArea(9,30);
		textShow.setFont(font);
		listener = new PoliceListener();
		listener.setView(this);
		inputText.addActionListener(listener);
		button.addActionListener(listener);
		add(inputText);
		add(button);
		add(new JScrollPane(textShow));
		
	}

}
