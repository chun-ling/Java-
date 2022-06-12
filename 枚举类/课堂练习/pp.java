package 课堂练习;

public class pp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender boy = Gender.BOY;
		Gender boy2 = Gender.BOY;
		
		System.out.println(boy);//Gender没有toString方法，则调用其父类Enum的toSting方法
		//Enum的toString方法，返回的是类的名字
		System.out.println(boy2 == boy);//静态性质的，引用相同
		

	}

}
