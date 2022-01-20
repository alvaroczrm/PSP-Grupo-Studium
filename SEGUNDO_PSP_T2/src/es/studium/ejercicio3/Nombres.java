package es.studium.ejercicio3;

import java.util.Random;

public class Nombres extends Thread {
	public Nombres(String nbr) {
		super(nbr);
	}
	public static void main(String[] args) {
		String[] planets = { "Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno",
				"Pluton" };
		Random rnd = new Random();
		new Nombres(planets[rnd.nextInt(9)]).start();
		new Nombres(planets[rnd.nextInt(9)]).start();
		new Nombres(planets[rnd.nextInt(9)]).start();
	}

	public void run() {// comienza el hilo
		for (int i = 0; i < 5; ++i) {
			System.out.println("Este es el hilo: " + getName());
		}
	}
}
