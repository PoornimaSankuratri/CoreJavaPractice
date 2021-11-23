package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import programs.basicproblems.ArmstrogNumber;

public class SpecialStringTest {
	@Test
	public void testClass() {
		SpecialString an = new SpecialString();
		Assert.assertTrue(an instanceof SpecialString);
	}

	@Test
	public void test1() {
		boolean flag = SpecialString.specialString("Poornima");
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = SpecialString.specialString("Swety");
		Assert.assertFalse(flag);
	}
}
