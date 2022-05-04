package util;

public class CurrencyConverter {
	public static final double IOF = 1.06;
	
	public static double calculateReaisAmount (double amountBought, double dollarPrice) {
		return amountBought * dollarPrice * IOF;
	}
}
