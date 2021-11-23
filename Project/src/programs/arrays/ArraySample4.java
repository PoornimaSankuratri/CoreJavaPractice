package programs.arrays;

/**
 * Number of times element found in an array and print index numbers
 */
import java.util.Scanner;

public class ArraySample4 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("enter array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		arraySample4(array);

	}

	public static int arraySample4(int array[]) {
		int j = 0, res, count = 0;
		int temp[] = new int[10];
		int n = 3;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				temp[count] = i;
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(count + " indexes -> " + temp[i]);
		}
		return count;
	}
}
