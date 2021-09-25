package Patterns;

public class Pattern5 {
	public static void main(String args[]) {
		int num;
		pattern5(5);
	}
public static void pattern5(int num) {
	int j;
	for(int i = 0 ; i < num ; i++) {
		for (j = 1; j < num - i ; j++) {
			System.out.print(" ");
		}
		for(int k = j ; k <= num; k++ ) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
}