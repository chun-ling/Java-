package �ļ��Ĵ�����ɾ��;

import java.io.File;

public class E {
    public static void main(String[] args) {
        File file = new File("src\\letter.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("�ڵ�ǰĿ¼�´��������ļ���" + file.getName());
            }catch(Exception e){
                System.out.println(e);
            }
        }
        File f = new File("FileAccept.java");
        System.out.println(f.delete());
    }
}
