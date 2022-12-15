import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* IF / ELSE */
		/*
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom Dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();
		*/
/*--------------------------------------------------------------------------*/
		/* Sintaxe opcional - operadores de atribui��o cumulativa */
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
			
		System.out.printf("Valor da conta = R$: %.2f%n", conta);	
			
		sc.close();
		*/
/*--------------------------------------------------------------------------*/
		/* Sintaxe opcional - switch-case */
		/*
		Scanner sc = new Scanner(System.in);
		int x =  sc.nextInt();
		String dia;		
		
		switch (x) {
		case 1:
			dia = "Domingo";			
			break;
		case 2:
			dia = "Segunda";			
			break;
		case 3:
			dia = "Ter�a";			
			break;
		case 4:
			dia = "Quarta";			
			break;
		case 5:
			dia = "Quinta";			
			break;
		case 6:
			dia = "Sexta";			
			break;
		case 7:
			dia = "Sabado";			
			break;
		default:
			dia = "Valor Inv�lido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();	
		*/
/*--------------------------------------------------------------------------*/
		/* Express�o condicional tern�ria */
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
	}
}
