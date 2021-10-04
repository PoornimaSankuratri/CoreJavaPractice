package programs.arrays;

import java.util.Scanner;

public class ArrayWithOutAnArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter Size of an array");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			n = sc.nextInt();
			System.out.println(n);
		}
		
	}
}
