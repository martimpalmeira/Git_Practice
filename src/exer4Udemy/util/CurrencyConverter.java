package exer4Udemy.util;

public class CurrencyConverter {
	private static final double IOF_TAX = 6;
	
	private static double convertDollar(double dolarValue, double dolarPrice) {
		return dolarValue * dolarPrice * (1+(IOF_TAX*0.100));
	}
}
