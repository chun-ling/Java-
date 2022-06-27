package 文件字符输入和输出流;

import java.io.*;

public class Example10_6 {
    public static void main(String[] args) {
        File sourceFile = new File("a.txt");
        File targetFile = new File("b.txt");
        char c[] = new char[19];
        try{
            Writer out = new FileWriter(targetFile,true);
            Reader in = new FileReader(sourceFile);
            int n;
            while((n = in.read(c,0,19)) != -1){
                out.write(c,0,n);
            }
            out.flush();//先关闭缓冲
            out.close();
        }
        catch (IOException e){
            System.out.println("Error:" + e);
        }
    }
}
