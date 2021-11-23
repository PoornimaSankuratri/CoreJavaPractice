package programs.basicproblems;

import java.util.Scanner;

public class SunnyNumber {
	
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sunnyNumber(num);
	}
	public static double sunnyNumber(int num)
	{
	    num = num + 1;
		double sum = Math.sqrt(num);
		System.out.println(sum);
		return sum;
	} 
	

}
