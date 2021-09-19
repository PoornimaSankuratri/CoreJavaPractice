package programs.arrays;

import java.util.Scanner;

/**
 * Program to find the last index of the given element in an array
 * 
 * @author Poornima
 *
 */
public class FindingLastIndex {
	public static void main(String args[]) {
		System.out.println("enter size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		boolean flag = false;
		findingLastIndex(array);
	}

	public static void findingLastIndex(int array[]) {
		System.out.println("Enter array values");
		Scanner sc = new Scanner(System.in);
		int key = 3, index = -1;
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				index = i;
				flag = true;
			}
		}
		if (flag) {
			System.out.println("last Element found at " + index + " index");
		} else {
			System.out.println("element not found");
		}
	}

}
