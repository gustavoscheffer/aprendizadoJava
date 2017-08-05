package br.com.caelum.empresa;

import java.util.GregorianCalendar;
import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class TestaGasto {
	public static void main(String[] args) {
		System.out.println(new Gasto(123, "gazolina", new Funcionario("Gustavo Luis", 12, new GregorianCalendar(1987, 2, 8)), GregorianCalendar.getInstance(), true));
		System.out.println(new Gasto(543, "gazolina", new Funcionario("Gustavo Luis", 12, new GregorianCalendar(1987, 2, 8)), GregorianCalendar.getInstance(), true));
		System.out.println(new Gasto(7, "gazolina", new Funcionario("Gustavo Luis", 12, new GregorianCalendar(1987, 2, 8)), GregorianCalendar.getInstance(), true));
		System.out.println(new Gasto(11.54, "gazolina", new Funcionario("Gustavo Luis", 12, new GregorianCalendar(1987, 2, 8)), GregorianCalendar.getInstance(), true));
		System.out.println(new Gasto(1987, "gazolina", new Funcionario("Gustavo Luis", 12, new GregorianCalendar(1987, 2, 8)), GregorianCalendar.getInstance(), true));
	}
}

