package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class CountOfCharactersInString {
	public static void main(String args[]) {
		String arr[] = { "hi", "hello", "how", "hello", "hi" };
		HashMap<Character, Integer> hm = new HashMap();
		String s = highestValue(countOfCharactersInString(stringToChar(arr)));
		System.out.println("Highest repeated Character " + s);
	}

	public static ArrayList<Character> stringToChar(String arr[]) {
		ArrayList<Character> cl = new ArrayList<>();
		char st = 0;
		for (String s : arr) {
			for (int i = 0; i < s.length(); i++) {
				st = s.charAt(i);
				cl.add(st);
			}
		}
		return cl;
	}

	public static HashMap<Character, Integer> countOfCharactersInString(ArrayList<Character> cl) {
		HashMap<Character, Integer> hm = new HashMap();
		for (char c : cl) {
			if (hm.containsKey(c)) {
				int value = hm.get(c);
				hm.put(c, value + 1);
			} else {
				hm.put(c, 1);
			}
		}
		for (Entry<Character, Integer> list : hm.entrySet()) {
			System.out.println(list.getKey() + " -> " + list.getValue());
		}
		return hm;
	}

	public static String highestValue(HashMap<Character, Integer> hm) {
		int value = 0;
		char key = 0;
		for (Entry<Character, Integer> list : hm.entrySet()) {
			if (value < list.getValue()) {
				value = list.getValue();
				key = list.getKey();
			}
		}
		String s = Character.toString(key) + "-->" + Integer.toString(value);
		return s;
	}
}
