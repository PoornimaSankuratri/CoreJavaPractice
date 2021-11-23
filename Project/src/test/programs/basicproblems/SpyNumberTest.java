package programs.basicproblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SpyNumberTest {
	@Test
	public void classTest() {
		SpyNumber s = new SpyNumber();
		Assert.assertTrue(s instanceof SpyNumber);
	}

	@Test
	public void test1() {
		boolean flag = SpyNumber.spyNumber(123);
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = SpyNumber.spyNumber(456);
		Assert.assertFalse(flag);
	}
}
