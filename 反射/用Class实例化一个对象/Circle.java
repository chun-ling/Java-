package 用Class实例化一个对象;

/**
 * @author YUChangcan
 * @date 2022/7/1 - 9:51
 */
public class Circle {
    public double radius;
    public void setRadius(double r){
        radius = r;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
