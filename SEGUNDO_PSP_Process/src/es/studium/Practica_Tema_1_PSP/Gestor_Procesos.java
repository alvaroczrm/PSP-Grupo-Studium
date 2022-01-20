package es.studium.Practica_Tema_1_PSP;


public class Gestor_Procesos {
public static void main(String[] args) {
		VistaGestor  vistaGestor = new VistaGestor();
		ModeloGestor	modeloGestor = new ModeloGestor();
		new ControladorGestor (vistaGestor, modeloGestor);
}
}
