package programs.basicproblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {
	@Test
	public void classTest() {
		HappyNumber f = new HappyNumber();
		Assert.assertTrue(f instanceof HappyNumber);
	}

	@Test
	public void test1() {
		int i = HappyNumber.happyNumber(7);
		Assert.assertEquals(i, 7);
	}

	@Test
	public void test2() {
		int i = HappyNumber.happyNumber(323);
		Assert.assertNotEquals(i, 5);
	}
}
