package BufferedReader_BufferedWriter;

import java.io.*;
import java.util.StringTokenizer;

public class Example10_7 {
    public static void main(String[] args) {
        File fRead = new File("english.txt");
        File fWrite = new File("englishCount.txt");
        try{
            Writer out = new FileWriter(fWrite);//底层流接通文件
            BufferedWriter bufferedWriter = new BufferedWriter(out);//缓冲流（上层流）接通底层流
            Reader in = new FileReader(fRead);
            BufferedReader bufferedReader = new BufferedReader(in);

            String str;
            while((str = bufferedReader.readLine()) != null){//缓冲流读一行，读到str中，而不是数组中
                StringTokenizer fenxi = new StringTokenizer(str);
                int count = fenxi.countTokens();
                str = str + " the number of sentence: " + count;
                bufferedWriter.write(str);
                bufferedWriter.newLine();//新起一行
            }
            bufferedWriter.close();//只用关上层流
            in = new FileReader(fWrite);
            bufferedReader = new BufferedReader(in);
            String s;
            System.out.println(fWrite.getName() + " content: ");
            while((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }
            bufferedReader.close();
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
