package programs.basicproblems;

import java.util.Scanner;

/**
 * Sum of positive divisors excluding the number itself is equal to the actual number is Perfect Number
 * @author Poornima
 *
 */

public class PerfectNumber {
	
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		boolean flag = perfectNumber(num);
		if (flag)
		{
			System.out.println("perfect Number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}
	
	/**
	 * It will return whether the given number is perfect or not
	 * @param num - It is an integer value
	 * @return - boolean value which returns true or false
	 */
	
	public static boolean perfectNumber(int num)
	{
		int rem=1, perfect=0;
		for ( int i = 1; i < num; i++)
		{
			if(num % i == 0)
			{
				perfect = perfect + i;
			}
		}
		System.out.println(perfect);
		if (perfect == num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
