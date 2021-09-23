package programs.arrays;

/**
 * Program to reverse the elements of an array
 * 
 * @author Poornima
 *
 */
public class RevElementsOfArray {
	public static void main(String args[]) {
		int array[] = { 10, 11, 14, 34, 56, 78 };
		reverseofElements(array);
	}

	public static void reverseofElements(int array[]) {
		int n;
		int temp[] = new int[array.length];
		int rev = 0, rem;
		for (int i = 0; i < array.length; i++) {
			n = array[i];
			while (n > 0) {
				rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
			}
			System.out.println(rev);
			temp[i] = rev;
			rem = 0;
			rev = 0;
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
