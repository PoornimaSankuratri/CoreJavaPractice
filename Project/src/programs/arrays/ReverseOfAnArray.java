package programs.arrays;

/**
 * reverse of an array
 * 
 * @author Poornima
 *
 */

public class ReverseOfAnArray {
	public static void main(String args[]) {
		int array[] = { 10, 11, 14, 34, 56, 78 };
		reverseOfAnArray(array);
	}

	public static void reverseOfAnArray(int array[]) {
		int temp[] = new int[array.length];
		int j = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			temp[j] = array[i];
			j = array.length - i;
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
