package es.studium.LigaFutbol;

public class CalendarioEjemplo {
	public static void main(String[] args) {
	    int numeroEquipos = 20; 
	    int[] listaEquiposIndice = new int[numeroEquipos];
	    String[][] matriz1,matriz2,jornadas;

	        for (int i=0;i<numeroEquipos;i++){
	            listaEquiposIndice[i] = i+1;
	        }

	        matriz1 = new String[numeroEquipos-1][numeroEquipos/2];
	        matriz2 = new String[numeroEquipos-1][numeroEquipos/2];
	        jornadas = new String[numeroEquipos-1][numeroEquipos/2];
	        int cont = 0;
	        int cont2 = numeroEquipos-2;

	        for(int i=0;i<numeroEquipos-1;i++){
	            for(int j=0;j<numeroEquipos/2;j++){

	                // BOMBO A
	                matriz1[i][j] = String.valueOf(listaEquiposIndice[cont]-1) ;
	                cont++;
	                if(cont==(numeroEquipos-1)) {
	                    cont=0;
	                }

	                //BOMBO B
	                if(j==0) {
	                    matriz2[i][j] = String.valueOf(numeroEquipos);
	                    }
	                else {
	                    matriz2[i][j] = String.valueOf(listaEquiposIndice[cont2]-1);
	                    cont2--;
	                    if(cont2==-1) {
	                        cont2 = numeroEquipos-2;
	                    }
	                }

	                // PRIMERA VUELTA
	                if(j==0){
	                        jornadas[i][j] = "{"+matriz2[i][j] + "," + matriz1[i][j]+"},";
	                    }
	                    else {
	                        jornadas[i][j] = "{"+matriz1[i][j] + "," + matriz2[i][j]+"},";
	                    }
	            }
	        }

	        //Solo para mostrarlo por consola

	        for(int i=0;i<numeroEquipos-1;i++){
	            System.out.println("Jornada " + (i+1));
	            for(int j=0;j<numeroEquipos/2;j++)
	            {
	                String partido = jornadas[i][j];
	                System.out.print(partido + " "); 
	            }
	            System.out.println();
	        }

	}
}
