package es.studium.ejercicio6;

import java.awt.FileDialog;
import java.awt.Frame;

/*: Realizar un programa que, mediante un Explorador, le indiquemos una
carpeta y en la misma se nos generará un archivo llamado contenido.txt con un
listado de todos los ficheros y carpetas que contiene la carpeta indicada.
*/
public class Ejercicio6 {
	public Ejercicio6() {
	Frame frame = new Frame("frame");
	FileDialog fd = new FileDialog(frame, "Choose a file", FileDialog.LOAD);
	fd.setDirectory("C:\\");
	fd.setFile("*.txt");
	fd.setVisible(true);
	String filename = fd.getFile();
	if (filename == null) {
	  System.out.println("You cancelled the choice");}
	else {
	  System.out.println("You chose " + filename);}
}
	public static void main(String[] args) {
		new Ejercicio6();
	}
}
