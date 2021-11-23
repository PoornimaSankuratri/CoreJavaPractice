package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringReverseTest {
	@Test
	public void classTest() {
		StringReverse m = new StringReverse();
		Assert.assertTrue(m instanceof StringReverse);
	}

	@Test
	public void test1() {
		StringBuilder s = StringReverse.stringReverse( new StringBuilder("hello"));
		Assert.assertEquals(s, "olleh");
	}

	@Test
	public void test2() {
		StringBuilder s = StringReverse.stringReverse(new StringBuilder("Sweety"));
		Assert.assertNotEquals(s, "yteews");
	}
}
