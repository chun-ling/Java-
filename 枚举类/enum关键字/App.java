package enum�ؼ���;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Season.ATUMN);//���toString
		
		Season autumn = Season.ATUMN;
		
		System.out.println(autumn.name);//�����ö�ٶ��������
		
		System.out.println(autumn.ordinal());//�����ö�ٶ������
		
		//�ӷ�������Կ���values����������Season[]
		Season[] values = Season.values();//
		for(Season season : values) {
			System.out.println(season);
		}
		
		//valueOf:���ַ���ת����ö�ٶ���Ҫ���ַ�������Ϊ���еĳ������������쳣
		Season autumn1 = Season.valueOf("ATUMN");//���������"ATUMN"��SEASON�е�ö�ٶ�����Ѱ��
		System.out.println("autumn1=" + autumn1);
		
		System.out.println(Season.ATUMN.compareTo(Season.SUMMER));//�Ƚ�ATUMN��SUMMER�ı��
		//return self.ordinal - other.ordinal;

	}

}
