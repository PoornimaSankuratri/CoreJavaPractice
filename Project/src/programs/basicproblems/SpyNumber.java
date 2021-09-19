package programs.basicproblems;

import java.util.Scanner;

/**
 * Sum of digits of given number is equal to product of digits of number
 * @author Poornima
 *
 */

public class SpyNumber {
	
	public static void main(String args[])
	{
	 int num;
	 System.out.println("enter a number");
	 Scanner sc = new Scanner(System.in);
	 num = sc.nextInt();
	 boolean flag = spyNumber(num);
		if (flag) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not a Spy number");
		}
	 
	 }
	public static boolean spyNumber(int num)
	{
		int sum=0 , product = 1, rem = 1;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum = sum + rem;
			product = product * rem;
		}
		System.out.println(sum);
		System.out.println(product);
		if(sum == product)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


}
