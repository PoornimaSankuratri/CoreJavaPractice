package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringPallindromeTest {
	@Test
	public void testClass() {
		StringPallindrome an = new StringPallindrome();
		Assert.assertTrue(an instanceof StringPallindrome);
	}

	@Test
	public void test1() {
		boolean flag = StringPallindrome.stringReverse("noon");
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = StringPallindrome.stringReverse("Poornima");
		Assert.assertFalse(flag);
	}
}
