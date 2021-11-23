package programs.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SwapFirstandLastletterstest {
	@Test
	public void classTest() {
		SwapFirstAndLastLetters m = new SwapFirstAndLastLetters();
		Assert.assertTrue(m instanceof SwapFirstAndLastLetters);
	}

	@Test
	public void test1() {
		String s = SwapFirstAndLastLetters.swapFirstAndLastLetters("poornima");
		Assert.assertEquals(s, "aoornimp");
	}

	@Test
	public void test2() {
		String s = SwapFirstAndLastLetters.swapFirstAndLastLetters("Sweety");
		Assert.assertNotEquals(s, "yteews");
	}
}
