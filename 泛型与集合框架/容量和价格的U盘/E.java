package �����ͼ۸��U��;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class E {
    public static void main(String[] args) {
        int capicity[] = {64,32,256,128};
        int price[] = {20,100,50,1};
        TreeMap<U_disk_key,U_disk>treeMap = new TreeMap<>();
        U_disk u_disk[] = new U_disk[4];
        U_disk_key u_disk_key[] = new U_disk_key[4];
        int k = 0;


        while(k < capicity.length){
            u_disk[k] = new U_disk(capicity[k],price[k]);
            k++;
        }

        k = 0;
        while (k < capicity.length) {
            u_disk_key[k] = new U_disk_key(capicity[k]);
            k++;
        }

        k = 0;
        while (k < capicity.length) {
            treeMap.put(u_disk_key[k],u_disk[k]);
            k++;
        }

        Collection collection = treeMap.values();
        Iterator iter = collection.iterator();
        System.out.println("����������");
        while (iter.hasNext()) {
            U_disk u = (U_disk) iter.next();
            System.out.println("������" + u.capacity + " �۸�" + u.price);
        }


        treeMap.clear();//����ɨһ�������е�Ԫ��
        k = 0;
        while (k < capicity.length) {
            u_disk_key[k] = new U_disk_key(price[k]);
            k++;
        }

        k = 0;
        while (k < capicity.length) {
            treeMap.put(u_disk_key[k],u_disk[k]);
            k++;
        }

        collection = treeMap.values();
        iter = collection.iterator();
        System.out.println("���۸�����");
        while (iter.hasNext()) {
            U_disk u = (U_disk) iter.next();
            System.out.println("������" + u.capacity + " �۸�" + u.price);
        }
    }
}
