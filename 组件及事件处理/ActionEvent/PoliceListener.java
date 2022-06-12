package ActionEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoliceListener implements ActionListener {
	WindowView view;
	public void setView (WindowView view) {
		this.view = view;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.inputText) {
//			System.out.println(e.getSource());
//			System.out.println(view.inputText.getText());
			String str = view.inputText.getText();
			view.textShow.append("\"" + str + "\"µÄ³¤¶È£º" + str.length() + "\n");
		}
		else if(e.getSource() == view.button) {
			String str = view.button.getText();
			view.textShow.append(str + "\n");
		}
	}

}
