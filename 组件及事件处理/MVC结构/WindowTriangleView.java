package MVC�ṹ;

import java.awt.*;
import javax.swing.*;
public class WindowTriangleView extends JFrame {
   Triangle triangle;              //ģ��
   JTextField textA,textB,textC;   //ģ����ͼ
   JTextArea showArea;             //ģ����ͼ
   JButton button;   
   Controller controller ;          //������      
   WindowTriangleView() {
      init();
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   void init() {
     triangle=new Triangle();
     textA=new JTextField(5);   
     textB=new JTextField(5);
     textC=new JTextField(5);
     showArea=new JTextArea();    
     button=new JButton("�������");
     JPanel pNorth=new JPanel();
     JLabel hintA = new JLabel("��A:");
     JLabel hintB = new JLabel("��B:");
     JLabel hintC = new JLabel("��C:");
     pNorth.add(hintA);
     pNorth.add(textA);
     pNorth.add(hintB);
     pNorth.add(textB);
     pNorth.add(hintC);
     pNorth.add(textC); 
     pNorth.add(button); 
     controller = new Controller();
     controller.setView(this);//����ǰ���ڴ��ݸ�controller��ϵĴ���
     button.addActionListener(controller);
     add(pNorth,BorderLayout.NORTH);
     Font f = new Font("����",Font.BOLD,28);
     SetFont.setFont
    (f,hintA,hintB,hintC,textA,textB,textC,showArea,button);//������14��SetFont��
     add(new JScrollPane(showArea),BorderLayout.CENTER);
   }  
}
