package programs.basicproblems;

import java.util.Scanner;

/**
 * Sum of cubes of its digits is equal to actual number is called Armstrong Number
 * @author Poornima
 *
 */

public class ArmstrogNumber {

	public static void main(String args[]) {
		int num;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		boolean flag = armstrongNumber(num);
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
	 * It will return the given number is Armstrong or not
	 * @param num - Integer value
	 * @return - Boolean value It will returns true or false
	 */

	public static boolean armstrongNumber(int num) {
		int i = num;
		int rem = 0, cube = 0, armstrong = 0;
		while (i > 0) {
			rem = i % 10;
			cube = rem * rem * rem;
			i = i / 10;
			armstrong=armstrong + cube;
		}
		System.out.println(armstrong);
		if (armstrong == num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
