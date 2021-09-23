package programs.arrays;

/**
 * Program to print prime elements and non prime elements in an array and count
 * of prime elements
 * 
 * @author Poornima
 *
 */
public class PrimeElementOfAnArray {
	public static void main(String args[]) {
		int array[] = { 1, 6, 2, 3, 7, 8 };
		primeNumbersAnArray(array);
	}

	public static void primeNumbersAnArray(int array[]) {
		int n = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			n = array[i];
			if (n == 1 || n == 2) {
				System.out.println(n + " is a prime number");
				count++;
			}
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					System.out.println(n + " is not a prime number");
					break;
				} else {
					System.out.println(n + " is a prime number");
					count++;
					break;
				}
			}

		}
		System.out.println("Total number of Prime elements in an array -> " + count);
	}
}
