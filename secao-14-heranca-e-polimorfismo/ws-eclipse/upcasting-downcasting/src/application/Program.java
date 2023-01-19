package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING Casting da subclasse para superclasse (polimorfismo)
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Marcelo", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING Casting da superclasse para subclasse (instanceof); Uso comum: métodos que recebem parâmetros genéricos (ex: Equals
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);

		//BusinessAccount acc5 = (BusinessAccount)acc3; //Irá dar erro pois acc3 é SavingsAccount e não BusinessAccount, tem que validar com instanceof
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
