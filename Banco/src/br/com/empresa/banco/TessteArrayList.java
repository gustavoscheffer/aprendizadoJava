package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TessteArrayList {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= 1000; i++) {
			list.add(i);
		}
		Collections.reverse(list);
		for (Integer integer : list) {
			System.out.print(" "+ integer);
		}
		
	}
}
