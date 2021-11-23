package programs.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArraySample4Test {
	@Test
	public void classTest() {
		ArraySample4 a = new ArraySample4();
		Assert.assertTrue(a instanceof ArraySample4);
	}

	@Test
	public void test1() {
		int i = ArraySample4.arraySample4(new int[] { 3, 1, 3, 2 });
		Assert.assertEquals(i, 2);
	}

	@Test
	public void test2() {
		int i = ArraySample4.arraySample4(new int[] { 2, 2, 3 });
		Assert.assertNotEquals(i, 2);
	}
}
