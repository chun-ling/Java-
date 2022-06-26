package Writer_Reader;

import java.io.*;

public class E {
    public static void main(String[] args) {
        try{
            File file = new File("a.txt");
            Writer out = new FileWriter(file,true);
            out.write('我');
            out.close();

            Reader in = new FileReader(file);
            int n = in.read();
            System.out.printf("%d,%c\n",n,(char)n);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
