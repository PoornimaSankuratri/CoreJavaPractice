package programs.basicproblems;

import java.util.Scanner;

/**
 * It will reverse the given number
 * 
 * @author Poornima
 *
 */
public class ReverseOfNumber {

	public static void main(String args[]) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		reverseOfNumber(num);

	}

	/**
	 * it will print reverse of given number
	 * @param num-it is an integer value
	 */
	public static void reverseOfNumber(int num) {
		int rev = 0, rem;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("reverse of a number" + rev);
	}

}
