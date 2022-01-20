package es.studium.ejercicio7;

public class UsaMult10 implements Runnable {
	int x;

	public UsaMult10(int x) {
		super();
		this.x = x;
	}

	public void run()// lo que hace el hilo
	{
		for (int i = 0; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + " " + x + " * " + i + " = " + (i * x));
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
