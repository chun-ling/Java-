package �ֵ�Ӧ��ɢ��ӳ��;

import javax.swing.*;
import java.awt.*;

public class WindowWord extends JFrame {
    JTextField inputText;
    JTextField showText;
    WordPolice police;
    WindowWord(){
        setLayout(new FlowLayout());
        inputText = new JTextField(10);
        showText = new JTextField(10);
        add(inputText);
        add(showText);
        police = new WordPolice(this);//�����ù��췽������view
        police.setJTextField(showText);//����setview����������򴫵���������
        inputText.addActionListener(police);
        setBounds(100,100,400,280);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
