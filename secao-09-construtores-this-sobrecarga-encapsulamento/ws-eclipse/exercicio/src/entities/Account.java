package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int accountNumber, String accountHolder) {
		this.number = accountNumber;
		this.holder = accountHolder;
	}
	
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.number = accountNumber;
		this.holder = accountHolder;
		deposit(initialDeposit);
	}

	public int gettNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String accountHolder) {
		this.holder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
