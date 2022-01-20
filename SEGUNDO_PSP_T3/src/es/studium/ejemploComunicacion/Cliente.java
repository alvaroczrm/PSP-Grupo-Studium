package es.studium.ejemploComunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Cliente {
	static final String HOST = "192.168.0.";
	static final int PUERTO = 6000;

	public static void main(String[] arg) throws IOException {
		Socket cliente = null;
		
			System.out.println("Iniciando programa cliente..");
			for (int i = 12; i<256; i++) {
				try {
				System.out.println("probando "+HOST+i);
				cliente = new Socket(HOST+i, PUERTO);
				if (cliente.isConnected()) {
					break;
				}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
// Creo el flujo de salida al servidor
			DataOutputStream flujoSalida = new DataOutputStream(cliente.getOutputStream());
// Envío un saludo al servidor
			flujoSalida.writeUTF("hola");
// Creo el flujo de entrada desde servidor
			InputStream entrada = cliente.getInputStream();
			DataInputStream flujoEntrada = new DataInputStream(entrada);
// El servidor me envia un mensaje
			System.out.println("Recibiendo del SERVIDOR... \n\t" + flujoEntrada.readUTF());
// Cerramos streams y sockets
			flujoSalida.close();
			entrada.close();
			flujoEntrada.close();
			cliente.close();
		
	}
}

