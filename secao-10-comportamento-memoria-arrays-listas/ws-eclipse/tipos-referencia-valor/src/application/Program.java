package application;

public class Program {

	public static void main(String[] args) {
		/* Dados em pdf nos slides (fala sobre garbage collector nos slides tb)*/
		int p, x;
		p = 10;
		x = p;
		System.out.println(p);
		System.out.println(x);
		p = 15;
		System.out.println(p);
		System.out.println(x);
	}

}
