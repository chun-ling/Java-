package ����finally���쳣��;

public class Example7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoBoat ship = new CargoBoat();
		ship.setMaxContent(1000);
		int m = 0;
		try {
			m = 600;
			ship.loading(m);
			m = 400;
			ship.loading(m);
			m = 367;
			ship.loading(m);
			m = 555;
			ship.loading(m);
		}
		catch(DangerException e) {
			System.out.println(e);
			System.out.println("�޷���װ������Ϊ" + m + "�ֵļ�װ��");
			try {
				ship.loading(-1000);
			}
			catch(DangerException exp) {
				System.exit(0);
			}
			finally {
				System.out.printf("����������������\n");
				System.out.println("Ŀǰװ����" + ship.realContent + "�ֻ���");
			}
		}

	}

}
