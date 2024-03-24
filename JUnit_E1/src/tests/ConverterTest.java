package tests;

import org.junit.Assert;
import org.junit.Test;

import main.Converter;

public class ConverterTest {

	public ConverterTest() {
	}

	@Test
	public void testFromInchToCmPositiveNumbers() {
		double inch = 4.0;
		Converter converter = new Converter();
		double result = converter.FromInchToCm(inch);
		Assert.assertEquals(10.16, result, 0.0);
	}

	@Test
	public void testFromInchToCmNegativeNumbers() {
		double inch = -4.0;
		Converter converter = new Converter();
		double result = converter.FromInchToCm(inch);
		Assert.assertEquals(-10.16, result, 0.0);
	}

	@Test
	public void testFromInchToCmZero() {
		double inch = 0.0;
		Converter converter = new Converter();
		double result = converter.FromInchToCm(inch);
		Assert.assertEquals(0.0, result, 0.0);
	}

	@Test
	public void testFromFeirenheitToCPositiveNumber() {
		double farenheit = 98.6;
		Converter converter = new Converter();
		double result = converter.FromFeirenheitToC(farenheit);
		Assert.assertEquals(37.0, result, 0.0);
	}

	@Test
	public void testFromFeirenheitToCNegativeNumber() {
		double farenheit = -98.6;
		Converter converter = new Converter();
		double result = converter.FromFeirenheitToC(farenheit);
		Assert.assertEquals(-72.0, result, 0.0);
	}

	@Test
	public void testFromFeirenheitToCZero() {
		double farenheit = 0.0;
		Converter converter = new Converter();
		double result = converter.FromFeirenheitToC(farenheit);
		Assert.assertEquals(-17.0, result, 0.0);
	}

}
