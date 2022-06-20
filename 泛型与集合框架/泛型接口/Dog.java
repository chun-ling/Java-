package ·ºÐÍ½Ó¿Ú;


public class Dog implements Comparable<Dog>{
    int weight;
    public int compareTo(Dog m){
        if(weight > m.weight)
            return 1;
        else if(weight == m.weight)
            return 0;
        else
            return -1;
    }
}
