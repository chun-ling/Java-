package �Զ���ö��;


/* 1.���ṩsetXxx��������Ϊö�ٶ���ֵΪֻ��
 * 2.��ö�ٶ���/����ʹ��final + static ��ͬ���Σ�ʵ�ֵײ��Ż�
 * 3.ö�ٶ�����ͨ��ʹ��ȫ����д�������������淶
 * 4.ö�ٶ��������Ҫ��Ҳ�����ɶ������*/


public class Season {
	String name;
	String desc;
	
	public static final Season SPRING = new Season("����","��ů");//����ڲ�����һ�����
	public static final Season WINTER = new Season("����","����");
	public static final Season SUMMER = new Season("����","����");//���Ⱪ¶����ͨ��Ϊ�������public final static���η���
	public static final Season AUTUMN = new Season("����","��ˬ");
	private Season(String name,String desc) {//������˽�л�
		this.name = name;
		this.desc = desc;
	}
	public String getName() {//�����ṩget���������ǲ�Ҫ�ṩset
		return name;
	}
	public String getDesc() {
		return desc;
	}
	
	public String toString() { 
		return name + " " + desc;
	}

}
