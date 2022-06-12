package WindowEventÊÂ¼þ;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	Boy police;
	MyFrame(String s){
		super(s);
		police = new Boy();
		setBounds(100,100,200,300);
		setVisible(true);
		addWindowListener(police);
		validate();
	}

}
