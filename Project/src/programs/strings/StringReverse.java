package programs.strings;

public class StringReverse {

	public static void main(String args[]) {
		String s = "hello";
		stringReverse(s);
	}

	public static void stringReverse(String s) {
		StringBuilder rev = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev.append(c);

		}
		System.out.println(rev);
	}
}