package 带有finally的异常类;

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
			System.out.println("无法再装载重量为" + m + "吨的集装箱");
			try {
				ship.loading(-1000);
			}
			catch(DangerException exp) {
				System.exit(0);
			}
			finally {
				System.out.printf("货船将在正点启航\n");
				System.out.println("目前装载了" + ship.realContent + "吨货物");
			}
		}

	}

}
