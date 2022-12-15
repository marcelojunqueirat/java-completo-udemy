package entities;

public class Product {
	/*
	 * https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
	 * private: o membro s� pode ser acessado na pr�pria classe
 	 * (nada): o membro s� pode ser acessado nas classes do mesmo pacote
 	 * protected: o membro s� pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
	 * public: o membro � acessado por todas classes (ao menos que ele resida em um m�dulo diferente que n�o exporte o pacote onde ele est�)
	 * 
	*/
	
	String name;
	private double price;
	private int quantity;
	
	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}	

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
