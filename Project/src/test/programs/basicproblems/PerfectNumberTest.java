package programs.basicproblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PerfectNumberTest {

	@Test
	public void classTest() {
		PerfectNumber f = new PerfectNumber();
		Assert.assertTrue(f instanceof PerfectNumber);
	}

	@Test
	public void test1() {
		boolean flag = PerfectNumber.perfectNumber(28);
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = PerfectNumber.perfectNumber(23);
		Assert.assertFalse(flag);
	}
}
