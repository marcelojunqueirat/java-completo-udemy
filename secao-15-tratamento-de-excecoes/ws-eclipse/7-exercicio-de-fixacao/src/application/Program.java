package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.exceptions.DomainException;
import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();

			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();

			System.out.print("Initial Balance: ");
			double initialBalance = sc.nextDouble();

			System.out.print("Withdraw Limit: ");
			double withDrawLimit = sc.nextDouble();

			Account acc = new Account(number, holder, initialBalance, withDrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			acc.withdraw(withdraw);

			System.out.printf("New balance: %.2f%n", acc.getBalance());
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Invalid data. Expected numbers.");
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		} finally {
			System.out.println("End Program");
			sc.close();
		}
	}
}
