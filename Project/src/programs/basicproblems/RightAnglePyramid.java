package programs.basicproblems;

import java.util.Scanner;

public class RightAnglePyramid {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of lines right angle pyramid you need");
		int n = sc.nextInt();
		int i,j;
		for(i = 1; i <= n; i++)
		{
			for(j = n; j >= i; j--)
			{
				System.out.print(j);
			}System.out.println();			
		}	
	}
}
