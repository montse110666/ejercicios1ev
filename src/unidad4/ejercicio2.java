package unidad4;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escribe la cadena a invertir ");
		String cadena;
		String invertida="";
		cadena=entrada.next();
		for (int i=cadena.length()-1; i>=0; i--) {
			invertida+=cadena.charAt(i);
			
		}
		System.out.println("La cadena original es: " + cadena);
		System.out.println("La cadena invertida es: " +invertida);
	}

}
