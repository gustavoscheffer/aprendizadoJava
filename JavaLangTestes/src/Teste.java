
public class Teste {

	public static void main(String[] args) {
		
		Programa p1 = new Programa();
		p1.setId(1);
		
		Thread thread1 = new Thread(p1);
		thread1.start();
		
		Programa p2 = new Programa();
		p2.setId(2);
		
		Thread thread2 = new Thread(p2);
		thread2.start();

	}

}
