package es.studium.ejercicio6;

public class OpeBasicas extends Thread {
	public OpeBasicas(String string, int i, int j) {
		super();
	}

	public void run() {

	}

	public static void main(String[] args) throws InterruptedException {
		OpeBasicas hilo1 = new OpeBasicas("Uno", 0, 8);
		OpeBasicas hilo2 = new OpeBasicas("Dos", 3, 6);
		OpeBasicas hilo3 = new OpeBasicas("Tres", 82, 17);
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo1.join();
		hilo2.join();
		hilo3.join();
		
	}

}
