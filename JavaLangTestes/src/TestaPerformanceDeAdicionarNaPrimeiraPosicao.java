import java.util.ArrayList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();

		List<Integer> armario = new ArrayList<>();

		for (int i = 0; i <= 30000; i++) {
			armario.add(i, i);
		}
		long fim = System.currentTimeMillis();
		
		double tempo = fim - inicio;
		
		System.out.println("Tempo de registro ArrayList: " + tempo);

		long inicioLeitura = System.currentTimeMillis();

		for (Integer integer : armario) {
			armario.get(integer);
		}

		long finalLeitura = System.currentTimeMillis();

		double tempoLeitura = (finalLeitura - inicioLeitura);

		System.out.println("Tempo de leitura ArrayList: " + tempoLeitura);
	}
}
