package 链表中的常用方法;

public class People {
    public int height;
    People(int h){
        height = h;
    }

    public boolean equals(Object o){//Object类中的方法
        People p = (People)o;
        if(this.height == p.height)
            return true;
        else
            return false;
    }
}
