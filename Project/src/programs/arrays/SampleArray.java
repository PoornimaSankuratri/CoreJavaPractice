package programs.arrays;

import java.util.Scanner;

/**
 * Read and print the elements in an array
 * 
 * @author Poornima
 *
 */
public class SampleArray {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr1[] = new int[size];
		sampleArray(arr1);
	}

	public static void sampleArray(int arr1[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
