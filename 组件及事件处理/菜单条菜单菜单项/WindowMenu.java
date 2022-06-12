package 菜单条菜单菜单项;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class WindowMenu extends JFrame{
	JMenuBar menubar;
	JMenu menuFruit;
	JMenuItem bananaItem;
	JMenuItem pearItem;
	JMenu appleMenu;
	JMenuItem redAppleItem;
	JMenuItem yellowAppleItem;
	public WindowMenu() {}
	public WindowMenu(String s,int x,int y,int w,int h) {
		init(s);
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	void init(String s) {
		setTitle(s);
		menubar = new JMenuBar();
		menuFruit = new JMenu("水果菜单");
		bananaItem = new JMenuItem("香蕉");
		bananaItem.setIcon(new ImageIcon("banana.jpg"));
		pearItem = new JMenuItem("甜梨");
		pearItem.setIcon(new ImageIcon("pear.jpg"));
		appleMenu = new JMenu("苹果");
		redAppleItem = new JMenuItem("红苹果");
		redAppleItem.setIcon(new ImageIcon("redApple.jpg"));
		yellowAppleItem = new JMenuItem("黄苹果");
		yellowAppleItem.setIcon(new ImageIcon("yellowApple.jpg"));
		menuFruit.add(bananaItem);
		menuFruit.add(pearItem);
		menuFruit.addSeparator();
		menuFruit.add(appleMenu);
		appleMenu.add(redAppleItem);
		appleMenu.add(yellowAppleItem);
		menubar.add(menuFruit);
		setJMenuBar(menubar);
	}
	

}
