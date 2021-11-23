package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import programs.basicproblems.Factorial;

public class FindingaLetterTest {
	@Test
	public void classTest() {
		FindingaLetter f = new FindingaLetter();
		Assert.assertTrue(f instanceof FindingaLetter);
	}

	@Test
	public void test1() {
		boolean flag = FindingaLetter.findingaLetter("Poornima", 'P');
		Assert.assertTrue(flag);
	}

	@Test
	public void test2() {
		boolean flag = FindingaLetter.findingaLetter("Poornima", 'p');
		Assert.assertFalse(flag);
	}
}
