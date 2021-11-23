package programs.basicproblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SunnyNumberTest {

	@Test
	public void classTest() {
		SunnyNumber s = new SunnyNumber();
		Assert.assertTrue(s instanceof SunnyNumber);
	}

	@Test
	public void test1() {
		double i = SunnyNumber.sunnyNumber(80);
		Assert.assertEquals(i,  9.0, 0.01);
	}

	@Test
	public void test2() {
		double i = SunnyNumber.sunnyNumber(3);
		Assert.assertNotEquals(i, 5);
	}
}
