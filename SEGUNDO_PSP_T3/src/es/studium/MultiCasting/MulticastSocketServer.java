package es.studium.MultiCasting;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

public class MulticastSocketServer {
	MulticastSocket socket;
	InetAddress multicastIP;
	int puerto;
	boolean continueRunning = true;

	public void init(String Strip, int portValue) throws SocketException, IOException {
		socket = new MulticastSocket(portValue);
		multicastIP = InetAddress.getByName(Strip);
		puerto = portValue;
	}

	public void runserver() throws IOException {
		DatagramPacket packet;
		byte[] sendingData;
// El servidor hace env�os continuos mientras sea necesario
		while (continueRunning) {
// Obtenci�n de los datos a enviar. Supondremos la existencia de un
// m�todo espec�fico para las diferentes aplicaciones
			sendingData = getNextData();
// Creaci�n del paquete para enviar los datos obtenidos
			packet = new DatagramPacket(sendingData, sendingData.length, multicastIP, puerto);
// Env�o de los datos
			socket.send(packet);
// Miramos si es necesario terminar la transmisi�n
			continueRunning = !transmissionFinished();
		}
	}

	private boolean transmissionFinished() {
// Operaciones necesarias para devolver datos coherentes
		return false;
	}

	private byte[] getNextData() {
// Operaciones necesarias para devolver datos coherentes
		return null;
	}

	public void close() {
		if (socket != null && !socket.isClosed()) {
			socket.close();
		}
	}
}
