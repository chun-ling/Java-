package �ļ�������;

import java.io.File;
import java.io.IOException;

public class Example10_1 {
    public static void main(String[] args) {
        File f = new File("src\\�ļ�������\\Example10_1.java");
        System.out.println(f.getName() + "�ļ��ǿɶ�����" + f.canRead());
        System.out.println(f.getName() + "�ĳ���" + f.length());
        System.out.println(f.getName() + "�ľ���·��" + f.getAbsolutePath());


        File file = new File("src\\�ļ�������\\new.txt");//����File��ʱ����Ҫʹ����һ�ֹ��췽��
        //·����Ҫ����ʵ����
        //д�ļ������·��
        if(!file.exists()){
            try{
                file.createNewFile();//��ʱ�������ش��������ļ����ù��췽��ʱ��û�д����ļ�
                System.out.println("�ڵ�ǰĿ¼�£����������ļ�" + file.getName());
            }
            catch(IOException e){}
        }

    }
}
