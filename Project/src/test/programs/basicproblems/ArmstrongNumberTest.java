package programs.basicproblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArmstrongNumberTest {

	@Test
	public void testClass() {
		ArmstrogNumber an = new ArmstrogNumber();
		Assert.assertTrue(an instanceof ArmstrogNumber);
	}

	@Test
	public void test1() {
		boolean flag = ArmstrogNumber.armstrongNumber(153);
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = ArmstrogNumber.armstrongNumber(23);
		Assert.assertFalse(flag);
	}
}
