package 带有finally的异常类;

public class DangerException extends Exception{
	final String message = "超重";
	
	public DangerException(String s) {
		super(s);
	}
	public String warnMess() {
		return message;
	}

}
