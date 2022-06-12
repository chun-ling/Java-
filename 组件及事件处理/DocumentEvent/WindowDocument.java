package DocumentEvent;


import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.text.Document;

public class WindowDocument extends JFrame {
	JTextArea inputText;
	JTextArea showText;
	JMenuBar menubar;
	JMenu menu;
	JMenuItem itemCopy;
	JMenuItem itemCut;
	JMenuItem itemPaste;
	TextListener textChangeListener;
	HandleListener handleListener;
	WindowDocument(){
		init();
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void init() {
		// TODO Auto-generated method stub
		inputText = new JTextArea(10,28);
		showText = new JTextArea(10,28);
		showText.setLineWrap(true);
		showText.setWrapStyleWord(true);
		Font font = new Font("ËÎÌå",Font.PLAIN,25);
		inputText.setFont(font);
		showText.setFont(font);
		menubar = new JMenuBar();
		menu = new JMenu("±à¼­");
		itemCopy = new JMenuItem("¸´ÖÆ(C)");
		itemCut = new JMenuItem("¼ôÇÐ(T)");
		itemPaste = new JMenuItem("Õ³Ìù(P)");
		itemCopy.setAccelerator(KeyStroke.getKeyStroke('c'));
		itemCut.setAccelerator(KeyStroke.getKeyStroke('t'));
		itemPaste.setAccelerator(KeyStroke.getKeyStroke('p'));
		itemCopy.setActionCommand("copy");
		itemCut.setActionCommand("cut");
		itemPaste.setActionCommand("paste");
		menu.add(itemCopy);
		menu.add(itemCut);
		menu.add(itemPaste);
		menubar.add(menu);
		setJMenuBar(menubar);
		add(new JScrollPane(inputText));
		add(new JScrollPane(showText));
		textChangeListener = new TextListener();
		handleListener = new HandleListener();
		textChangeListener.setView(this);
		handleListener.setView(this);
		Document document = inputText.getDocument();
		document.addDocumentListener(textChangeListener);
		itemCopy.addActionListener(handleListener);
		itemCut.addActionListener(handleListener);
		itemPaste.addActionListener(handleListener);
	}

}
