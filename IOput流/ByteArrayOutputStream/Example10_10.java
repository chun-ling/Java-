package ByteArrayOutputStream;

import java.io.*;

public class Example10_10 {
    public static void main(String[] args) {
        try{
            ByteArrayOutputStream outByte = new ByteArrayOutputStream();//数组输出流不需要指向文件，参数为空，指向内存
            byte[]byteContent = "mid-autumn festival".getBytes();//字节数组byteContent中，获得字节
            outByte.write(byteContent);//把byteContent数组中的字节写入内存中
            ByteArrayInputStream inByte = new ByteArrayInputStream(outByte.toByteArray());//数组输入流指向输出流所创建的数组
            byte backByte[] = new byte[outByte.toByteArray().length];
            inByte.read(backByte);//数组输入流读取输出流中的字节
            System.out.println(new String(backByte));

            CharArrayWriter outChar = new CharArrayWriter();
            char[]charContent = "中秋快乐".toCharArray();
            outChar.write(charContent);
            CharArrayReader inChar = new CharArrayReader(outChar.toCharArray());
            char backChar[] = new char[outChar.toCharArray().length];
            inChar.read(backChar);
            System.out.println(new String(backChar));
        }catch (IOException e){}
    }
}
