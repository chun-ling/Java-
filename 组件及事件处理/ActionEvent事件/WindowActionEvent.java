package ActionEventÊÂ¼þ;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class WindowActionEvent extends JFrame {
	JTextField text;
	ActionListener listener;
	public WindowActionEvent() {
		setLayout(new FlowLayout());
		text = new JTextField(10);
		add(text);
		listener = new ReaderListener();
		text.addActionListener(listener);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
