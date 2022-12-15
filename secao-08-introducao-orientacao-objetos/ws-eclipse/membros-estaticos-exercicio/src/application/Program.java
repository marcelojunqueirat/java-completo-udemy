package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whats is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollar will be bought? ");
		double dollarBought = sc.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amountInReais(dollarPrice, dollarBought));
		
		sc.close();
	}

}
