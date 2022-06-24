package 文件的属性;

import java.io.File;
import java.io.IOException;

public class Example10_1 {
    public static void main(String[] args) {
        File f = new File("src\\文件的属性\\Example10_1.java");
        System.out.println(f.getName() + "文件是可读的吗？" + f.canRead());
        System.out.println(f.getName() + "的长度" + f.length());
        System.out.println(f.getName() + "的绝对路径" + f.getAbsolutePath());


        File file = new File("src\\文件的属性\\new.txt");//创建File类时，主要使用这一种构造方法
        //路径不要求真实存在
        //写文件用相对路径
        if(!file.exists()){
            try{
                file.createNewFile();//此时才真正地创建出了文件，用构造方法时并没有创建文件
                System.out.println("在当前目录下，创建了新文件" + file.getName());
            }
            catch(IOException e){}
        }

    }
}
