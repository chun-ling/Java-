package DataOutputStream;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.awt.geom.AreaOp;

import java.io.*;

/**
 * @author YUChangcan
 * @date 2022/6/27 - 11:25
 */
public class Example10_11 {
    public static void main(String[] args) {
        File file = new File("a.txt");
        try{
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream outData = new DataOutputStream(fos);//数据流必须和文件字节流相绑定
            outData.writeInt(100);//不用再写读多少个字节，只用按照下一个数据类型进行读写
            outData.writeLong(123456);
            outData.writeFloat(3.141952f);
            outData.writeDouble(98765.1234);
            outData.writeBoolean(true);
            outData.writeChars("你好吗？");//每次写一个字符
        }catch (IOException e){}
        try{
            FileInputStream fis = new FileInputStream(file);
            DataInputStream inData = new DataInputStream(fis);
            System.out.println(inData.readInt());
            System.out.println(inData.readLong());
            System.out.println(inData.readFloat());
            System.out.println(inData.readDouble());
            System.out.println(inData.readBoolean());
            char c;
            while((c = inData.readChar()) != '\0'){
                System.out.print(c);
            }
        }catch (IOException e){}

    }
}
