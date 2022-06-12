package 把按钮绑定到窗口;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class BindButtonWindow extends JFrame{
	JButton button;
	Police listener;
	BindButtonWindow(){
		setLayout(new FlowLayout());
		listener = new Police();
		button = new JButton("单机我或按“A”键移动我");
		add(button);
		button.addActionListener(listener);
		InputMap inputmap = button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputmap.put(KeyStroke.getKeyStroke("A"), "dog");
		ActionMap actionmap = button.getActionMap();
		actionmap.put("dog", listener);
		setVisible(true);
		setBounds(100,100,200,200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	class Police extends AbstractAction{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			int x = b.getBounds().x;
			int y = b.getBounds().y;
			b.setLocation(x + 10,y + 10);
		}
	}

}
