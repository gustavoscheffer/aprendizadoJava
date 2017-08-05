package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestaCurso {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 45));
		cursos.add(new Curso("Pearl", 30));

		// Como podemos fazer pra pegar o primeiro elemento desse Stream
		// filtrado?
		// Optional<Curso> findFirst = cursos.stream()
		// .filter(c -> c.getAlunos() > 50)
		// .findFirst();

		// Calcule a média de quantidade de alunos de todos os seus cursos
		// utilizando a API de Stream.
		// System.out.println("A media de alunos nesta escola eh => " +
		// cursos.stream()
		// .mapToDouble(Curso::getAlunos)
		// .average()
		// .getAsDouble()+"!!!");

		System.out.println("\n");
		// Como podemos transformar esse Stream<Curso> filtrado em uma
		// List<Curso>?
		List<Curso> cursos2 = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.collect(Collectors.toList());
		cursos2.forEach(System.out::println);

		// // Comparando usando Method Refence =>
		// cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		// cursos.forEach(System.out::println);
		//
		// System.out.println("\n");
		//
		// // Comparando usando Lambda =>
		// cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		// cursos.forEach(c -> System.out.println(c.getNome()));
		//
		// System.out.println("\n");
		//
		// // Usando Stream
		// cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c ->
		// System.out.println(c.getNome()));
		//
		// System.out.println("\n");
		//
		// // Usando o map
		// Stream<String> nomes = cursos.stream().map(Curso::getNome);
		// nomes.forEach(System.out::println);
		//
		// //Usando o reference -> exercicio:
		// cursos.stream()
		// .filter(c -> c.getAlunos() > 50)
		// .map(Curso::getAlunos)
		// .forEach(System.out::println);
		//
		// System.out.println("\n");
		//
		// //usandoo count
		// Stream<Integer> totalAlunos = cursos.stream().map(Curso::getAlunos);
		// totalAlunos.spliterator().forEachRemaining(System.out::println);

	}

}
