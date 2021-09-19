package programs.basicproblems;

import java.util.Scanner;

/**
 * Sum of digits of square of the number is equal to actual number is called
 * Neon Number
 * 
 * @author Poornima
 *
 */

public class NeonNumber {

	public static void main(String args[]) {
		int num;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		boolean flag = neonNumber(num);
		if (flag) {
			System.out.println("perfect Number");
		} else {
			System.out.println("Not a perfect number");
		}
	}

	public static boolean neonNumber(int num) {
		int i = num * num;
		int rem = 1, neon = 0;
		while (i > 0) {
			rem = i % 10;
			neon = neon + rem;
			i = i / 10;
		}
		System.out.println(neon);
		if (neon == num) {
			return true;
		} else {
			return false;
		}
	}
}
