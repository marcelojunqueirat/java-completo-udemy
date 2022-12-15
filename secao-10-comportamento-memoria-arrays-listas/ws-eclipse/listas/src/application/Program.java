package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		/* List � uma interface, por isso para instancia-la precisa de uma classe, no exemplo abaixo usado a classe ArrayList */
		List<String> list = new ArrayList<>();
		
		/*Adicionar Elemento*/
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		/*Adicionar Elemento na posi��o 2 da lista, depois do Alex*/
		list.add(2, "Marco");
		
		/*Tamanho da lista*/
		System.out.println(list.size());
		
		for (String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println("-------------");
		
		/*Remover elemento da lista, removendo Ana e por posi��o 1*/
		//list.remove("Anna");
		//list.remove(1);
		
		/*Remover elementos da lista por predicado,remover todos os elementos que come�am com "M" */
		list.removeIf(nome -> nome.charAt(0) == 'M');
		
		for (String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println("-------------");
		
		/* Encontrar a posi��o de um elemento */
		System.out.println("Index of Bob : " + list.indexOf("Bob"));
		
		/* Quando indexof nao encontra o elemento, retorna -1 */
		System.out.println("Index of Marcelo : " + list.indexOf("Marcelo"));
		
		
		System.out.println("-------------");
		/*Filtrar elementos da lista de apenas pessoas que come�am com "A" */
		List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String nome : result) {
			System.out.println(nome);
		}		
		
		System.out.println("-------------");
		/* Filtrar pegando primeiro elemento que come�a com a letra "A" */
		String name = list.stream().filter(nome -> nome.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}
