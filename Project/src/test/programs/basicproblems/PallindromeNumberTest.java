package programs.basicproblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PallindromeNumberTest {

	@Test
	public void classTest() {
		PallindromeNumber f = new PallindromeNumber();
		Assert.assertTrue(f instanceof PallindromeNumber);
	}

	@Test
	public void test1() {
		boolean flag = PallindromeNumber.pallindrome(22);
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = PallindromeNumber.pallindrome(23);
		Assert.assertFalse(flag);
	}
}
