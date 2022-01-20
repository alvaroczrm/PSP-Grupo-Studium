package es.studium.ejercicios;

public class Suma4 {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.exit(-1);
		}
		else {
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	System.exit(x+y);
		}
	}
}
