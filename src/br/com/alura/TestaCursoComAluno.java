package br.com.alura;

public class TestaCursoComAluno {

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

		System.out.println("Todos os alunos matriculados: ");

		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});

		System.out.println("O " + a1 + " Está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno jhonatan = new Aluno("Jhonatan Maciel", 272829);
		System.out.println("Esse Jhonatan está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(jhonatan));
		
		System.out.println("O a1 é equal ao jhonatan?");
		System.out.println(a1.equals(jhonatan));
		
	}
}
