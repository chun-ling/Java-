package 目录;

import java.io.File;

public class Example10_2 {
    public static void main(String[] args) {
        File javaDir = new File("java");
        System.out.println(javaDir.isDirectory());
        boolean boo = javaDir.mkdir();
        if(boo){
            System.out.println("新建子目录" + javaDir.getName());
        }

        File dirFile = new File(".");//new File(".")构建根目录
        System.out.println("全部文件（包含文件夹）：");
        String fileName[] = dirFile.list();//list()方法，返回该目录下所有文件的String名字
        if(fileName == null){
            System.out.println("没有文件");
        }else {
            for(String name:fileName){
                System.out.println(name);
            }
        }
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java");
        System.out.println("仅仅列出Java源文件：");
        File file[] = dirFile.listFiles(fileAccept);//listFiles()方法返回该目录下的File文件，listFiles(fileAccept)返回特定后缀的文件
        if(file.length == 0){
            System.out.println("没有java源文件");
        }
        else{
            for(File f:file){
                System.out.println(f.getName());
            }
        }

    }
}
