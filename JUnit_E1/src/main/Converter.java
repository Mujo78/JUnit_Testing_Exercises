package main;

public class Converter {
	public double FromInchToCm(double i) {
		return i * 2.54;
	}

	public double FromFeirenheitToC(double f) {
		return Math.ceil((f - 32) / 1.8);
	}
}
