package unidad4;

import java.util.Random;
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		Random aleatorio=new Random();
		int posiciones=0;
		int i=0;
		int j=0;
		int suma=0;
		int sumab=7;
		int nosuma=0;
		
		while (posiciones<10 || posiciones>200) {
			
			System.out.println("Escribe las posiciones del vector: ");
			posiciones=entrada.nextInt();
		}
		entrada.close();
		int [] vector=new int[posiciones];
		for (i=0; i<vector.length; i++) {
			vector[i]=aleatorio.nextInt (200)-100;
			System.out.print(vector[i] + " ");			
		}
		System.out.println();		
		for (i=0; i<vector.length; i++) {
			if (vector[i]==13){
				System.out.println(vector[i]);
				for (j=i; j<=i+13; i++) {
					if (j==vector.length) j=i+13;
					sumab+=vector[j];
					
				}
				if (sumab==7) suma+=vector[i];
				nosuma++;
			}
			else suma+=vector[i];
		}
		
		System.out.println("La suma de los elementos del vector es: "+ suma);
		System.out.println("los elementos sin sumar son: "+ nosuma );
}
}