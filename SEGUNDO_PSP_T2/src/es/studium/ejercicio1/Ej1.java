package es.studium.ejercicio1;


public class Ej1 extends Thread {
	public Ej1(String str) {
		super(str);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
		}
		System.out.println("Termina thread " + getName());
	}

	public static void main(String[] args) {
		Ej1 t1 = new Ej1("Prueba");
		t1.start();

	}
}
