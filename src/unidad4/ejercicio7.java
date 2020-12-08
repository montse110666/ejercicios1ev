package unidad4;

import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		Random aleatorio=new Random();
		int posiciones=0;
		int i=0;
		int j=0;
		int mayor=-999999;
		int menor=1000001;
		
		while ((posiciones<10) || (posiciones>1000000)) {
			System.out.println("Introduce la longitud del vector ");
			posiciones=entrada.nextInt();
		}
		int [] vector=new int[posiciones];
		long tiempo1 = System.currentTimeMillis();
		for (i=0; i<posiciones; i++) {
			vector[i]=aleatorio.nextInt(1000000+999999)-999999;
			System.out.print(vector[i]+ " ");
			if (vector[i]>mayor) mayor=vector[i];
			if (vector[i]<menor) menor=vector[i];
			while (j>i) {
				if (vector[i]==vector[j]) {
					vector[i]=aleatorio.nextInt(1000000+999999)-999999;
					i--;
				}
				i++;
			}
		
		}
		long tiempo2= System.currentTimeMillis()- tiempo1;
		System.out.println();
		System.out.println("El tamaño del vector es : " +posiciones);
		long segundos = tiempo2 / 1000;
		long milis = tiempo2 % 1000;
		System.out.printf("ha tardado %d, %d segundos en rellenar el vector%n", segundos, milis);
		long tiempo3 = System.currentTimeMillis();
		System.out.println("La diferencia entre el mayor "+mayor+" y el menor "+ menor+ " es: " +(mayor-menor));
		long tiempo4= System.currentTimeMillis()- tiempo1;
		long segundos1 = tiempo4 / 1000;
		long milis1 = tiempo4 % 1000;
		System.out.printf("ha tardado %d, %d segundos en calcular la diferencia entre el mayor y el menor%n" , segundos1, milis1);
	}

}
