package java8;

abstract class Pessoa {

}

class Pai extends Pessoa {

	public void mostraPai() {
		System.out.println("\nEu sou Pai");
	}
}

class Filho extends Pai {

	public void mostraFilho() {
		System.out.println("\nEu sou Filho");
	}
}

public class TestChamadaHeranca {

	public static void main(String[] args) {
		Pai pai = new Pai();
		pai.mostraPai();

		Filho filho = new Filho();
		filho.mostraFilho();
		filho.mostraPai();

		// Pessoa pessoa = new Pai();

	}
}
