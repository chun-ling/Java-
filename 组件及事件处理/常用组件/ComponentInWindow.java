package �������;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ComponentInWindow extends JFrame{
	JCheckBox checkBox1;
	JCheckBox checkBox2;
	JRadioButton radioM;
	JRadioButton radioF;
	ButtonGroup group;
	JComboBox<String>comBox;
	public ComponentInWindow() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init() {
		setLayout(new FlowLayout());
		comBox = new JComboBox<String>();
		checkBox1 = new JCheckBox("ϲ������");
		checkBox2 = new JCheckBox("ϲ������");
		group = new ButtonGroup();
		radioM = new JRadioButton("��");
		radioF = new JRadioButton("Ů");
		group.add(radioM);
		group.add(radioF);
		add(checkBox1);
		add(checkBox2);
		add(radioM);
		add(radioF);
		comBox.addItem("�������");
		comBox.addItem("�������");
		add(comBox);
	}

}
