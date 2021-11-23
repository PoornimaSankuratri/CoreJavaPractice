package programs.basicproblems;

import java.util.Scanner;

/**
 * Sum of factorial of individual digits is equal to actual number
 * 
 * @author Poornima
 *
 */

public class StrongNumber {

	public static void main(String args[]) {
		int num;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		boolean flag = strongNumber(num);
		if (flag)
		{
			System.out.println("perfect Number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	
	}
	
	public static boolean strongNumber(int num)
	{
		int i = num, fact=1, strong=0;
		int rem=0;
		while ( i > 0)
		{
			rem = i % 10;
			fact = 1;
			for (int j=1 ; j <= rem; j++)
			{
				fact = fact * j;
			}
			System.out.println(fact);
			strong = strong + fact;
			i = i / 10;
		}
		System.out.println(strong);
		if (strong == num) {
			return true;
		} else {
			return false;
		}
	}
	
}
