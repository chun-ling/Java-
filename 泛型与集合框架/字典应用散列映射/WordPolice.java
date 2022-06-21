package 字典应用散列映射;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class WordPolice implements ActionListener {
    JTextField showText;
    HashMap<String,String>hashtable;
    File file = new File("word.txt");
    Scanner sc ;
    WindowWord view;
    WordPolice(WindowWord w) {
        view = w;
        hashtable = new HashMap<String,String>();
        try {
            sc = new Scanner(file);

            while (sc.hasNext()) {
                String englishWord = sc.next();
                String chineseWord = sc.next();
                hashtable.put(englishWord, chineseWord);
            }
        } catch (Exception e) {
        }
    }

        public void setJTextField(JTextField showText){
            this.showText = showText;
        }

        public void actionPerformed(ActionEvent e){
            String englishWord = e.getActionCommand();//效果等同于view.inputText.getText()
            if(hashtable.containsKey(englishWord)){
                String chineseWord = hashtable.get(englishWord);
                showText.setText(chineseWord);
        }
            else{
                showText.setText("没有此单词");
            }
    }
}
