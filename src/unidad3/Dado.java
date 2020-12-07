package unidad3;

import java.util.Random;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int tiradas=0;
		int numDado=0;
		int uno=0,dos=0,tres=0,cuatro=0,cinco=0,seis=0;
		System.out.println("¿Cuantas veces quieres que tire el dado? ");
		tiradas=entrada.nextInt();
		for (int i=1; i<=tiradas; i++) {
			Random num=new Random();
			numDado = num.nextInt(6)+1;
			switch(numDado) {
			case 1:
				uno++;
				break;
			case 2:
				dos++;
				break;
			case 3:
				tres++;
				break;
			case 4:
				cuatro++;
				break;
			case 5:
				cinco++;
				break;
			case 6:
				seis++;
			 break;
			}
		}
		System.out.println("El uno salió "+ uno + " veces");
		System.out.println("El dos salió "+ dos + " veces");
		System.out.println("El tres salió "+ tres + " veces");
		System.out.println("El cuatro salió "+ cuatro + " veces");
		System.out.println("El cinco salió "+ cinco + " veces");
		System.out.println("El seis salió "+ seis + " veces");
	}

}

