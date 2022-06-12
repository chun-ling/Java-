package FocusEventÊÂ¼þ;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PoliceFocus implements FocusListener{
	Winfocus view;
	public void setView(Winfocus view) {
		this.view = view;
	}
	public void focusGained(FocusEvent e) {
		if(e.getSource() == view.text) {
			view.text.setForeground(Color.red);
		}
		if(e.getSource() == view.button) {
			view.button.setForeground(Color.blue);
		}
	}
	public void focusLost(FocusEvent e) {
		if(e.getSource() == view.text) {
			view.text.setForeground(Color.green);
		}
		if(e.getSource() == view.button) {
			view.button.setForeground(Color.pink);
		}
	}

}
