package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções de Java", "Jhonatan Maciel");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma aula", 12));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 18));
		javaColecoes.adiciona(new Aula("Abstraindo só pra teste", 18));

		Aluno a1 = new Aluno("Jhonatan Maciel", 272829);
		Aluno a2 = new Aluno("Rodrigo Cachorro", 202122);
		Aluno a3 = new Aluno("Cabeça Grávida", 303132);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Quem é o aluno com matricula 272829?");
		Aluno aluno = javaColecoes.buscaMatriculado(272829);
		System.out.println(aluno);
	}

}
