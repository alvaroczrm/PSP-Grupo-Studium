package es.studium.ejercicio9;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrincipalBola extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1L;
	static PanelBola panel = new PanelBola(); // Ejercicio 10

	public PrincipalBola() {
		super();
	}

	public static void main(String args[]) {
		PrincipalBola f = new PrincipalBola();
		f.addKeyListener(f); // Ejercicio 10
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Bolas");
		f.setContentPane(panel); // Ejercicio 10
		f.setSize(500, 600);
		f.setVisible(true);
	}

	// Ejercicio 10
	public void keyPressed(KeyEvent evento) {
		switch (evento.getKeyCode()) {
		case 37: // Izquierda
			panel.mover(2);
			break;
		case 38: // Arriba
			panel.mover(3);
			break;
		case 39: // Derecha
			panel.mover(0);
			break;
		case 40: // Abajo
			panel.mover(1);
			break;
		}
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}
}
