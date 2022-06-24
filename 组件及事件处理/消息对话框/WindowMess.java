package 消息对话框;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowMess extends JFrame implements ActionListener {
	JTextField inputEnglish;
	JTextArea show;
	String regex = "[a-zA-Z]+";
	WindowMess(){
		inputEnglish = new JTextField(30);
		inputEnglish.addActionListener(this);
		show = new JTextArea();
		add(inputEnglish,BorderLayout.NORTH);
		add(show,BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		String str = inputEnglish.getText();
		if(str.matches(regex)) {
			show.append(str + ",");
		}
		else {
			JOptionPane.showMessageDialog(this,"输出了非法字符","消息对话框",JOptionPane.ERROR_MESSAGE);
		}
	}

}
