package tests;

import org.junit.Assert;
import org.junit.Test;

import main.MultiplyTwoNumbers;

public class MultiplyTwoNumbersTest {

	public MultiplyTwoNumbersTest() {
	}

	@Test
	public void multiplyTwoPositiveNumbers() {
		Assert.assertEquals(4.0, MultiplyTwoNumbers.multiplyTwoNumbers(2.0, 2.0), 0.0);
	}

	@Test
	public void multiplyPositiveNumberWithZero() {
		Assert.assertEquals(0.0, MultiplyTwoNumbers.multiplyTwoNumbers(2.0, 0.0), 0.0);
	}

	@Test
	public void multiplyTwoNegativeNumbers() {
		Assert.assertEquals(4.0, MultiplyTwoNumbers.multiplyTwoNumbers(-2.0, -2.0), 0.0);
	}

	@Test
	public void multiplyTwoPositiveNumbersException() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
			MultiplyTwoNumbers.multiplyTwoNumbers(11.0, 10.0);
		});
	}

}
