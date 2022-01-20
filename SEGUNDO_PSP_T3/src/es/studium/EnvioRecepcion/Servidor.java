package es.studium.EnvioRecepcion;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Servidor {
	public static void main(String[] args) {
		// Simular un entorno Cliente-Servidor
		while (true) {
			try {
				// Puerto de escucha para el servicio que estamos implementando
				int puertoEscucha = 5555;
				// Vector de bytes en el que recibi� el mensaje con una capacidad de 256bytes
				byte[] mensaje = new byte[256];
				// Creaci�n del paquete en el que recibir los datos de 256 bytes como m�ximo
				DatagramPacket packet = new DatagramPacket(mensaje, mensaje.length);
				// Creaci�n de un z�calo que escuche el puerto pasado por par�metro
				DatagramSocket socket = new DatagramSocket(puertoEscucha);
				// Recepci�n de un paquete
				socket.receive(packet);
				String cadena = new String(mensaje);
				System.out.println(cadena);
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
