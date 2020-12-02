package unidad3;

import java.util.Scanner;

public class bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int año=0;
		System.out.println("introduce un año para saber si es bisiesto: ");
		año=entrada.nextInt();
		if (año%4==0 || (año%100==0 & año%400==0)) {	
			
				System.out.println("es bisiesto");		
			}
		else  System.out.println("no es bisiesto");
	}

}
