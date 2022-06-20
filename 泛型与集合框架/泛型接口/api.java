package ·ºÐÍ½Ó¿Ú;

public class api {
    public static void main(String args[]){
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.weight = 20;
        dog2.weight = 23;
        System.out.println(dog1.compareTo(dog2));
    }
}
