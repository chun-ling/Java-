package Java反射;

/**
 * @author YUChangcan
 * @date 2022/7/1 - 9:07
 */
public class Rect {

        double width;
        double height;
        double area;
        public Rect(){}
        public Rect(double w, double h){
            width = w;
            height = h;
        }
        public double getArea(){
            area = height*width;
            return area;
        }

}
