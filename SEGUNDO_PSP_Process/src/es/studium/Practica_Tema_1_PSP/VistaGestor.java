package es.studium.Practica_Tema_1_PSP;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VistaGestor {
	JFrame frame = new JFrame("Gestor de procesos");
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Entrada de comandos");
	JTextArea cmd_imput_txt = new JTextArea(1, 15);
	JButton cmd_imput_b = new JButton();
	JTextArea cmd_output_txt = new JTextArea(10, 25);
	JScrollPane scroll_cmd_output_txt = new JScrollPane(cmd_output_txt);
	JButton notas_b = new JButton();
	JButton paint_b = new JButton();
	JButton jar_b = new JButton();
	JLabel label2 = new JLabel("Procesos activos");
	Choice eleccion = new Choice();
	JButton kill_proceso_b = new JButton();

	VistaGestor() {
		panel.setLayout(new FlowLayout());
		cmd_imput_txt.setForeground(Color.black);
		cmd_imput_txt.setBackground(Color.LIGHT_GRAY);
		cmd_output_txt.setForeground(Color.WHITE);
		cmd_output_txt.setBackground(Color.black);
		cmd_output_txt.setText("Microsoft Windows [Versión 10.0.19042.1237]\r\n"
				+ "(c) Microsoft Corporation. Todos los derechos reservados.\r\n" + "\r\n" + "C:\\Users\\acr71>");
		//scroll_cmd_output_txt.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//scroll_cmd_output_txt.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		cmd_imput_b.setText("Ejecutar");
		notas_b.setText("NOTAS");
		paint_b.setText("PAINT");
		jar_b.setText("JAR");
		eleccion.add("         ");
		kill_proceso_b.setText("\n Matar proceso");
		panel.add(label);
		panel.add(cmd_imput_txt);
		panel.add(cmd_imput_b);
		panel.add(scroll_cmd_output_txt);
		panel.add(notas_b);
		panel.add(paint_b);
		panel.add(jar_b);
		panel.add(label2);
		panel.add(eleccion);
		panel.add(kill_proceso_b);
		frame.add(panel);
		frame.setSize(332, 340);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
