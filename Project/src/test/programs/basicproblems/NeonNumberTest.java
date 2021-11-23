package programs.basicproblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NeonNumberTest {
	@Test
	public void NeonNumber() {
		NeonNumber n = new NeonNumber();
		Assert.assertTrue(n instanceof NeonNumber);
	}

	@Test
	public void test1() {
		boolean flag = NeonNumber.neonNumber(9);
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = NeonNumber.neonNumber(3);
		Assert.assertFalse(flag);
	}
}
