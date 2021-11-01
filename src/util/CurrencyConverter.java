package util;

public class CurrencyConverter {
	private static final double IOF = 0.06;
	
	public static double valueInReais(double dollarPrice, double dollarsAmount) {
		double valueInReal = convertDolarToReal(dollarPrice, dollarsAmount);
		return valueInReal + valueInReal*IOF;
	}
	
	public static double convertDolarToReal(double dollarPrice, double dollarsAmount) {
		return dollarPrice * dollarsAmount;
	}

}
