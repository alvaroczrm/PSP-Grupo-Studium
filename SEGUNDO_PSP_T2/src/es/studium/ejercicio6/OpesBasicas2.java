package es.studium.ejercicio6;

public class OpesBasicas2 extends Thread{
int x, y;
 
OpesBasicas2(String nombre, int num1, int num2){
	super(nombre);
	x= num1;
	y=num2;
}
public void run() {
	System.out.println(x + " + " + y + " = " + (x + y) + " de hilo "+ getName());
	System.out.println(x + " - " + y + " = " + (x - y) + " de hilo "+ getName());
	System.out.println(x + " * " + y + " = " + (x * y) + " de hilo "+ getName());
}
}
