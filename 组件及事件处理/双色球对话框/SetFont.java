package Ë«É«Çò¶Ô»°¿ò;

import java.awt.Font;

import javax.swing.JComponent;

public class SetFont {
	public static void setFont(Font f,JComponent ...com) {
		for(JComponent c:com) {
			c.setFont(f);
		}
	}

}
