package programs.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DynamicArrayTest {
	@Test
	public void classTest() {
		DynamicArray a = new DynamicArray();
		Assert.assertTrue(a instanceof DynamicArray);
	}

	@Test
	public void test1() {
		int[] array = DynamicArray.dynamicArray();
		int[] res = new int[] { 1, 2, 3 };
		Assert.assertArrayEquals(array, res);
	}

	@Test
	public void test2() {
		int[] array = DynamicArray.dynamicArray();
		int[] res = { 1, 2, 3, 22 };
		Assert.assertArrayEquals(array, res);
}
}
