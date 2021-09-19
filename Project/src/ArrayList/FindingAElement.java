package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Element found in a list
 * 
 * @author Poornima
 *
 */
public class FindingAElement {
	public static void main(String args[]) {
		int n = 3;
		ArrayList<Integer> list = new ArrayList();
		foundingAElement(list);

	}

	public static void foundingAElement(ArrayList<Integer> arraylist) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		boolean flag = true;
		for (int i = 0; i < 6; i++) {
			arraylist.add(sc.nextInt());
		}
		for (int i = 0; i < arraylist.size(); i++) {
			if (n == arraylist.get(i)) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("element found");
		} else {
			System.out.println("element not found");
		}

	}
}
