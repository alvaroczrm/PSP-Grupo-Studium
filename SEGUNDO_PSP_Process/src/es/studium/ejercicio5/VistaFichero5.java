package es.studium.ejercicio5;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VistaFichero5 extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton boton;
	JTextField textArea;
	JTextArea textArea2;

	public VistaFichero5() {
		textArea = new JTextField(20);
		boton = new JButton("Buscar");
		textArea2 = new JTextArea(10, 15);
		setLayout(new FlowLayout());
		add(textArea);
		add(boton);
		add(textArea2);
		setSize(250, 270);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
