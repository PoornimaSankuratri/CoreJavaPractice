package programs.arrays;

public class ElementsUpToSingleDigit {
	public static void main(String args[]) {
		int array[] = { 10, 11, 14, 34, 56, 78 ,177, 33};
		elementsUpToSingleDigit(array);
	}

	public static void elementsUpToSingleDigit(int array[]) {
		int n = 0, rem = 0, res = 0;
		for (int i = 0; i < array.length; i++) {
			n = makesingleDigit(array[i]);
			System.out.println(n);
			rem = 0;
		}

	}

	private static int makesingleDigit(int i) {
		int n = 0, rem = 0, res = 0;
		n = i;
		while (n > 9) {
			while (n > 0) {
				rem = n % 10;
				res = res + rem;
				n = n / 10;
			}
			n = res;
			res = 0;
		}
		return n;
	}

}
