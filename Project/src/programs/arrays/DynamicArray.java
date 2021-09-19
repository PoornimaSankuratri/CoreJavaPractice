package programs.arrays;

/**
 * if entered array element equal to 22 then break the loop and print all the elements in array before that 22
 */
import java.util.Scanner;

public class DynamicArray {

	public static void main(String args[]) {
		int array[] = new int[5];
		dynamicArray(array);
	}

	public static void dynamicArray(int array[]) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] == 22) {
				n = i;
				break;
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

	}
}

/*
 * array sent -> n value
 */
