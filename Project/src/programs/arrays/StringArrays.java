package programs.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class StringArrays {
	public static void main(String args[]) {
		String arr[] = { "hel", "hai", "hel", "how", "hai", "hello" };
		System.out.println(" Repeated String in an given array -> " + repeatedStrings(arr));
		System.out.println(" Unique String values in an given array -> " + uniqueStringValues(arr));
		System.out.println(" Array values after removing duplicates -> " + withOutDuplicates(arr));
	}

	public static ArrayList<String> repeatedStrings(String array[]) {
		ArrayList<String> sl = new ArrayList();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					sl.add(array[i]);
				}
			}
		}
		return sl;
	}

	public static HashSet<String> uniqueStringValues(String array[]) {
		HashSet<String> hs = new HashSet();
		for (String s : array) {
			
			hs.add(s);
		}
		ArrayList<String> st = repeatedStrings(array);
		for(String s: st) {
			hs.remove(s);
		}
		return hs;
	}

	public static HashSet<String> withOutDuplicates(String array[]) {
		HashSet<String> hs = new HashSet();
		for (String s : array) {
			hs.add(s);
		}
		return hs;
	}
}
