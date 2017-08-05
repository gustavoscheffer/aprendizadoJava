package java8;

import static java.util.Comparator.comparing; //static import...

import java.util.ArrayList;
import java.util.List;

public class JavaEightString {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caleum");
		palavras.add("xamarim");

		// forech com Lambda:
		palavras.forEach(str -> System.out.println("Lambda =>" + str));

		// forech com Method Reference:
		palavras.forEach(System.out::println);

		// Ordenando por tamanho com o lambda:
		palavras.sort((str1, str2) -> Integer.compare(str1.length(), str2.length()));
		System.out.println("\n Lambda   :" + palavras);

		// Ordenando Lexicograficamente usando Lambda
		palavras.sort((s1, s2) -> s1.compareTo(s2));
		System.out.println("\n Gustavo :" + palavras);

		// Ordenando Lexicograficamente usando Method Refence
		palavras.sort(comparing(String::toString)); // using static import...
		System.out.println("\n Gustavo2:" + palavras);

		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("\n Test:" + palavras);

		// Rodando uma thread usando o Lambda:
		new Thread(() -> System.out.println("\nExecutando um Runnable")).start();

	}
}
