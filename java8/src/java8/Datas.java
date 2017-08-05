package java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		// Crie uma nova classe com um método main para escrever seus exercícios
		// com datas.
		// Nessa classe imprima a data atual utilizando a classe LocalDate.
		// Poste o resultado quando terminar.

		System.out.println(LocalDate.now());
		
		 LocalDate newDate =  LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println("\n"+ newDate);
		
		
		 
		
		Period period = Period.between(LocalDate.now(), newDate);
		System.out.println("Faltam "+ (period.toTotalMonths() * 30) +  " dias para a data de "+ newDate+"." );
		
		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Data formatada => "+ newDate.format(formate));
		
	}
}
