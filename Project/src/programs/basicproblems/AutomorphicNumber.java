package programs.basicproblems;

import java.util.Scanner;

/**
 * An automorphic is an integer whose Square end with the given number
 * @param args
 */

public class AutomorphicNumber {
	
	public static void main (String args[])
	{
		int num;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		boolean flag = automorphicNumber(num);
		if (flag) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("Not a Automorphic number");
		}
	}
	public static boolean automorphicNumber(int num)
	{
		int i = num * num , k, temp = num;
		int count1 = 0 , rem =1, rev = 0, rem1 = 1, rev1 = 0;
		while (temp > 0)
		{
			temp = temp / 10;
			count1++;
		}
		System.out.println(i);
		System.out.println(count1);
		for (int j =1; j <= count1 ; j++)
		{
			rem = i % 10;
			rev = rev * 10 + rem;
			i = i / 10;
		}
		k = rev;
		System.out.println(+ k);
		while ( k > 0)
			
		{
			rem1 = k % 10;
			rev1 = rev1 * 10 + rem1;
			k = k / 10;
		}
		System.out.println(rev1);
		if (rev1 == num) {
			return true;
		} else {
			return false;
		}
	}

}
