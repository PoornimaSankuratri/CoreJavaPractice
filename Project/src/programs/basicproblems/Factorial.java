package programs.basicproblems;

import java.util.Scanner;

/**
 * Product of all positive integers from 1 to given number
 * @author Poornima
 *
 */

public class Factorial {

	public static void main(String args[])

	{
		int num;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		factorialOf(num);

	}

/**
 * it will print the factorial of given number	
 * @param num - it is an integer value
 */
	
	public static int factorialOf(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		return fact;
	}
}
