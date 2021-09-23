package Patterns;

public class Pattern4 {
	public static void main(String arg[]) {
		int num;
		pattern4(4);
	}

	public static void pattern4(int num) {
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/*
 * s 0 i 1 n 5 st 5 s 1 i 2 n 5 st 4 s 2 i 3 n 5 st 3
 */
