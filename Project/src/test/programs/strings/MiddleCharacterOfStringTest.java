package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MiddleCharacterOfStringTest {
	@Test
	public void classTest() {
		MiddleCharacterOfString m = new MiddleCharacterOfString();
		Assert.assertTrue(m instanceof MiddleCharacterOfString);
	}

	@Test
	public void test1() {
		char c = MiddleCharacterOfString.middleCharacterOfString("Poornima");
		Assert.assertEquals(c, 'n');
	}

	@Test
	public void test2() {
		char c = MiddleCharacterOfString.middleCharacterOfString("Sweety");
		Assert.assertNotEquals(c, 'y');
	}
}
