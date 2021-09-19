package programs.arrays;

/**
 * if the sum of any two elements in any array is eqaul to n then it is an super array
 */
import java.util.Scanner;

public class ArraySample3 {

	public static void main(String args[]) {
		System.out.println("enter size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		boolean flag = arraySample3(array);
		if (flag) {
			System.out.println("Array is super array");
		} else {
			System.out.println("not a super array");
		}
	}

	public static boolean arraySample3(int array[]) {
		int j = 0, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search");
		int n = sc.nextInt();
		System.out.println("enter array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				res = array[i] + array[j];
				if (res == n) {
					return true;
				} else {
					return false;
				}

			}
		}
		return false;
	}
}
