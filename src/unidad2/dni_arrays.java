package unidad2;

import java.util.Scanner;

public class dni_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int dni;
		int c;
		char caracteresDni[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
       
		caracteresDni=new char[23];
		System.out.println("Introduce los números de tu DNI: ");
		dni=entrada.nextInt();
		c=dni%23;
			
		char caracter=caracteresDni[c];
			System.out.println("La letra de tu DNI es: " + caracter);
		
		
	}

}
