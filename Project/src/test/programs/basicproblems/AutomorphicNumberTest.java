package programs.basicproblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AutomorphicNumberTest {

	@Test
	public void classTest() {
		AutomorphicNumber a = new AutomorphicNumber();
		Assert.assertTrue(a instanceof AutomorphicNumber);
	}

	@Test
	public void test1() {
		boolean flag = AutomorphicNumber.automorphicNumber(5);
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = AutomorphicNumber.automorphicNumber(15);
		Assert.assertFalse(flag);
	}

}
