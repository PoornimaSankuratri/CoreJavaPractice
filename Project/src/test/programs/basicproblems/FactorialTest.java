package programs.basicproblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FactorialTest {

	@Test
	public void classTest() {
		Factorial f = new Factorial();
		Assert.assertTrue(f instanceof Factorial);
	}

	@Test
	public void test1() {
		int i = Factorial.factorialOf(2);
		Assert.assertEquals(i, 2);
	}

	@Test
	public void test2() {
		int i = Factorial.factorialOf(3);
		Assert.assertNotEquals(i, 5);
	}
}
