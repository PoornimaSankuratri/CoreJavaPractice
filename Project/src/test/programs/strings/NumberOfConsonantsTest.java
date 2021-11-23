package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NumberOfConsonantsTest {
	@Test
	public void classTest() {
		NumberOfVowelsConsonants m = new NumberOfVowelsConsonants();
		Assert.assertTrue(m instanceof NumberOfVowelsConsonants);
	}

	@Test
	public void test1() {
		int i = NumberOfVowelsConsonants.vowelsConsonants("Poornima");
		Assert.assertEquals(i, 4);
	}

	@Test
	public void test2() {
		int i = NumberOfVowelsConsonants.vowelsConsonants("Sweety123");
		Assert.assertNotEquals(i, 8);
	}
}
