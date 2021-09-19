package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Number of times n element found in an array and print index numbers
 * 
 * @author Poornima
 *
 */

public class ArrayList4 {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList();
		elementFound(list);
	}

	public static void elementFound(ArrayList<Integer> arraylist) {
		Scanner sc = new Scanner(System.in);
		int n = 3, count = 0;
		ArrayList<Integer> indexes = new ArrayList();
		for (int i = 0; i < 6; i++) {
			arraylist.add(sc.nextInt());
		}
		for (int j = 0; j < arraylist.size(); j++) {
			if (n == arraylist.get(j)) {
				indexes.add(j);
				count++;
			}
		}
		System.out.println(count + " times " + indexes);

	}

}
