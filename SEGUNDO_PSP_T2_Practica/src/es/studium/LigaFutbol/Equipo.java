package es.studium.LigaFutbol;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
	String nombre;
	int puntos;
	int partidosJugados;
	int partidosGanados;
	int partidosPerdidos;
	int partidosEmpatados;
	int golesFavor;
	int golesContra;
	int posicion;

	public Equipo(String n, int pt, int pj, int pg, int pp, int pe, int gf, int gc, int po) {
		nombre=n;
		puntos=pt;
		partidosJugados=pj;
		partidosGanados=pg;
		partidosPerdidos=pp;
		partidosEmpatados=pe;
		golesFavor=gf;
		golesContra=gc;
		posicion=po;
	}

	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}

	public int getGolesFavor() {
		return golesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}

	public int getGolesContra() {
		return golesContra;
	}

	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
static public ArrayList<Equipo>ListaEquipo() {
	int po = 0;
	ArrayList<Equipo> nombres = new ArrayList<>();
	try {
	Scanner input = new Scanner(new File("equipos.txt"));
	input.useDelimiter(",");
	nombres = new ArrayList<Equipo>();
	while (input.hasNext()) {  
		String nombrestxt = input.next();
		Equipo newEquipo = new Equipo(nombrestxt, 0, 0, 0, 0, 0, 0, 0, po);
		po++;
		//System.out.println(newEquipo.getNombre());
		nombres.add(newEquipo);
	}}catch(Exception e) {
		
	}
	return nombres;
}
	

}
