package �Զ����쳣��;

public class Example7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		try {
			bank.income(200, -100);
			bank.income(300, -100);
			bank.income(400, -100);
			System.out.printf("����Ŀǰ��%dԪ\n",bank.getMoney());
			bank.income(200, 100);
			bank.income(99999, -100);
		}
		catch(BankException e) {
			System.out.println("��������Ĺ��̳����������⣺");
			System.out.println(e.warnMess());
		}
		System.out.printf("����Ŀǰ��%dԪ\n",bank.getMoney());
		

	}

}
