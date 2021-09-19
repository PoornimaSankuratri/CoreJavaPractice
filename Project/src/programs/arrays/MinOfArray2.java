package programs.arrays;

public class MinOfArray2 {
	public static void main(String args[]) {
		int arr[] = { 10, 11, 14, 34, 56, 78, 9 };
		System.out.println("Highest number in an aray is -> " + minOfArray(arr));
	}

	public static int minOfArray(int array[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}
