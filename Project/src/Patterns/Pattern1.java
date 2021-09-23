package Patterns;

public class Pattern1 {
	public static void main(String args[]) {
		int num = 5;
		pattern1(num);
	}

	public static void pattern1(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
