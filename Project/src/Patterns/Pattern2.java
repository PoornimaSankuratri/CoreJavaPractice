package Patterns;

public class Pattern2 {
	public static void main(String args[]) {
		int num = 4;
		pattern2(num);
	}

	public static void pattern2(int num) {
		int j;
		for (int i = 0; i < num; i++) {
			for (j = 1; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = j; k <= num; k++) {
				System.out.print("*");
			}
			System.out.println();
	
		}
	}
}
