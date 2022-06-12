package MouseMotionEvent事件;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;

public class LP extends JLayeredPane implements MouseListener,MouseMotionListener{
	JButton buttonTom;
	JButton buttonJerry;
	int x,y,a,b,x0,y0;
	LP(){
		buttonTom = new JButton("用鼠标拖动Tom");
		buttonTom.addMouseListener(this);
		buttonTom.addMouseMotionListener(this);
		buttonJerry = new JButton("用鼠标拖动Jerry");
		buttonJerry.addMouseListener(this);
		buttonJerry.addMouseMotionListener(this);
		setLayout(new FlowLayout());
		add(buttonTom,JLayeredPane.DEFAULT_LAYER);
		add(buttonJerry,JLayeredPane.DEFAULT_LAYER);
		
	}
	public void mousePressed(MouseEvent e) {
		JComponent com = null;
		com = (JComponent)e.getSource();
		setLayer(com,JLayeredPane.DRAG_LAYER);
		a = com.getBounds().x;
		b = com.getBounds().y;
		x0 = e.getX();
		y0 = e.getY();
	}
	public void mouseReleased(MouseEvent e) {
		JComponent com = null;
		com = (JComponent)e.getSource();
		setLayer(com,JLayeredPane.DEFAULT_LAYER);
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {
		Component com = null;
		if(e.getSource() instanceof Component) {
			com = (Component)e.getSource();
			a = com.getBounds().x;
			//System.out.println(a);
			b = com.getBounds().y;
			x = e.getX();
			System.out.println(x);
			y = e.getY();
			a = a + x;
			b = b + y;
			com.setLocation(a - x0,b - y0);
		}
	}

}
