package 字典应用散列映射;

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
        police = new WordPolice(this);//尝试用构造方法传递view
        police.setJTextField(showText);//不用setview方法把输出框传到监视器中
        inputText.addActionListener(police);
        setBounds(100,100,400,280);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
