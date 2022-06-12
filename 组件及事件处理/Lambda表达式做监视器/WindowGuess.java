package Lambda表达式做监视器;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WindowGuess extends JFrame implements ActionListener{
	int number;
	byte count;
	JLabel hintLabel;
	JTextField inputGuess;
	JButton buttonGetNumber;
	JButton buttonEnter;
	public WindowGuess() {
		number = (int)(Math.random()*100) + 1;
		setLayout(new FlowLayout());
		buttonGetNumber = new JButton("得到一个随机数（1至100）");
		add(buttonGetNumber);
		hintLabel = new JLabel("输入你的猜测：");
		//hintLabel.setBackground(Color.red);
		inputGuess = new JTextField(10);
		add(hintLabel);
		add(inputGuess);
		buttonEnter = new JButton("确定");
		add(buttonEnter);
		buttonEnter.addActionListener(this);//用当前窗口作为监视器
		buttonGetNumber.addActionListener((e) -> {//用Lambda表达式做监视器
			number = (int)(Math.random()*100) + 1;
			count = 0;
			hintLabel.setText("输入你的猜测：");
			inputGuess.setText(null);
			buttonEnter.setEnabled(true);
		});
		Font font = new Font("宋体",Font.PLAIN,30);
		SetFont.setFont(font, hintLabel,buttonGetNumber,inputGuess);//统一设置组件的字体
		setBounds(100,100,150,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		validate();
	}
	public void actionPerformed(ActionEvent e) {
		buttonGetNumber.setEnabled(false);
		int guess = 0;
		try {
			guess = Integer.parseInt(inputGuess.getText());
			count++;
			if(guess == number) {
				hintLabel.setText("猜对了（猜测次数：" + count + "）");
				buttonEnter.setEnabled(false);
				buttonGetNumber.setEnabled(true);
			}
			else if(guess > number) {
				hintLabel.setText("猜大了（猜测次数：" + count + "）");
				inputGuess.setText(null);
			}
			else if(guess < number) {
				hintLabel.setText("猜小了（猜测次数：" + count + "）");
				inputGuess.setText(null);
			}
		}
		catch(NumberFormatException event) {
			hintLabel.setText("请输入数字字符");
		}
	}
}
