package OutPutStream;

import java.io.*;

public class E {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        try {
//            OutputStream out = new FileOutputStream(file);//如果当前目录之下没有该文件则创建文件，如果有该文件，则刷新该文件
            OutputStream out = new FileOutputStream(file,true);//不刷新该文件
            out.write('a');
            out.write(66);
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
