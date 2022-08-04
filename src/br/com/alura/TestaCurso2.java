package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções de Java", "Jhonatan Maciel");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma aula", 12));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 18));
		javaColecoes.adiciona(new Aula("Abstraindo só pra teste", 18));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
	}

}
