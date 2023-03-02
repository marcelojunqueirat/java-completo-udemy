package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		String s3 = new String("Teste");
		String s4 = new String("Teste");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); /* Posições de memoria diferente na heap */
		System.out.println(s1 == s2); /* Tratamento especial para literais */
		System.out.println(s3 == s4);
	}

}

