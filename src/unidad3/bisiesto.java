package unidad3;

import java.util.Scanner;

public class bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int a�o=0;
		System.out.println("introduce un a�o para saber si es bisiesto: ");
		a�o=entrada.nextInt();
		if (a�o%4==0 || (a�o%100==0 & a�o%400==0)) {	
			
				System.out.println("es bisiesto");		
			}
		else  System.out.println("no es bisiesto");
	}

}
