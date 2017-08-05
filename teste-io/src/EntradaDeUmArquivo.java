import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
		
		System.out.println("Digite a sua mensagem aqui:");
		while (entrada.hasNext()) {
			String linha = entrada.nextLine();
			saida.println(linha);
		}
		entrada.close();
		saida.close();
		
	}
}
