package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ReverseFirstHalfOfStringTest {
	@Test
	public void classTest() {
		ReverseFirstHalfString m = new ReverseFirstHalfString();
		Assert.assertTrue(m instanceof ReverseFirstHalfString);
	}

	@Test
	public void test1() {
		String i = ReverseFirstHalfString.reverseFirstHalfString("poornima");
		Assert.assertEquals(i, "roopnima");
	}

	@Test
	public void test2() {
		String i = ReverseFirstHalfString.reverseFirstHalfString("Sweety");
		Assert.assertNotEquals(i, "yteews");
	}
}
