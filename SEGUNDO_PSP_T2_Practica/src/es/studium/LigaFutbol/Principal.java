package es.studium.LigaFutbol;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		

		ArrayList<int[][]> Temporada = new ArrayList<int[][]>();
		int[][] Jornada1 = { { 19, 0 }, { 1, 18 }, { 2, 17 }, { 3, 16 }, { 4, 15 }, { 5, 14 }, { 6, 13 }, { 7, 12 }, { 8, 11 }, { 9, 10 } };
		Temporada.add(Jornada1);
		int[][] Jornada2 = { { 19, 10 }, { 11, 9 }, { 12, 8 }, { 13, 7 }, { 14, 6 }, { 15, 5 }, { 16, 4 }, { 17, 3 }, { 18, 2 }, { 0, 1 } };
		Temporada.add(Jornada2);
		int[][] Jornada3 = { { 19, 1 }, { 2, 0 }, { 3, 18 }, { 4, 17 }, { 5, 16 }, { 6, 15 }, { 7, 14 }, { 8, 13 }, { 9, 12 }, { 10, 11 } };
		Temporada.add(Jornada3);
		int[][] Jornada4 = { { 19, 11 }, { 12, 10 }, { 13, 9 }, { 14, 8 }, { 15, 7 }, { 16, 6 }, { 17, 5 }, { 18, 4 }, { 0, 3 }, { 1, 2 } };
		Temporada.add(Jornada4);
		int[][] Jornada5 = { { 19, 2 }, { 3, 1 }, { 4, 0 }, { 5, 18 }, { 6, 17 }, { 7, 16 }, { 8, 15 }, { 9, 14 }, { 10, 13 }, { 11, 12 } };
		Temporada.add(Jornada5);
		int[][] Jornada6 = { { 19, 12 }, { 13, 11 }, { 14, 10 }, { 15, 9 }, { 16, 8 }, { 17, 7 }, { 18, 6 }, { 0, 5 }, { 1, 4 }, { 2, 3 } };
		Temporada.add(Jornada6);
		int[][] Jornada7 = { { 19, 3 }, { 4, 2 }, { 5, 1 }, { 6, 0 }, { 7, 18 }, { 8, 17 }, { 9, 16 }, { 10, 15 }, { 11, 14 }, { 12, 13 } };
		Temporada.add(Jornada7);
		int[][] Jornada8 = { { 19, 13 }, { 14, 12 }, { 15, 11 }, { 16, 10 }, { 17, 9 }, { 18, 8 }, { 0, 7 }, { 1, 6 }, { 2, 5 }, { 3, 4 } };
		Temporada.add(Jornada8);
		int[][] Jornada9 = { { 19, 4 }, { 5, 3 }, { 6, 2 }, { 7, 1 }, { 8, 0 }, { 9, 18 }, { 10, 17 }, { 11, 16 }, { 12, 15 }, { 13, 14 } };
		Temporada.add(Jornada9);
		int[][] Jornada10 = { { 19, 14 }, { 15, 13 }, { 16, 12 }, { 17, 11 }, { 18, 10 }, { 0, 9 }, { 1, 8 }, { 2, 7 }, { 3, 6 }, { 4, 5 } };
		Temporada.add(Jornada10);
		int[][] Jornada11 = { { 19, 5 }, { 6, 4 }, { 7, 3 }, { 8, 2 }, { 9, 1 }, { 10, 0 }, { 11, 18 }, { 12, 17 }, { 13, 16 }, { 14, 15 } };
		Temporada.add(Jornada11);
		int[][] Jornada12 = { { 19, 15 }, { 16, 14 }, { 17, 13 }, { 18, 12 }, { 0, 11 }, { 1, 10 }, { 2, 9 }, { 3, 8 }, { 4, 7 }, { 5, 6 } };
		Temporada.add(Jornada12);
		int[][] Jornada13 = { { 19, 6 }, { 7, 5 }, { 8, 4 }, { 9, 3 }, { 10, 2 }, { 11, 1 }, { 12, 0 }, { 13, 18 }, { 14, 17 }, { 15, 16 } };
		Temporada.add(Jornada13);
		int[][] Jornada14 = { { 19, 16 }, { 17, 15 }, { 18, 14 }, { 0, 13 }, { 1, 12 }, { 2, 11 }, { 3, 10 }, { 4, 9 }, { 5, 8 }, { 6, 7 } };
		Temporada.add(Jornada14);
		int[][] Jornada15 = { { 19, 7 }, { 8, 6 }, { 9, 5 }, { 10, 4 }, { 11, 3 }, { 12, 2 }, { 13, 1 }, { 14, 0 }, { 15, 18 }, { 16, 17 } };
		Temporada.add(Jornada15);
		int[][] Jornada16 = { { 19, 17 }, { 18, 16 }, { 0, 15 }, { 1, 14 }, { 2, 13 }, { 3, 12 }, { 4, 11 }, { 5, 10 }, { 6, 9 }, { 7, 8 } };
		Temporada.add(Jornada16);
		int[][] Jornada17 = { { 19, 8 }, { 9, 7 }, { 10, 6 }, { 11, 5 }, { 12, 4 }, { 13, 3 }, { 14, 2 }, { 15, 1 }, { 16, 0 }, { 17, 18 } };
		Temporada.add(Jornada17);
		int[][] Jornada18 = { { 19, 18 }, { 0, 17 }, { 1, 16 }, { 2, 15 }, { 3, 14 }, { 4, 13 }, { 5, 12 }, { 6, 11 }, { 7, 10 }, { 8, 9 } };
		Temporada.add(Jornada18);
		int[][] Jornada19 = { { 19, 9 }, { 10, 8 }, { 11, 7 }, { 12, 6 }, { 13, 5 }, { 14, 4 }, { 15, 3 }, { 16, 2 }, { 17, 1 }, { 18, 0 } };
		Temporada.add(Jornada19);
		Collections.shuffle(Temporada);
		/*DESCOMENTAR*/
		/*DESCOMENTAR*/
		
		System.out.println("================================================================================");
		System.out.println("==============================LOCAL=============================================");
		System.out.println("================================================================================");
		for (int i = 0; i < Temporada.size(); i++) {
			System.out.println("jornada " + (1 + i));
			System.out.println("----------------------");
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 2; k++) {
					//System.out.println(nombres.get(0).getNombre());
					//System.out.println(nombres.get(1).getNombre());
					System.out.print(Equipo.ListaEquipo().get(Jornadas.Temporada().get(i)[j][k]).getNombre()+"- ");
				}
				System.out.println("");
			}
		}
		System.out.println("================================================================================");
		System.out.println("============================VISITANTE===========================================");
		System.out.println("================================================================================");
		for (int i = 0; i < Temporada.size(); i++) {
			System.out.println("jornada " + (19 + i));
			System.out.println("----------------------");
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 2; k++) {
					//System.out.println(nombres.get(0).getNombre());
					//System.out.println(nombres.get(1).getNombre());
					System.out.print(Equipo.ListaEquipo().get(Jornadas.Temporada().get(i)[j][k]).getNombre()+"- ");
				}
				System.out.println("");
			}
		}
		/*Jornadas con goles*/
		
		System.out.println("================================================================================");
		System.out.println("================================LaLiga==========================================");
		System.out.println("================================================================================");
		
		for(int i = 0; i < 38; i++) {
			System.out.println("jornada " + (1 + i));
			System.out.println("----------------------");
			
		for(int j = 0; j < 10; j++) {
		Partidos prueba = new Partidos(i,j);
		prueba.start();
		try {
			prueba.join();
			if(j==9) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}}}

}
