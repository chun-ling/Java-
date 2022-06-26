package OutPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example10_5 {
    public static void main(String[] args) {
        byte[]a = "新年快乐".getBytes();//utf-8中，中文占三个字节
        byte[]b = "Happy New Year".getBytes();
        try{
            File file = new File("a.txt");
            OutputStream out= new FileOutputStream(file);
            System.out.println(file.getName() + " length:" + file.length() + " bytes");//file.length()返回的是字节长度
            out.write(a);
            out.close();
            out = new FileOutputStream(file,true);//有“true”则不刷新
            System.out.println(file.getName() + " length:" + file.length() + " bytes");

            out.write(b,0,b.length);//选择性地从字符数组中写入字节
            System.out.println(file.getName() + " length:" + file.length() + " bytes");

            out.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
