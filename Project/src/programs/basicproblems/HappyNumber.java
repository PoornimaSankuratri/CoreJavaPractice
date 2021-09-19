package programs.basicproblems;

import java.util.Scanner;

/**
 * A Number which eventually reaches 1 when replaced by the sum of the square of each digit
 * @author Poornima
 *
 */

public class HappyNumber {

	public static void main (String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		happyNumber(num);
	}
	public static void happyNumber(int num)
	{
		int rem = 1, res = 0;
		while (num > 9)
		{
		while (num > 0)
		{
			rem = num % 10;
			res = res + (rem * rem);
			num = num / 10;
		}
		num = res;
		res = 0;
		}
		System.out.println(num);
		
	}
}
