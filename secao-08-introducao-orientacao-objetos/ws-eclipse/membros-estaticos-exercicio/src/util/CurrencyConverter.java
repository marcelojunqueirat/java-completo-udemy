package util;

public class CurrencyConverter {
	public static final double IOF = 6;
	
	public static double amountInReais(double dollarPrice, double dollarBought) {
		double taxIof = dollarPrice * dollarBought * IOF/100;
		return dollarPrice * dollarBought + taxIof;
	}
}
