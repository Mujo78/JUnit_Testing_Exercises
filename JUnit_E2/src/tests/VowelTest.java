package tests;

import org.junit.Assert;
import org.junit.Test;

import main.Vowel;

public class VowelTest {

	public VowelTest() {
	}

	@Test
	public void checkForVowelEmptyString() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
			Vowel.CheckForVowel("");
		});
	}

	@Test
	public void checkForVowelSarajevoString() {
		Assert.assertEquals(4.0F, (float) Vowel.CheckForVowel("Sarajevo"), 0.0F);
	}

	@Test
	public void checkForVowelZeroResult() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
			Vowel.CheckForVowel("Myth");
		});
	}

	@Test
	public void checkForVowelCountryBosnia() {
		Assert.assertEquals(11L, (long) Vowel.CheckForVowel("country BOSNIA and HERZEGOVINA"));
	}
}
