package es.studium.ejercicio2;

public class HiloSimple2 implements Runnable {

	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
		System.out.println("Termina thread " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
// Creamos dos objetos de la clase ThreadEjemploRunnable
		HiloSimple2 objRunnable1 = new HiloSimple2();
		Thread primero = new Thread(objRunnable1);
		primero.setName("HiloRunnable");
		primero.start();
	}
}