package MouseMotionEventÊÂ¼þ;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowMove extends JFrame {
	LP layeredPane;
	WindowMove(){
		layeredPane = new LP();
		add(layeredPane,BorderLayout.CENTER);
		//add(new JButton("±±"),BorderLayout.NORTH);
		setVisible(true);
		layeredPane.setBounds(12,12,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
