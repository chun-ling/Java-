package MouseEvent�¼�;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WindowMouse extends JFrame {
	JButton button;
	JTextArea area;
	MousePolice police;
	WindowMouse(){
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	void init() {
		setLayout(new FlowLayout());
		area = new JTextArea(10,28);
		Font font = new Font("����",Font.PLAIN,22);
		area.setFont(font);
		police = new MousePolice();
		police.setView(this);
		button = new JButton("��ť");
		button.addMouseListener(police);
		addMouseListener(police);
		add(button);
		add(new JScrollPane(area));
	}

}
