package tests;

import org.junit.Assert;
import org.junit.Test;

import main.Factorial;

public class FactorialTest {

	public FactorialTest() {
	}

	@Test
	public void testFactorialPositiveNumber() {
		int number = 5;
		int result = Factorial.factorial(number);
		Assert.assertEquals(120.0F, (float) result, 0.0F);
	}

	@Test
	public void testFactorialNegativeNumber() {
		int number = -5;
		Assert.assertThrows(IllegalArgumentException.class, () -> {
			Factorial.factorial(number);
		});
	}

}
