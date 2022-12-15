package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		System.out.println(obj);

		int y = (int) obj;
		System.out.println(y);
		
		/*Wrapper class
		 * Exemplo:
		    public String name;
		    public Double price;
		    public Integer quantity; 
		*/
		Integer objInteger = x *2;
		int z = objInteger;
		System.out.println(z);
	}

}
