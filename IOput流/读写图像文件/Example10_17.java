package 读写图像文件;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author YUChangcan
 * @date 2022/6/28 - 10:19
 */
public class Example10_17 {
    public static void main(String[] args) {
        File fileRead = new File("pic.jpg");//源
        File fileWriteOne = new File("java.bmp");
        File fileWriteTwo = new File("java.jpg");
        try{
            BufferedImage image = ImageIO.read(fileRead);//ImageIO中的静态方法把源中的图片读入缓冲图片区中
            Graphics2D g = image.createGraphics();//该缓冲图片自带画笔
            int width = image.getWidth();
            int height = image.getHeight();
            Font font = new Font("宋体",Font.BOLD,36  );
            g.setFont(font);
            g.setColor(Color.GREEN);
            g.drawString("我喜欢Java",width/2,height/2);//画笔在图片上写字
            ImageIO.write(image,"bmp",fileWriteOne);//把完成的图片写入目标文件中
            ImageIO.write(image,"jpg",fileWriteTwo);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
