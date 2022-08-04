package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();

		alunos.add("Jhonatan Maciel");
		alunos.add("Rodrigo Cachorro");
		alunos.add("Luiz Caxa D'água");
		alunos.add("Rodrigo Normal");
		alunos.add("Davi Tartaruga");
		System.out.println(alunos);

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

	}

}
