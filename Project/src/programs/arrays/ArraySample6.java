package programs.arrays;

/**
 * Program to read the size & elements of any array and print how many times elements are occured in an array
 * @author Poornima
 *
 */
import java.util.Scanner;

public class ArraySample6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of any array");
		int size = sc.nextInt();
		int array[] = new int[size];
		int temp[] = new int[size];
		System.out.println("enter array values");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		pairElements(array);

	}

	public static int pairElements(int temp[]) {
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != -1) {
				count = 0;
				for (int j = i + 1; j < temp.length; j++) {
					if (temp[i] == temp[j]) {
						count++;
						temp[j] = -1;
						break;
					}
				}
				count2 = count2 + count;
			}
		}
		System.out.println(count2 + " Pairs are available");
		return count2;
	}
}
