package 运行可执行文件;

import java.io.File;

public class Example10_3 {
    public static void main(String[] args) {
        try{
            Runtime ce = Runtime.getRuntime();
            File file = new File("Notepad.exe");
            ce.exec(file.getName());

            file = new File("D:\\IDEA\\IOput\\src\\运行可执行文件\\EXCEL.xlsx");
            ce.exec(file.getName());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
