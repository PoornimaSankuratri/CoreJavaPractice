package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NumberOfCharactersTest {
	@Test
	public void classTest() {
		NumberOfCharacters m = new NumberOfCharacters();
		Assert.assertTrue(m instanceof NumberOfCharacters);
	}

	@Test
	public void test1() {
		int i = NumberOfCharacters.numberofCharacters("Poornima");
		Assert.assertEquals(i, 8);
	}

	@Test
	public void test2() {
		int i = NumberOfCharacters.numberofCharacters("Sweety");
		Assert.assertNotEquals(i, 8);
	}
}
