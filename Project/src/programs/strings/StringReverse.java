package programs.strings;

public class StringReverse {

	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("hello");
		stringReverse(sb);
	}

	public static StringBuilder stringReverse(StringBuilder s) {
		StringBuilder rev = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev.append(c);
		}
		System.out.println(rev);
		return rev;
	}
}