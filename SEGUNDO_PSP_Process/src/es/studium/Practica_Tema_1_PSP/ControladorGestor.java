package es.studium.Practica_Tema_1_PSP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ControladorGestor implements ActionListener {
	VistaGestor vistaGestor;
	ModeloGestor modeloGestor;
	Process process;

	public ControladorGestor(VistaGestor vG, ModeloGestor mG) {
		// TODO Auto-generated constructor stub
		vistaGestor = vG;
		modeloGestor = mG;
		vistaGestor.cmd_imput_b.addActionListener(this);
		vistaGestor.notas_b.addActionListener(this);
		vistaGestor.paint_b.addActionListener(this);
		vistaGestor.jar_b.addActionListener(this);
		vistaGestor.kill_proceso_b.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource().equals(vistaGestor.cmd_imput_b)) {
			String cmd;
			cmd = vistaGestor.cmd_imput_txt.getText();
			try {
				Process process = Runtime.getRuntime().exec("cmd /c " + cmd);
				InputStream is = process.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String line;
				while ((line = br.readLine()) != null) {

					vistaGestor.cmd_output_txt.append(line + "\n");
					line = "";
				}
				is.close();
			} catch (IOException e) {
				System.err.println("Excepción de E/S!!");
				System.exit(-1);
			}
		} // fin if cmd_imput_b
		if (ae.getSource().equals(vistaGestor.notas_b)) {
			Runtime rs = Runtime.getRuntime();
			vistaGestor.eleccion.add("notepad.exe");
			vistaGestor.notas_b.setEnabled(false);
			try {
				rs.exec("notepad");
			} catch (IOException e) {
				System.err.println("excepcion de E/S");
				System.exit(-1);
			}
		} // fin if notas
		if (ae.getSource().equals(vistaGestor.paint_b)) {
			Runtime rs = Runtime.getRuntime();
			vistaGestor.eleccion.add("mspaint.exe");
			vistaGestor.paint_b.setEnabled(false);
			try {
				rs.exec("mspaint");
			} catch (IOException e) {
				System.err.println("excepcion de E/S");
				System.exit(-1);
			}
		} // fin if paint
		if (ae.getSource().equals(vistaGestor.jar_b)) {
			Runtime rs = Runtime.getRuntime();
			try {
				// C:\Users\acr71\Desktop\DAM\Entorno
				// Desarrollo\worksplace\Homeworks_P\SEGUNDO_PSP_Process\src\es\studium\Practica_Tema_1_PSP
				// Process process = Runtime.getRuntime().exec("cmd /c cd
				// \"C:\\Users\\acr71\\Desktop\\DAM\\Entorno
				// Desarrollo\\worksplace\\Homeworks_P\\SEGUNDO_PSP_Process\\src\\es\\studium\\Practica_Tema_1_PSP\"
				// && java -jar Reloj.jar");
				Process process = Runtime.getRuntime().exec("cmd /c java -jar Reloj.jar");
				// Runtime.getRuntime().exec("java -jar Reloj.jar");
				InputStream is = process.getInputStream();
				vistaGestor.eleccion.add("JAR");
				vistaGestor.jar_b.setEnabled(false);

			} catch (IOException e) {
				System.err.println("excepcion de E/S");
				System.exit(-1);
			}
		} // fin if jar
		if (ae.getSource().equals(vistaGestor.kill_proceso_b)) {
			/*
			 * String procesoElegido = vistaGestor.eleccion.getSelectedItem(); try {
			 * Runtime.getRuntime().exec("cmd /c nohup java -jar Reloj.jar"); } catch
			 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
			 * vistaGestor.eleccion.remove("jar");
			 */
			if (vistaGestor.eleccion.getSelectedItem() == "notepad.exe") {
				vistaGestor.notas_b.setEnabled(true);
				vistaGestor.eleccion.remove("notepad.exe");
				try {
					Runtime.getRuntime().exec("cmd /c taskkill /F /IM notepad.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("f");
			}
			if (vistaGestor.eleccion.getSelectedItem() == "mspaint.exe") {
				vistaGestor.paint_b.setEnabled(true);
				vistaGestor.eleccion.remove("mspaint.exe");
				try {
					Runtime.getRuntime().exec("cmd /c taskkill /F /IM mspaint.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			if (vistaGestor.eleccion.getSelectedItem() == "JAR") {
				vistaGestor.jar_b.setEnabled(true);
				vistaGestor.eleccion.remove("JAR");
				try {
					Runtime.getRuntime().exec("cmd /c taskkill /F /IM java.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}//fin kill
	}
}

