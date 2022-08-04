package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Lista de objetos", 15);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 20);
		Aula a4 = new Aula("Apenas teste", 25);

		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);

		System.out.println("Lista normal: " +aulas);
		
		System.out.println("-------------");
		
		Collections.sort(aulas);
		System.out.println("Lista ordenada: " + aulas);
		
		System.out.println("-------------");
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println("Ordenada pelo tempo: " + aulas);
		
		
	}

}
