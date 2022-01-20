package es.studium.RunProcess;

import java.io.IOException;
import java.util.Arrays;

public class RunProcess {
	public static void main(String[] args) throws IOException {
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		try {
			for (String pro : args) {
				System.out.println("Ejecutando " + Arrays.toString(args));
				ProcessBuilder pb = new ProcessBuilder(pro);
				Process process = pb.start();

// Esperamos que termine el proceso (comenta lineas 19-20 25-28 para ejecutar simultaneamente)
				int retorno = process.waitFor();
				System.out.println("La ejecución de " + Arrays.toString(args) + " devuelve " + retorno);
			}
		} catch (IOException ex) {
			System.err.println("Excepción de E/S!!");
			System.exit(-1);
		} catch (InterruptedException ex) {
			System.err.println("El proceso hijo finalizó de forma errónea");
			System.exit(-1);
		}
	}
}