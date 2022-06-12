package Lambda表达式做监视器;

import java.awt.Font;

import javax.swing.JComponent;

public class SetFont {
	public static void setFont(Font f,JComponent ...component) {
		for(JComponent c:component)
			c.setFont(f);
	}

}
