package ActionEventÊÂ¼þ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReaderListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = e.getActionCommand();
		System.out.println(str + ":" + str.length());

	}

}
