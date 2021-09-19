package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * if the sum of any two elements in any array is equal to n then it is an super
 * array
 */

public class ArrayList3 {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList();
		superArray(list);
	}

	public static void superArray(ArrayList<Integer> arraylist) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		for (int i = 0; i < 6; i++) {
			arraylist.add(sc.nextInt());
		}
		int n = 3;
		for (int i = 0; i < arraylist.size() - 1; i++) {
			for (int j = i + 1; j < arraylist.size(); j++) {
				int res = arraylist.get(i) + arraylist.get(j);
				if (res == n) {
					flag = true;
				}
			}
		}
		if (flag) {
			System.out.println("Super ArrayList");
		} else {
			System.out.println("Not a super ArrayList");
		}
	}

}
