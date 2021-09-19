package ArrayList;
/**
 * Program to find the last index of the given element in an array
 */
import java.util.Scanner;
import java.util.ArrayList;

public class FindingLastIndex {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList();
		findingLastIndex(list);
	}

	public static void findingLastIndex(ArrayList<Integer> arraylist) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int index = 0;
		boolean flag = false;
		for (int i = 0; i < 6; i++) {
			arraylist.add(sc.nextInt());
		}
		for (int i = 0; i < arraylist.size(); i++) {
			if (n == arraylist.get(i)) {
				index = i;
				flag = true;
			} 
		}
		if (flag) {
			System.out.println("Last element found at " + index);
		} else {
			System.out.println("element not found");
		}
	}

}
