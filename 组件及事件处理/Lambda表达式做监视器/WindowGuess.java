package Lambda���ʽ��������;

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
		buttonGetNumber = new JButton("�õ�һ���������1��100��");
		add(buttonGetNumber);
		hintLabel = new JLabel("������Ĳ²⣺");
		//hintLabel.setBackground(Color.red);
		inputGuess = new JTextField(10);
		add(hintLabel);
		add(inputGuess);
		buttonEnter = new JButton("ȷ��");
		add(buttonEnter);
		buttonEnter.addActionListener(this);//�õ�ǰ������Ϊ������
		buttonGetNumber.addActionListener((e) -> {//��Lambda���ʽ��������
			number = (int)(Math.random()*100) + 1;
			count = 0;
			hintLabel.setText("������Ĳ²⣺");
			inputGuess.setText(null);
			buttonEnter.setEnabled(true);
		});
		Font font = new Font("����",Font.PLAIN,30);
		SetFont.setFont(font, hintLabel,buttonGetNumber,inputGuess);//ͳһ�������������
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
				hintLabel.setText("�¶��ˣ��²������" + count + "��");
				buttonEnter.setEnabled(false);
				buttonGetNumber.setEnabled(true);
			}
			else if(guess > number) {
				hintLabel.setText("�´��ˣ��²������" + count + "��");
				inputGuess.setText(null);
			}
			else if(guess < number) {
				hintLabel.setText("��С�ˣ��²������" + count + "��");
				inputGuess.setText(null);
			}
		}
		catch(NumberFormatException event) {
			hintLabel.setText("�����������ַ�");
		}
	}
}
