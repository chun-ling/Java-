package FocusEvent事件;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Winfocus extends JFrame {
	JTextField text;
	JButton button;
	PoliceFocus police;
	public Winfocus(){
		setLayout(new FlowLayout());
		text = new JTextField("大家好");
		button = new JButton("按钮");
		police = new PoliceFocus();
		police.setView(this);
		text.addFocusListener(police);
		button.addFocusListener(police);
		Font font = new Font("宋体",Font.BOLD,36);
		text.setFont(font);
		add(text);
		add(button);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
