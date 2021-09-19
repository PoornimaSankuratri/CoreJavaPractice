package programs.arrays;

/**
 * if entered element is 22 then don't read that element in to array
 */
import java.util.Scanner;

public class DynamicArraySample2 {

	public static void main(String args[]) {
		System.out.println("enter size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		dynamicArraySample2(array);
	}

	public static void dynamicArraySample2(int array[]) {
		int i = 0, n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		while (i < array.length) {
			array[i] = sc.nextInt();
			if (array[i] != 22) {
				i++;
			}
		}
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
