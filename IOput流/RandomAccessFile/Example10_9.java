package RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Example10_9 {
    public static void main(String[] args) {
        RandomAccessFile in;
        try{
            in = new RandomAccessFile("src\\RandomAccessFile\\Example10_9.java","rw");
            long length = in.length();//获取文件的长度
            long position = 0;
            in.seek(position);
            while(position < length){
                String str = in.readLine();
                byte b[] = str.getBytes("utf-8");
                str = new String(b);
                position = in.getFilePointer();//获取当前的读写位置
                System.out.println(str);
            }
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
        System.out.println("好");
    }
}
