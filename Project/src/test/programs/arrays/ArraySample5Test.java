package programs.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArraySample5Test {
	@Test
	public void classTest() {
		ArraySample5 a = new ArraySample5();
		Assert.assertTrue(a instanceof ArraySample5);
	}

	@Test
	public void test1() {
		boolean flag = ArraySample3.arraySample3(new int[] { 1, 2, 2 });
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = ArraySample3.arraySample3(new int[] { 2, 2, 3 });
		Assert.assertFalse(flag);
	}
}
