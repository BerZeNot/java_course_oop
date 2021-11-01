package exercices_section_8_and_9;

import java.util.Scanner;

import util.CurrencyConverter;

import java.util.Locale;

public class Program_buy_dollars {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarsAmount = sc.nextDouble();
		
		double amountToBePaidInReais = CurrencyConverter.valueInReais(dollarPrice, dollarsAmount);
		System.out.printf("Amount to be paid in reais = %.2f",amountToBePaidInReais);
		sc.close();
	}

}
