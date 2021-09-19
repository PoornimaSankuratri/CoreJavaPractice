package hackerrank.java;

import java.util.Scanner;

public class javaendoffile {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String n;
		for (int i = 1; i <= 3; i++) {
			n = sc.nextLine();
			System.out.println(+i + " " + n);
		}
	}
}
