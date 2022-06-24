package 双色球对话框;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyWindow extends JFrame {
	JButton button;
	JTextArea showRedBall;
	int[] redNumber;
	MyWindow(){
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init() {
		button = new JButton("得到双色球彩票的一组红球");
		showRedBall = new JTextArea();
		showRedBall.setForeground(Color.red);
		add(button,BorderLayout.NORTH);
		add(new JScrollPane(showRedBall),BorderLayout.CENTER);
		button.addActionListener((e)->{
			redNumber = MyDialog.showRandomArrayDialog(this,"红球号码","双色球对话框",MyDialog.YES_NO_OPTION,33,6);
			if(redNumber != null) {
				Arrays.sort(redNumber);
				showRedBall.append(Arrays.toString(redNumber) + "\n");
			}
		});
		Font f = new Font("",Font.BOLD,28);
		SetFont.setFont(f,button,showRedBall);
		
	}

}
