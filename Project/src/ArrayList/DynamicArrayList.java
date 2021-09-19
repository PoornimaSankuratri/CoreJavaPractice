package ArrayList;

import java.util.ArrayList;

import java.util.Scanner;

/**
 * if entered array element equal to 22 then break the loop and print all the
 * elements in array before that 22
 * 
 * @author Poornima
 *
 */
public class DynamicArrayList {

	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		arrayList(list);
	}

	public static void arrayList(ArrayList<Integer> arraylist) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt();
			if (n == 22) {
				break;
			}
			arraylist.add(n);
		}
		System.out.println(arraylist);
	}
}
