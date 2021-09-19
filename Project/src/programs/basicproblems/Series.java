package programs.basicproblems;

import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Series {
	public static void main(String[] argh) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int k = 0; k < t; k++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			int s = 0;
			int pow = 1;
			int i, j;
			
			/*
			 * a = 1 b= 2 n = 4
			 */
			for (i = 0; i < n; i++) {
				s = s + (a + pow * b);			
				for (j = i; j <= i; j++) {
					pow = pow * 2;
				}
				System.out.print(s + " ");
				a = 0;
			}
			System.out.println();
			
		}
	}
}
