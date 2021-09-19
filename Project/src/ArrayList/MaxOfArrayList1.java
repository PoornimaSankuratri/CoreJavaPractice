package ArrayList;

import java.util.ArrayList;

public class MaxOfArrayList1 {
	public static void main(String args[]) {
		MaxOfArrayList1 al = new MaxOfArrayList1();
		ArrayList<Integer> list = new ArrayList<>();
		al.listValues(list);
		System.out.println("Highest number in a given array list -> " + maxOfArrayList(list));
	}

	public ArrayList<Integer> listValues(ArrayList<Integer> list) {
		list.add(10);
		list.add(11);
		list.add(14);
		list.add(34);
		list.add(56);
		list.add(78);
		list.add(9);
		return list;
	}

	public static int maxOfArrayList(ArrayList<Integer> list) {
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}
}