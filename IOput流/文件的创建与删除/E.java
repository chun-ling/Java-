package 文件的创建与删除;

import java.io.File;

public class E {
    public static void main(String[] args) {
        File file = new File("src\\letter.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("在当前目录下创建了新文件：" + file.getName());
            }catch(Exception e){
                System.out.println(e);
            }
        }
        File f = new File("FileAccept.java");
        System.out.println(f.delete());
    }
}
