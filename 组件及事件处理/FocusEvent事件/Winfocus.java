package FocusEvent�¼�;

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
		text = new JTextField("��Һ�");
		button = new JButton("��ť");
		police = new PoliceFocus();
		police.setView(this);
		text.addFocusListener(police);
		button.addFocusListener(police);
		Font font = new Font("����",Font.BOLD,36);
		text.setFont(font);
		add(text);
		add(button);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
