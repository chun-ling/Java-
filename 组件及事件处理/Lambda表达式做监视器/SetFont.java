package Lambda���ʽ��������;

import java.awt.Font;

import javax.swing.JComponent;

public class SetFont {
	public static void setFont(Font f,JComponent ...component) {
		for(JComponent c:component)
			c.setFont(f);
	}

}
