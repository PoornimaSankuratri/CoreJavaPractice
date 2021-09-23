package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.HashMap;

public class Sample {
	public static void main(String args[]) {
		int arr[] = { 11, 22, 33, 14, 15, 16, 17 };
		HashMap<String, Integer> hm = new HashMap();
		hm.put("Number of pallindrome numbers", 0);
		int rem = 0, rev = 0;
		for(int i = 0; i < arr.length;i++) {
			int n = arr[i];
		    while (n > 0) {
		    	rem = n % 10;
		    	rev = rev  * 10 + rem;
		    	n = n / 10;		    	
			}
		    if (rev == arr[i]) {
		    	int value = hm.get("Number of pallindrome numbers");
		    	hm.put("Number of pallindrome numbers", value + 1);
		    }
		    rev = 0;
		}
		for(Entry<String , Integer> list : hm.entrySet()) {
			System.out.println(list.getKey() + " -> " + list.getValue());
		}
}
}