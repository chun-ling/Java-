package 带有finally的异常类;

public class CargoBoat {
	int realContent;
	int maxContent;
	public void setMaxContent(int c) {
		maxContent = c;
	}
	public void loading(int m)throws DangerException{
		realContent += m;
		if(realContent > maxContent) {
			throw new DangerException("超重");
		}
	}

}
