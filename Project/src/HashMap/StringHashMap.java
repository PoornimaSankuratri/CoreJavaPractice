package HashMap;
/**
 * Program to find count of individual elements in an String array
 */
import java.util.HashMap;
import java.util.Map.Entry;

public class StringHashMap {
	public static void main(String args[]) {
		String arr[] = { "hi", "hello", "how", "hello", "hi" };
		StringHashMap shm = new StringHashMap();
		
		HashMap<String, Integer> res = shm.stringHashMap(arr);
		printHashMap(res);
	}

	public HashMap<String, Integer> stringHashMap(String arr[]) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		for (String s : arr) {
			if (hm.containsKey(s)) {
				int value = hm.get(s);
				hm.put(s, value + 1);
			} else {
				hm.put(s, 1);
			}
		}
		return hm;
	}

	public static void printHashMap(HashMap<String, Integer> hm) {
		for (Entry<String, Integer> list : hm.entrySet()) {
			System.out.println(list.getKey() + " -> " + list.getValue() + " times");
		}
	}
}
