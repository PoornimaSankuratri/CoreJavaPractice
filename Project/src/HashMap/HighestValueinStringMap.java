package HashMap;

/**
 * Program to find highest number of times element repeated in an integer array
 * @author Poornima
 *
 */
import java.util.HashMap;
import java.util.Map.Entry;

public class HighestValueinStringMap {
	public static void main(String args[]) {
		HashMap<String, Integer> hm = new HashMap();
		StringHashMap shm = new StringHashMap();
		String arr[] = { "hi", "hello", "how", "hello", "hi", "hello" };
		HashMap<String, Integer> res = shm.stringHashMap( arr);
		highestValueinStringMap(res);
	}

	public static void highestValueinStringMap(HashMap<String, Integer> hm) {
		int n = 0;
		String key = null;
		for (Entry<String, Integer> list : hm.entrySet()) {
			if (n < list.getValue()) {
				n = list.getValue();
				key = list.getKey();
			}
		}
		System.out.println(key + " is the highest repeated key -> " + n + " times");
	}
}
