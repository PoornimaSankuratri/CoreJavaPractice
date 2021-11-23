package programs.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArraySample6Test {
	@Test
	public void classTest() {
		ArraySample6 a = new ArraySample6();
		Assert.assertTrue(a instanceof ArraySample6);
	}

	@Test
	public void test1() {
		int i = ArraySample6.pairElements(new int[] { 3, 1, 3, 2 });
		Assert.assertEquals(i, 1);
	}

	@Test
	public void test2() {
		int i = ArraySample6.pairElements(new int[] { 2, 2, 3 });
		Assert.assertNotEquals(i, 2);
	}
}
