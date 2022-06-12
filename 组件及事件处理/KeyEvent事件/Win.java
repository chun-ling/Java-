package KeyEvent事件;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Win extends JFrame {
	JTextField text[] = new JTextField[3];
	Police police;
	JButton button;
	public Win() {
		setLayout(new FlowLayout());
		Font font = new Font("宋体",Font.BOLD,36);
		police = new Police();
		police.setView(this);
		for(int i = 0;i < 3;i ++) {
			text[i] = new JTextField(20);
			text[i].addKeyListener(police);
			text[i].addFocusListener(police);
			add(text[i]);
			text[i].setFont(font);
		}
		button = new JButton("确定");
		button.addFocusListener(police);
		button.setFont(font);
		add(button);
		setVisible(true);
		text[0].requestFocusInWindow();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
