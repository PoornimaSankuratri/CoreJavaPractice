package ArrayList;

import java.util.ArrayList;

class MaxOfArrayList2 {
	public static void main(String args[]) {
		MaxOfArrayList1 al = new MaxOfArrayList1();
		ArrayList<Integer> list = new ArrayList<>();
		al.listValues(list);
		System.out.println("Highest number in a given array list -> " + maxOfArrayList(list));

	}

	public static int maxOfArrayList(ArrayList<Integer> list) {
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}
}
