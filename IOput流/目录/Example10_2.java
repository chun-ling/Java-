package Ŀ¼;

import java.io.File;

public class Example10_2 {
    public static void main(String[] args) {
        File javaDir = new File("java");
        System.out.println(javaDir.isDirectory());
        boolean boo = javaDir.mkdir();
        if(boo){
            System.out.println("�½���Ŀ¼" + javaDir.getName());
        }

        File dirFile = new File(".");//new File(".")������Ŀ¼
        System.out.println("ȫ���ļ��������ļ��У���");
        String fileName[] = dirFile.list();//list()���������ظ�Ŀ¼�������ļ���String����
        if(fileName == null){
            System.out.println("û���ļ�");
        }else {
            for(String name:fileName){
                System.out.println(name);
            }
        }
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java");
        System.out.println("�����г�JavaԴ�ļ���");
        File file[] = dirFile.listFiles(fileAccept);//listFiles()�������ظ�Ŀ¼�µ�File�ļ���listFiles(fileAccept)�����ض���׺���ļ�
        if(file.length == 0){
            System.out.println("û��javaԴ�ļ�");
        }
        else{
            for(File f:file){
                System.out.println(f.getName());
            }
        }

    }
}
