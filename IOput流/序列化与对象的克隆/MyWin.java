package 序列化与对象的克隆;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * @author YUChangcan
 * @date 2022/6/28 - 9:13
 */
public class MyWin extends JFrame implements ActionListener {
    JLabel label;
    JButton write;
    JButton read;
    ByteArrayOutputStream out;
    MyWin(){
        setLayout(new FlowLayout());
        label = new JLabel("How are you");
        write = new JButton("write");
        read = new JButton("read");
        write.addActionListener(this);
        read.addActionListener(this);
        setVisible(true);
        add(label);
        add(write);
        add(read);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == write){
            try{
                out = new ByteArrayOutputStream();
                ObjectOutputStream objectOut = new ObjectOutputStream(out);
                objectOut.writeObject(label);
                objectOut.close();
            }catch (IOException exception){}
        }
        if(e.getSource() == read){
            try{
                ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
                ObjectInputStream objectIn = new ObjectInputStream(in);
                JLabel temp = (JLabel)objectIn.readObject();
                temp.setText(e.getActionCommand());
                add(temp);
                validate();
                objectIn.close();
            }catch (Exception exception){}
        }
    }
}
