package 老师代码;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUItest extends JFrame implements ActionListener{
	
	private JButton btn;
	private JTextField jtf;
	private JMenuBar bar;
	private JMenu menu1,menu2;//不可响应，只能展开
	private JMenuItem item1,item2,item3;//可相应
	public GUItest(String title) {
		super(title);
		btn = new JButton("确定");
		jtf = new JTextField(10);
		bar = new JMenuBar();
		menu1 = new JMenu("File");
		menu2 = new JMenu("Edit");
		item1 = new JMenuItem("seaech");
		item2 = new JMenuItem("haha");
		
		setJMenuBar(bar);
		bar.add(menu1);
		bar.add(menu2);
		menu1.add(item1);
		menu2.add(item2);
		menu1.add(menu2);
		setVisible(true);
		setBounds(300,300,300,300);
		setLayout(new FlowLayout());
		Container content = this.getContentPane();
		content.add(jtf);
		add(btn);
		btn.addActionListener(this);
		jtf.addActionListener(this);
		jtf.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]) {
		new GUItest("窗口");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showConfirmDialog(null, "确定");
		
	}
}

	
