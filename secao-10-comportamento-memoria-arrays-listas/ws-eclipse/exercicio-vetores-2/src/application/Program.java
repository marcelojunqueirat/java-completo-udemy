package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}
		
		
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		System.out.printf("\nSOMA = %.2f%n", soma);
		
		double avg = soma / vetor.length;
		System.out.printf("MEDIA = %.2f%n", avg);
				
		
		sc.close();
	}

}
