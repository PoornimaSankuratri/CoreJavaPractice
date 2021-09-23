package programs.arrays;

/**
 * Program to read the size & elements of any array and print how many times elements are occured in an array
 * @author Poornima
 *
 */
import java.util.Scanner;

public class ArraySample5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter size of any array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("enter array values");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		countOfElements(array);
	}

	public static void countOfElements(int temp[]) {
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != -1) {
				count = 1;
				for (int j = i + 1; j < temp.length; j++) {
					if (temp[i] == temp[j]) {
						count++;
						temp[j] = -1;
					}
				}
				System.out.println(temp[i] + " occurs " + count + " times");
			}
		}
	}
}
