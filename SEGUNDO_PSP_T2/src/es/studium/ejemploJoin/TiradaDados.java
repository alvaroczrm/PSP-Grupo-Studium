package es.studium.ejemploJoin;

public class TiradaDados {
	private int tiradaDados;
	public TiradaDados(int y) {
		tiradaDados = y;
	}
	public synchronized int getSumaTirada() {
		return tiradaDados;
	}
	public synchronized void setSumaTirada(int y) {
		tiradaDados +=y;
	}
}
