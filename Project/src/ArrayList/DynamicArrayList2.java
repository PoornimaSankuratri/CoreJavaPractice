package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Program to print the different types of arraylists
 * 
 * @author Poornima
 *
 */

public class DynamicArrayList2 {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList();
		integerArrayList(list);
		ArrayList<Double> list1 = new ArrayList();
		doubleArrayList(list1);
		ArrayList<Character> list2 = new ArrayList();
		characterArrayList(list2);
		ArrayList<String> list3 = new ArrayList();
		stringArrayList(list3);
	}

	public static void integerArrayList(ArrayList<Integer> arraylist) {
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		System.out.println("integer array list -> " + arraylist);
	}

	public static void doubleArrayList(ArrayList<Double> arraylist) {
		arraylist.add(1.5);
		arraylist.add(2.5);
		arraylist.add(3.5);
		arraylist.add(4.5);
		System.out.println("Double array list -> " + arraylist);
	}

	public static void characterArrayList(ArrayList<Character> arraylist) {
		arraylist.add('P');
		arraylist.add('o');
		arraylist.add('o');
		arraylist.add('r');
		arraylist.add('n');
		arraylist.add('i');
		System.out.println("Character array list -> " + arraylist);
	}

	public static void stringArrayList(ArrayList<String> arraylist) {
		arraylist.add("hello");
		arraylist.add("this");
		arraylist.add("is");
		arraylist.add("poornima");
		System.out.println("String array list -> " + arraylist);
	}

}
