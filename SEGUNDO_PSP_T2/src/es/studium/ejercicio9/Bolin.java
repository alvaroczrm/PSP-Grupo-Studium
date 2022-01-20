package es.studium.ejercicio9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Bolin {
	private int x, y;
	private Color color;

	public Bolin(int xx, int yy, Color c) {
		this.x = xx;
		this.y = yy;
		this.color = c;
	}

	public void mover(int direccion) {
		switch (direccion) {
		case 0: // Derecha
			if (x < 450)
				x += 5;
			// comprobar si ha llegado
			if ((y <= 30) && (x > 200) && (x <= 240)) {
				System.out.println("Ganaste");
			}
			break;
		case 1: // Abajo
			if (y < 500)
				y += 5;
			break;
		case 2: // Izquierda
			if (x > 0)
				x -= 5;
			// comprobar si ha llegado
			if ((y <= 30) && (x > 200) && (x <= 240)) {
				System.out.println("Ganaste");
			}
			break;
		case 3: // Arriba
			if (y > 0)
				y -= 5;
			// comprobar si ha llegado
			if ((y <= 30) && (x > 200) && (x <= 240)) {
				System.out.println("Ganaste");
			}
			break;
		}
		//comprobar colision
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void pinta(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color);
		g2d.fillOval(x, y, 25, 25);
	}
}
