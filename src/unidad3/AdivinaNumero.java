package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		int numAleatorio1=0;
		int numAleatorio2=0;
		int num3=0;
		
		while ((numAleatorio2<1000) || (numAleatorio2>100000)) {
			Random num2=new Random();
			numAleatorio2 = num2.nextInt();
		}
		while ((numAleatorio1<=0) || (numAleatorio1>=numAleatorio2)){
			Random num1=new Random();
			numAleatorio1=num1.nextInt();
		}
		while (num3!=numAleatorio1) {
			System.out.println("He pensado un número entre 1 y " + numAleatorio2 + ", adivina cuál es: ");
			num3=entrada.nextInt();
			if (numAleatorio1>num3) {
				System.out.println("El número aleatorio es mayor que " + num3);
			}
			if (numAleatorio1<num3) {
				System.out.println ("El número aleatorio es menor que " + num3);
				}
			}
		System.out.println("Enhorabuena, has accertado");
		}
		
}
