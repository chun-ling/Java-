package enum关键字;


public enum Season {
	
	/*1.使用关键字enum替代class
	 * 2.public static final Season SPRING = new Season("春天","温暖");直接用SPRING("春天","温暖")解读，常量名(实参列表)
	 * 3.如果有多个常量（对象），使用，间隔即可
	 * 4.如果使用enum来实现枚举，要求将定义常量对象写在最前面
	 */
	SPRING("春天","温暖"),WINTER("冬天","寒冷"),SUMMER("夏天","炎热"),ATUMN("秋天","凉爽"),WET;
	
	
	String name;
	String desc;
	
	private Season(String name,String desc) {//构造器私有化
		this.name = name;
		this.desc = desc;
	}
	
	private Season() {}
	
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
