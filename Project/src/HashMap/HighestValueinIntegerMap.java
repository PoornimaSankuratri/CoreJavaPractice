package HashMap;

/**
 * Program to find highest number of times element repeated in an integer array
 */
import java.util.HashMap;
import java.util.Map.Entry;

public class HighestValueinIntegerMap {
	public static void main(String args[]) {
		HashMap<Integer, Integer> hm = new HashMap();
		int arr[] = { 1, 2, 3, 1, 2, 3, 4, 1, 2, 1 };
		IntegerHashMap ihm = new IntegerHashMap();
		HashMap<Integer, Integer> res = ihm.integerHashMap(hm, arr);
		highestValueinIntegerMap(res);
	}

	public static void highestValueinIntegerMap(HashMap<Integer, Integer> res) {
		int n = 0;
		int key = 0;
		for (Entry<Integer, Integer> list : res.entrySet()) {
			if (n < list.getValue()) {
				n = list.getValue();
				key = list.getKey();
			}
		}
		System.out.println(key + " is the highest repeated key -> " + n + " times");
	}

}
