package br.com.empresa.banco;

import java.util.TreeSet;

public class TestaTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> conjunto = new TreeSet<>();
		for (int i = 1; i <= 1000; i++) {
			conjunto.add(i);
		}

		for (Integer i : conjunto.descendingSet()) {
			System.out.print(i + " ");
		}
	}
}
