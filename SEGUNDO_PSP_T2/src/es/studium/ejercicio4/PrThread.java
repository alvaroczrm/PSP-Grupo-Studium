package es.studium.ejercicio4;


public class PrThread extends Thread{
	public PrThread(String str) {
		super(str);
	}

	public void run() {
		boolean sigue = true;
		for (int i = 0; i < 99 && sigue; i++) {
			System.out.println(i);
			try {
				sleep(500);
				if(i==10) {
					interrupt();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				sigue=false;
				System.out.println(getName()+ " ha sido interrumpido");
			}
		}
	}

	public static void main(String[] args) {
		PrThread t1 = new PrThread("p1");
		t1.start();

	}
	
}
