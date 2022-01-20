package es.studium.ejercicio9;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class PanelBola extends JPanel implements Runnable {
	private static final long serialVersionUID = 1L;
	private int numBolas = 10;
	Thread[] hilosBola;
	Thread hiloBolin;//ej 10
	Bola[] bola;
	Bolin bolin;//ej10
	Boolean fin =false;

	public PanelBola() {
		hilosBola = new Thread[numBolas];
		hiloBolin = new Thread(this);
		bola = new Bola[numBolas];
		bolin = new Bolin(200, 530, Color.red);
		for (int i = 0; i < hilosBola.length; i++) {
			hilosBola[i] = new Thread(this);
			Random aleatorio = new Random();
			int velocidad = aleatorio.nextInt(50);
			int posX = aleatorio.nextInt(250) + 50;
			int posY = aleatorio.nextInt(300) + 50;
			Color color = new Color(aleatorio.nextInt(254), aleatorio.nextInt(254), aleatorio.nextInt(254));
			bola[i] = new Bola(posX, posY, velocidad, color);
		}
		for (int i = 0; i < hilosBola.length; ++i) {
			hilosBola[i].start();
		}
		hiloBolin.start();//ej10
		setBackground(Color.white);
	}

	public void run() {
		for (int i = 0; i < hilosBola.length; ++i) {
			while (Thread.currentThread() == hilosBola[i]&&(fin !=true)) {
				try {
					Thread.sleep(bola[i].velocidad());
					bola[i].mover();
				} catch (InterruptedException e) {
				}
				repaint();
			}
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < bola.length; ++i) {
			bola[i].pinta(g);
			gameOver();
		}
		bolin.pinta(g);//ej10
		g.drawString("salida", 225, 30);
	}

	// ej10
	public void mover(int numero) {
		bolin.mover(numero);
	}
	public void gameOver() {
		for (int i = 0; i < hilosBola.length; ++i) {
			//if ((bola[i].getX()+50 >= bolin.getX()) && (bola[i].getX() <= bolin.getX() ) || (bola[i].getX()+50 >= bolin.getX()+25) && (bola[i].getX() <= bolin.getX()+25 ) ) {
			if((bola[i].getX()+12>=bola[i].getX()-25)
					&&(bola[i].getY()+12>=bola[i].getY()-25)
					&&(bolin.getX()-12<=bolin.getX()+25)
					&&(bolin.getY()-12<=bolin.getY()+25))	{
			System.out.println("has morio");
				break;
			}
		}
	}
	
}
