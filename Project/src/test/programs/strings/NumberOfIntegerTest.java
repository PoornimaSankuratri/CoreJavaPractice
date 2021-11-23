package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NumberOfIntegerTest {
	@Test
	public void classTest() {
		NumberOfIntegerValues m = new NumberOfIntegerValues();
		Assert.assertTrue(m instanceof NumberOfIntegerValues);
	}

	@Test
	public void test1() {
		int i = NumberOfIntegerValues.numberofIntegers("Poorni25");
		Assert.assertEquals(i, 2);
	}

	@Test
	public void test2() {
		int i = NumberOfIntegerValues.numberofIntegers("Sweety");
		Assert.assertNotEquals(i, 8);
	}
}
