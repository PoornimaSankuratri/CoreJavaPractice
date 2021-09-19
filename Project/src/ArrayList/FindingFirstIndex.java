package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class FindingFirstIndex {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList();
		findingFirstIndex(list);
	}

	public static void findingFirstIndex(ArrayList<Integer> arraylist) {
		int n = 3, index = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			arraylist.add(sc.nextInt());
		}
		for (int i = 0; i < arraylist.size(); i++) {
			if (n == arraylist.get(i)) {
				index = i;
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("First element found at index " + index);
		} else {
			System.out.println("element not found");
		}
	}

}
