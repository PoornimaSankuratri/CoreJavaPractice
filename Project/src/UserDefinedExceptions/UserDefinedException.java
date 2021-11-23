package UserDefinedExceptions;

public class Exception extends RuntimeException{
	String errormsg = "";
	
	public Exception() {
		errormsg = "invalid String Default meassage";
	}
	public Exception(String errormsg) {
		this.errormsg = errormsg;
	}
	@Override
	public String toString() {
		return "InvalidName [errormsg=" + errormsg + "]";
	}

}
