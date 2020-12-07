package unidad4;

import java.util.Scanner;

public class ejercicio1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		String cadena;
		char c;
		System.out.println("Escribe la cadena ");
		cadena=entrada.next();
		int n=0;
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		int numCaracteres=cadena.length();
		System.out.println("los caracteres son: "+numCaracteres);
		for (n = 0; n <cadena.length (); n++) { 
			c = cadena.charAt (n);
			if (c=='a')	a++;
			if (c=='e') e++;
			if (c=='i') i++;
			if (c=='o') o++;
			if (c=='u') u++;
		}
		System.out.println ("La vocal a se repite: " + a + " veces"); 
		System.out.println ("La vocal e se repite: " + e + " veces"); 			
		System.out.println ("La vocal i se repite: " + i + " veces"); 			
		System.out.println ("La vocal o se repite: " + o + " veces"); 			
		System.out.println ("La vocal u se repite: " + u + " veces"); 			
	}

}
