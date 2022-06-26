package 文件字节输入流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example10_4 {
    public static void main(String[] args) {
        int n = -1;
        byte[]a = new byte[100];
        try{
            File f = new File("src\\运行可执行文件\\Example10_4.java");
            InputStream in = new FileInputStream(f);//可能报错
            while((n = in.read(a,0,100)) != -1){//可能报错
                String s = new String(a,0,n);
                System.out.print(s);
            }
            in.close();//可能报错
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
