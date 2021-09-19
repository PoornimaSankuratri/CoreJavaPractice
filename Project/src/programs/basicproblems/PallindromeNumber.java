package programs.basicproblems;

import java.util.Scanner;

/**
 * Reverse of a number is equal to actual number
 * 
 * @author Poornima
 *
 */

public class PallindromeNumber {

	public static void main(String args[]) {
		int num;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		boolean bool = pallindrome(num);
		if (bool) {
			System.out.println("Given number is pallindrome ");
		} else {
			System.out.println("not a pallindrome number ");
		}
	}

	/**
	 * It will print whether the given number is pallindrome or not
	 * 
	 * @param num - It is an integer value
	 */

	public static boolean pallindrome(int num) {

		int rev = 0, rem = 1;
		int i = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (i == rev) {
			return true;
		} else {
			return false;
		}
	}
}
