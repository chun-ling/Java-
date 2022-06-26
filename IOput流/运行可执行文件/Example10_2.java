package 运行可执行文件;

import java.io.File;

public class Example10_2 {
    public static void main(String[] args) {
        try{
            Runtime ce = Runtime.getRuntime();
            File file = new File("Notepad.exe");//在任何目录下，皆可以直接运行的文件
            ce.exec(file.getName());

            file = new File("D:\\IDEA\\IOput\\src\\运行可执行文件\\EXCEL.xlsx");
            //并非所有目录下皆可运行的exe文件，必须写绝对路径
            ce.exec(file.getName());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
