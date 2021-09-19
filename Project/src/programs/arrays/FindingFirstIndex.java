package programs.arrays;

import java.util.Scanner;

/**
 * Program to find the index of the given element in an array
 * 
 * @author Poornima
 *
 */
public class FindingFirstIndex {
	public static void main(String args[]) {
		System.out.println("enter size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		findingFirstIndex(array);
	}

	public static void findingFirstIndex(int array[]) {
		int key = 3, index = -1;
		boolean flag = true;
		System.out.println("Enter integer array values");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				index = i;
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("First Element found at " + index + " index");
		} else {
			System.out.println("element not found");
		}
	}

}
