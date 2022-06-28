package 使用Scanner解析文件;

import java.io.File;
import java.util.Scanner;

/**
 * @author YUChangcan
 * @date 2022/6/28 - 9:53
 */
public class Example10_15 {
    public static void main(String[] args) {
        File file = new File("cost.txt");
        int sum = 0;
        Scanner sc ;
            try{
                sc = new Scanner(file);
                sc.useDelimiter("\\D+");
                while(sc.hasNextInt()){
                    int price = sc.nextInt();
                    sum = sum + price;
                    System.out.println(price);
                 }
            System.out.println("Total cost:" + sum);
        }catch (Exception e){
                System.out.println(e);
            }
    }
}
