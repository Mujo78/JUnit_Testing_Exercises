package main;

public class Vowel {

	public static int CheckForVowel(String text) {
		if (text.length() == 0)
			throw new IllegalArgumentException("Zero length exception");

		int number = 0;
		String vowels = "AEIOUaeiou";

		for (int i = 0; i < text.length(); i++) {
			if (vowels.indexOf(text.charAt(i)) != -1) {
				number++;
			}
		}
		if (number == 0)
			throw new IllegalArgumentException("Zero result!");
		return number;
	}
}
