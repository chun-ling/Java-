package ObjectOutputStream;

import java.io.Serializable;

/**
 * @author YUChangcan
 * @date 2022/6/28 - 8:17
 */
public class TV implements Serializable {//实现序列化接口，当读写对象时，JVM自动调用该接口中的方法，将对象读写
    String name;
    int price;
    public void setName(String s){
        name = s;
    }
    public void setPrice(int n){
        price = n;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
