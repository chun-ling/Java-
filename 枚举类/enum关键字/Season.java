package enum�ؼ���;


public enum Season {
	
	/*1.ʹ�ùؼ���enum���class
	 * 2.public static final Season SPRING = new Season("����","��ů");ֱ����SPRING("����","��ů")�����������(ʵ���б�)
	 * 3.����ж�����������󣩣�ʹ�ã��������
	 * 4.���ʹ��enum��ʵ��ö�٣�Ҫ�󽫶��峣������д����ǰ��
	 */
	SPRING("����","��ů"),WINTER("����","����"),SUMMER("����","����"),ATUMN("����","��ˬ"),WET;
	
	
	String name;
	String desc;
	
	private Season(String name,String desc) {//������˽�л�
		this.name = name;
		this.desc = desc;
	}
	
	private Season() {}
	
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
