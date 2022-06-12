package WindowEventÊÂ¼þ;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Boy extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

}
