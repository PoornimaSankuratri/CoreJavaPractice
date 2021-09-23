package HashMap;
/**
 * Program to find count of individual elements in an integer array 
 */
import java.util.HashMap;
import java.util.Map.Entry;

public class IntegerHashMap {
	public static void main(String args[]) {
		IntegerHashMap ihm = new IntegerHashMap();
		HashMap<Integer, Integer> hm = new HashMap();
		int arr[] = { 1, 2, 3, 1, 2, 3, 4, 1, 2 };
		HashMap<Integer, Integer> res = ihm.integerHashMap(hm, arr);
		printHashMap(res);
	}

	public static HashMap<Integer, Integer> integerHashMap(HashMap<Integer, Integer> hm, int arr[]) {
		for (int num : arr) {
			if (hm.containsKey(num)) {
				int value = hm.get(num);
				hm.put(num, value + 1);
			} else {
				hm.put(num, 1);
			}
		}
		return hm;
	}

	public static void printHashMap(HashMap<Integer, Integer> hm) {
		for (Entry<Integer, Integer> list : hm.entrySet()) {
			System.out.println(list.getKey() + " -> " + list.getValue() + " times");
		}
	}
}
