package UserDefinedExceptions;

public class UserDefinedException extends RuntimeException{
	String errormsg = "";
	
	public UserDefinedException() {
		errormsg = "invalid String Default meassage";
	}
	public UserDefinedException(String errormsg) {
		this.errormsg = errormsg;
	}
	@Override
	public String toString() {
		return "InvalidName [errormsg=" + errormsg + "]";
	}

}
