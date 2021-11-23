package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NumberOfVowelsTest {
	@Test
	public void classTest() {
		NumberOfVowels m = new NumberOfVowels();
		Assert.assertTrue(m instanceof NumberOfVowels);
	}

	@Test
	public void test1() {
		int i = NumberOfVowels.vowels("Poornima");
		Assert.assertEquals(i, 4);
	}

	@Test
	public void test2() {
		int i = NumberOfVowels.vowels("Sweety123");
		Assert.assertNotEquals(i, 8);
	}
}
