import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
        
		System.out.println("Iniciando...");
        Collection<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();

        int total = 30000;
        
        long inicioFor1 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long fimFor1 = System.currentTimeMillis();
        long tempoFor1 = fimFor1 - inicioFor1 ;
        System.out.println("Tempo gasto na inserção: " + tempoFor1);
        
        long inicioFor2 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long fimFor2 = System.currentTimeMillis();
        long tempoFor2 = fimFor2 - inicioFor2;
        System.out.println("Tempo gasto na leitura: " + tempoFor2);
        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
}
