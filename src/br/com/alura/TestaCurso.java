package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções de Java", "Jhonatan Maciel");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma aula", 12));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 18));

		System.out.println(javaColecoes.getAulas());

	}

}
