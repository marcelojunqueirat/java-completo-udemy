package application;

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		/* Jeito primitivo*/
		for (int i=0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("----------------");
		/* SINTAXE FOREACH
		for (Tipo apelido : cole��o) {
			<comando 1>
			<comando 2>
		}
		*/
		
		for (String obj : vect) {
			System.out.println(obj);
		}
		
	}

}
