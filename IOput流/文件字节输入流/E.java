package 文件字节输入流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class E {
    public static void main(String[] args) {
        int n = -1;
        byte[]a = new byte[3];
        try{
            File f = new File("hello.txt");//第一步，创建水源
            InputStream in = new FileInputStream(f);//第二部，接上水龙头
            n = in.read(a,0,2);//第三步，放水；将文本中的字节读到字节数组中；len是所能读取的最多的字节，不能超出数组的长度，但实际读取的字节可以少于len
            System.out.println(n);//输出所读的字节数
            String s = new String(a,0,n);//将字节数组转变为字符串
            System.out.println(s);
            n = in.read(a,0,3);//从上次停止读取的位置开始读取字节,如果读到文件最后仍然读，则返回-1
            System.out.println(n);
            s = new String(a,0,n);//把字节数组转换为字符串时，一定长度是n
            System.out.println(s);
            n = in.read(a,0,3);//从上次停止读取的位置开始读取字节

        }catch (IOException e){
            System.out.println("File read Error" + e);
        }
    }
}
