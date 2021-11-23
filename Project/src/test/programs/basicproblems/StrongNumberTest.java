package programs.basicproblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StrongNumberTest {
	@Test
	public void classTest() {
		StrongNumber s = new StrongNumber();
		Assert.assertTrue(s instanceof StrongNumber);
	}

	@Test
	public void test1() {
		boolean flag = StrongNumber.strongNumber(145);
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = StrongNumber.strongNumber(456);
		Assert.assertFalse(flag);
	}
}
