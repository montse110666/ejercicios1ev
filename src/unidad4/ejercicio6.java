package unidad4;

import java.util.Random;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	    //declarar clase Random
		Random aleatorio=new Random();
		int posiciones=0;
	    int j=0;
	    int i=0;
	    // Le damos a la variale "posiciones", el valor de la variable Random
	    //que va a estar entre 10 y 50
		posiciones=aleatorio.nextInt(50+10;
		//Declaramos el array que se va a llamar vector y va a tener las posiciones 
		//dadas por el valor de la variale random(posiciones)
		int [] vector=new int[posiciones];
		System.out.println(posiciones + " Posiciones");
		// le damos valores al vector, que van a estar entre -100 y 100)
		System.out.println("array de izquierda a derecha");
		for (j=0; j<posiciones; j++) {
			vector[j]=aleatorio.nextInt (200)-100;
			i=0;
			//comprobamos que no se repita ningun valor
			while (i>j) {
				if (vector[j]==vector[i]) {
					vector[j]=aleatorio.nextInt (200)-100;
					j--;
				}
				j++;
			}
			System.out.print(vector[j] + "  ");
		}
		
		System.out.println();
		System.out.println("array de derecha a izquierda");
		
		for (j=posiciones-1; j>=0; j--) {
			System.out.print(vector[j] + "  ");	
		
		}
	

}
}
