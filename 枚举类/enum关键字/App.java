package enum关键字;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Season.ATUMN);//输出toString
		
		Season autumn = Season.ATUMN;
		
		System.out.println(autumn.name);//输出该枚举对象的名字
		
		System.out.println(autumn.ordinal());//输出该枚举对象次序
		
		//从反编译可以看到values方法，返回Season[]
		Season[] values = Season.values();//
		for(Season season : values) {
			System.out.println(season);
		}
		
		//valueOf:将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则异常
		Season autumn1 = Season.valueOf("ATUMN");//根据输入的"ATUMN"到SEASON中的枚举对象中寻找
		System.out.println("autumn1=" + autumn1);
		
		System.out.println(Season.ATUMN.compareTo(Season.SUMMER));//比较ATUMN与SUMMER的编号
		//return self.ordinal - other.ordinal;

	}

}
