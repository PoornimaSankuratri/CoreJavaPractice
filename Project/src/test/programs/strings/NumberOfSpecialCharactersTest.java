package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NumberOfSpecialCharactersTest {
	@Test
	public void classTest() {
		NumberOfSpecialCharacters m = new NumberOfSpecialCharacters();
		Assert.assertTrue(m instanceof NumberOfSpecialCharacters);
	}

	@Test
	public void test1() {
		int i = NumberOfSpecialCharacters.numberofSpecialCharacters("Poorni@25");
		Assert.assertEquals(i, 1);
	}

	@Test
	public void test2() {
		int i = NumberOfSpecialCharacters.numberofSpecialCharacters("Sweety123");
		Assert.assertNotEquals(i, 8);
	}
}
