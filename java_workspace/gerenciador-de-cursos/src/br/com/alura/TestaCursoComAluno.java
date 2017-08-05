package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println("Aluno " + a1.getNome() + " esta na matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse " + turini.getNome() + " esta matriculado: ");

		System.out.println(a1.equals(turini));

		////////////////////////////////////////////////
		System.out.println("\n usando foreach");
		Set<Aluno> alunos2 = javaColecoes.getAlunos();
		for (Aluno aluno : alunos2) {
			System.out.println(aluno);
		}

		//////////////////////////////////////////////
		System.out.println("\n usando Iterator");
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext())
			System.out.println(iterador.next());

		////////////////////////////////////////////////
		System.out.println("\n usando foreach JAVA8");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

	}
}