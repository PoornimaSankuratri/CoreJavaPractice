package programs.arrays;

public class MaxOfArray2 {
	public static void main(String args[]) {
		int arr[] = { 10, 11, 14, 34, 56, 78 };
		System.out.println("Highest number in an aray is -> " + maxOfArray(arr));
	}

	public static int maxOfArray(int array[]) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
