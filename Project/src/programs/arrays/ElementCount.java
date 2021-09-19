package programs.arrays;

import java.util.Scanner;

/**
 * Program to find the index of the given element in an array
 * 
 * @author Poornima
 *
 */
public class ElementCount {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		int size = readAnInteger("Enter size of an array");
		int array[] = new int[size];
		System.out.println("Enter integer array values");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = readAnInteger(null);
		}
		int key = readAnInteger("Enter key value");
		int count = elementCount(array, key);

		if (count > 0) {
			System.out.println("Element found " + count + " times");
		} else {
			System.out.println("Not found");
		}

	}

	public static int readAnInteger(String message) {

		if (message != null)
			System.out.println(message);

		return sc.nextInt();
	}

	public static int elementCount(int array[], int key) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				count++;
			}
		}
		return count;
	}

}
