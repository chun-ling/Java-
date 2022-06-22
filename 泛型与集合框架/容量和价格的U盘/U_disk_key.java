package 容量和价格的U盘;

public class U_disk_key implements Comparable<U_disk_key>{
    int key;
    U_disk_key(int key){
        this.key = key;
    }
    public int compareTo(U_disk_key key){
        return this.key - key.key;
    }

}
