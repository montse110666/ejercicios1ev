package unidad2;

import java.util.Scanner;

public class sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		double sb;
		double v1;
		double v2;
		double v3;
		
		System.out.println("Escribe tu sueldo base: ");
		sb=entrada.nextDouble();
		System.out.println("escribe tu primera venta: ");
		v1=entrada.nextDouble();
		System.out.println("escribe tu segunda venta: ");
		v2=entrada.nextDouble();
		System.out.println("escribe tu tercera venta: ");
		v3=entrada.nextDouble();
		double comisiones=(v1+v2+v3)*10/100;				
		double st=sb+comisiones;
		System.out.printf("Tu sueldo total es : %.2f",st);
		
		
		
	}

}
