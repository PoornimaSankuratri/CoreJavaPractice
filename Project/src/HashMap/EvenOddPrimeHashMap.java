package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class EvenOddPrimeHashMap {
	static HashMap<String, Integer> hm = new HashMap();
	static {
		hm.put("number of even numbers", 0);
		hm.put("number of odd numbers", 0);
		hm.put("number of prime numbers", 0);
		hm.put("Number of pallindrome numbers", 0);

	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 110, 226, 313 };
		// HashMap<String, Integer> hm = new HashMap();
		EvenOddNumber(arr);
		primeNumber(arr);
		pallindromeNumber(arr);
		for (Entry<String, Integer> list : hm.entrySet()) {
			System.out.println(list.getKey() + " -> " + list.getValue());
		}
	}

	public static HashMap<String, Integer> EvenOddNumber(int arr[]) {
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				value = hm.get("number of even numbers");
				hm.put("number of even numbers", value + 1);

			} else {
				value = hm.get("number of odd numbers");
				hm.put("number of odd numbers", value + 1);

			}
		}
		return hm;

	}

	public static HashMap<String, Integer> primeNumber(int arr[]) {
		int value = 0;
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1 || arr[i] == 2) {
				value = hm.get("number of prime numbers");
				hm.put("number of prime numbers", value + 1);
			}
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					flag = false;
					break;
				} else {
					value = hm.get("number of prime numbers");
					hm.put("number of prime numbers", value + 1);
					break;
				}
			}
		}
		return hm;
	}

	public static void pallindromeNumber(int arr[]) {
		int rem = 0, rev = 0;
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			while (n > 0) {
				rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
			}
			if (rev == arr[i]) {
				int value = hm.get("Number of pallindrome numbers");
				hm.put("Number of pallindrome numbers", value + 1);
				System.out.print(arr[i]);
				System.out.print(rev);
			}
			rev = 0;
		}
	}
}
