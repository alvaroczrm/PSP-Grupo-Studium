package es.studium.ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorFichero5 implements ActionListener {
	VistaFichero5 vistaFicheros5;
	ModeloFichero5 modeloFichero5;
	
	public ControladorFichero5(VistaFichero5 vistaFichero5, ModeloFichero5 modeloFichero5) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource().equals(vistaFicheros5.boton)) {
			String cmd;
			cmd = vistaFicheros5.textArea.getText();
			
			
		}
		
	}

}
