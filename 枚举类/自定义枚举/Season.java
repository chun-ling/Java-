package 自定义枚举;


/* 1.不提供setXxx方法，因为枚举对象值为只读
 * 2.对枚举对象/属性使用final + static 共同修饰，实现底层优化
 * 3.枚举对象名通常使用全部大写，常量的命名规范
 * 4.枚举对象根据需要，也可以由多个属性*/


public class Season {
	String name;
	String desc;
	
	public static final Season SPRING = new Season("春天","温暖");//类的内部创建一组对象
	public static final Season WINTER = new Season("冬天","寒冷");
	public static final Season SUMMER = new Season("夏天","炎热");//对外暴露对象（通常为对象添加public final static修饰符）
	public static final Season AUTUMN = new Season("秋天","凉爽");
	private Season(String name,String desc) {//构造器私有化
		this.name = name;
		this.desc = desc;
	}
	public String getName() {//可以提供get方法，但是不要提供set
		return name;
	}
	public String getDesc() {
		return desc;
	}
	
	public String toString() { 
		return name + " " + desc;
	}

}
