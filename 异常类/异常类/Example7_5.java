package �쳣��;

public class Example7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int m = 0;
		int t = 1000;
		try {
			m = Integer.parseInt("8888");
			n = Integer.parseInt("ab89");
			t = 7777;
		}
		catch(NumberFormatException e) {
			System.out.println("�����쳣��" + e.getMessage());
		}
		try {
			System.out.println("�����׳�I/O�쳣��");
			throw new java.io.IOException("���ǹ����");
			//System.out.println("����ע��");
		}
		catch(java.io.IOException e) {
			System.out.println("�����쳣:" + e.getMessage());
		}

	}

}
