package ArrayList;

import java.util.ArrayList;

public class MinOfArrayList1 {
	public static void main(String args[]) {
		MaxOfArrayList1 al = new MaxOfArrayList1();
		ArrayList<Integer> list = new ArrayList<>();
		al.listValues(list);
		System.out.println("Lowest number in a given array list -> " + minOfArrayList(list));

	}

	public static int minOfArrayList(ArrayList<Integer> list) {
		int min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		return min;
	}

}
