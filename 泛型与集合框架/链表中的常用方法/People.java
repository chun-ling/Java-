package �����еĳ��÷���;

public class People {
    public int height;
    People(int h){
        height = h;
    }

    public boolean equals(Object o){//Object���еķ���
        People p = (People)o;
        if(this.height == p.height)
            return true;
        else
            return false;
    }
}
