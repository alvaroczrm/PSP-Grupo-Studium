package es.studium.LigaFutbol;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Partidos extends Thread {
	static int GolesFavor;
	static int GolesContra;
	int nJornada;
	int nPartido;
	ArrayList<Equipo> Elista = new ArrayList<Equipo>();
	 Equipo equipoL;
	 Equipo equipoV;

	public Partidos(Equipo eLocal, Equipo eVisitante) {
		
		GolesFavor = 0;
		GolesContra = 0;
		this.equipoL = eLocal;
		this.equipoV = eVisitante;

	}
	public Partidos(int jornada, int partido) {
		super();
		nJornada = jornada;
		nPartido = partido;
	}

	@Override
	public void run() {
		ArrayList<Equipo> Elista = Equipo.ListaEquipo();
		ArrayList<Partidos> Plista = Jornadas.ListaDePartidos(nJornada);
	
		GolesFavor = golesFavorRandom(Plista.get(nPartido).getEquipoL().getPosicion());
		GolesContra = golesContraRandom(Plista.get(nPartido).getEquipoV().getPosicion());
		
		Plista.get(nPartido).getEquipoL().setGolesFavor(GolesFavor+Plista.get(nPartido).getEquipoL().getGolesFavor());
		Plista.get(nPartido).getEquipoL().setGolesContra(GolesContra+Plista.get(nPartido).getEquipoL().getGolesContra());
		Plista.get(nPartido).getEquipoV().setGolesFavor(GolesFavor+Plista.get(nPartido).getEquipoV().getGolesFavor());
		Plista.get(nPartido).getEquipoV().setGolesContra(GolesContra+Plista.get(nPartido).getEquipoV().getGolesContra());
	
		
		if (GolesFavor == GolesContra) {
			Plista.get(nPartido).getEquipoL().setPuntos(Plista.get(nPartido).getEquipoL().getPuntos()+ 1);
			Plista.get(nPartido).getEquipoV().setPuntos(Plista.get(nPartido).getEquipoV().getPuntos()+ 1);
			Plista.get(nPartido).getEquipoL().setPartidosEmpatados(Plista.get(nPartido).getEquipoL().getPartidosEmpatados() + 1);
			Plista.get(nPartido).getEquipoV().setPartidosEmpatados(Plista.get(nPartido).getEquipoV().getPartidosEmpatados() + 1);
		} else if (GolesFavor > GolesContra) {
			Plista.get(nPartido).getEquipoL().setPuntos(Plista.get(nPartido).getEquipoL().getPuntos() + 3);
			Plista.get(nPartido).getEquipoL().setPartidosGanados(Plista.get(nPartido).getEquipoL().getPartidosGanados() + 1);
			Plista.get(nPartido).getEquipoV().setPartidosPerdidos(Plista.get(nPartido).getEquipoV().getPartidosPerdidos() + 1);
		} else if (GolesContra > GolesFavor) {
			Plista.get(nPartido).getEquipoV().setPuntos(Plista.get(nPartido).getEquipoV().getPuntos() + 3);
			Plista.get(nPartido).getEquipoL().setPartidosPerdidos(Plista.get(nPartido).getEquipoL().getPartidosPerdidos() + 1);
			Plista.get(nPartido).getEquipoV().setPartidosGanados(Plista.get(nPartido).getEquipoV().getPartidosGanados() + 1);
		}
		
		//equipoL.setPartidosJugados(+1);
		//equipoV.setPartidosJugados(+1);
		System.out.println(Plista.get(nPartido).getEquipoL().getNombre() + "- " + GolesFavor + " VS " + Plista.get(nPartido).getEquipoV().getNombre() + "- " + GolesContra);
		if(nPartido==9) {
			Elista.clear();
			for(int i = 0; i < 10; i++) {
				Elista.add(Plista.get(i).getEquipoL());
				Elista.add(Plista.get(i).getEquipoV());
			}
			Elista.sort(Comparator.comparing(Equipo::getPuntos).reversed());
			System.out.println("EQUIPO\t\t\t\tpuntos\tGoles a favor\tGoles en contra\tPartidos jugados\tPartidos ganados\tPartidos perdidos");
			for(int i = 0; i < 20; i++) {
				System.out.println(Elista.get(i).getNombre()+"\t\t\t\t"+Elista.get(i).getPuntos()+"\t\t\t"+Elista.get(i).getGolesFavor()+"\t\t\t"+Elista.get(i).getGolesContra()+"\t\t\t"+Elista.get(i).getPartidosJugados()+"\t\t\t"+Elista.get(i).getPartidosGanados()+"\t\t\t"+Elista.get(i).getPartidosPerdidos());
				Elista.get(i).setPosicion(i);
			}
		}
		if(nJornada==38) {
			try {
				guardarTxt();
				System.out.println("================================================");
				System.out.println("=================TERMINADO======================");
				System.out.println("Archivo guardado");
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}

	public int getGolesFavor() {
		return GolesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		GolesFavor = golesFavor;
	}

	public int getGolesContra() {
		return GolesContra;
	}

	public void setGolesContra(int golesContra) {
		GolesContra = golesContra;
	}

	
	
	public Equipo getEquipoL() {
		return equipoL;
	}
	public void setEquipoL(Equipo equipoL) {
		this.equipoL = equipoL;
	}
	public Equipo getEquipoV() {
		return equipoV;
	}
	public void setEquipoV(Equipo equipoV) {
		this.equipoV = equipoV;
	}
	public static int golesFavorRandom(int posicion) {
		Random rand = new Random();

		// nextInt as provided by Random is exclusive of the top value so you need to
		// add 1

		int randomNum = rand.nextInt(5);
		GolesFavor = randomNum + (10 / (posicion + 1));
		return GolesFavor;

	}

	public static int golesContraRandom(int posicion) {
		Random rand2 = new Random();
		// nextInt as provided by Random is exclusive of the top value so you need to
		// add 1

		int randomNum2 = rand2.nextInt(2);
		GolesContra = randomNum2 + (10 / (posicion + 1));
		return GolesContra;

	}
	public void guardarTxt() throws FileNotFoundException, IOException, ClassNotFoundException{
		String DELIMITADOR=",";
		FileWriter output = new FileWriter("equipos.txt");
		PrintWriter pw = new PrintWriter(output);
		for(int i=0;i<Elista.size();i++) {
			if(i==Elista.size()-1) {
				pw.print(String.valueOf(Elista.get(i).getNombre()));
				output.close();
			}else {
				pw.print(String.valueOf(Elista.get(i).getNombre()+DELIMITADOR));
				output.close();
			}
		}
		
	}

}
