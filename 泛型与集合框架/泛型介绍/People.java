package 泛型与集合框架;

public class People <E>{
    E friend;
    public void setFriend(E object){

        friend = object;
    }
    public E getFriend(){
        return friend;
    }
}
