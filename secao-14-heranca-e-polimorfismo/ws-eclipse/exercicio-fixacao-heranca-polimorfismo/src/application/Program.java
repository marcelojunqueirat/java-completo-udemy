package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> listProduct = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, Used or Imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Custom fee: ");
				double customFee =  sc.nextDouble();
				Product p = new ImportedProduct(name, price, customFee);
				listProduct.add(p);
			} else if(ch == 'u') {
				System.out.print("Manufacture Date (DD/MM/YYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product p = new UsedProduct(name, price, manufactureDate);
				listProduct.add(p);
			} else {
				Product p = new Product(name, price);
				listProduct.add(p);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		
		for(Product p : listProduct) {
			System.out.println(p.priceTag());
		}
		
		
		sc.close();
		
	}

}
