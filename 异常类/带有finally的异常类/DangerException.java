package ����finally���쳣��;

public class DangerException extends Exception{
	final String message = "����";
	
	public DangerException(String s) {
		super(s);
	}
	public String warnMess() {
		return message;
	}

}
