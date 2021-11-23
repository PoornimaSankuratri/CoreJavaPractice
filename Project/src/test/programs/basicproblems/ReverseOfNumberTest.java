package programs.basicproblems;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

public class ReverseOfNumberTest {

	@Test
	public void testClass() {
		ReverseOfNumber rev = new ReverseOfNumber();
		Assert.assertTrue(rev instanceof ReverseOfNumber);

	}

	@Test
	public void test1() {
		int rev = ReverseOfNumber.reverseOfNumber(232);
		Assert.assertEquals(232, rev);
	}

	@Test
	public void test2() {
		int rev = ReverseOfNumber.reverseOfNumber(233);
		Assert.assertNotEquals(233, rev);
	}

}
