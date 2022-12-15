package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos n�meros voce vai digitar? ");
		int n = sc.nextInt();
		if (n > 10) {
			while(n > 10) {
				System.out.printf("Voc� deve digitar um n�mero de no m�ximo at� valor 10. Digite novamente: ");
				n = sc.nextInt();
			}
		}
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um n�mero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < vect.length; i++) {
			
			if(vect[i] < 0) {
				System.out.printf("%d\n", vect[i]);
			}
		}
		
		sc.close();
	}

}
