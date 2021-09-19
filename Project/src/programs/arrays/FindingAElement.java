package programs.arrays;

import java.util.Scanner;

/**
 * Program to find the given element is present in array or not
 * 
 * @author Poornima
 *
 */

public class FindingAElement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		int size = readAnInteger("Enter size of an array");
		int array[] = new int[size];
		int key = readAnInteger("Enter key element");
		boolean flag = true;
		System.out.println("Enter " + size + " integer array values");
		for (int i = 0; i < array.length; i++) {
			array[i] = readAnInteger(null);
		}
		findingAElement(array, key);
	}

	public static int readAnInteger(String message) {
		if(message != null) {
			System.out.println(message);
		}
		return sc.nextInt();
	}

	public static void findingAElement(int array[], int key) {
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}
	}
}
