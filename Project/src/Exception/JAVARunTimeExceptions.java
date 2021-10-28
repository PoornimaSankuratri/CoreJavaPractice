package Exception;

public class JAVARunTimeExceptions {
	public static void main(String args[]) {
		
		try { //ArrayIndexOutOfBoundsException
			int a[] = new int[10];
			a[11] = 3;
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		
		try {//NullPointerException
			String st = null;
			int i = st.length();
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
		
		try {//ArithmeticException
			int a = 10, b = 0;
			int d = a / b;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		
		try {//NumberFormatException
			String s = "Poornima";
			int i = Integer.parseInt(s);
		} catch (NumberFormatException ne) {
			System.out.println(ne);
		}

		try {//StringIndexOutOfBoundsException
			String s = "Poornima";
			char c = s.charAt(10);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		

		finally {
			System.out.println("JAVA Exceptions");
		}
	}
}
