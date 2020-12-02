package unidad2;

import java.util.Scanner;

public class espacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		double rojo;
		double verde;
		double azul;
		double i;
		double y;
		double q;
		System.out.println("Introduce el rojo: ");
		rojo=entrada.nextDouble();
		System.out.println("Introduce el verde: ");
		verde=entrada.nextDouble();
		System.out.println("Introduce el azul: ");
		azul=entrada.nextDouble();
		y=0.299*rojo+0.587*verde+0.114*azul;
		i=0.596*rojo+0.275*verde+0.321*azul;
		q=0.212*rojo+0.528*verde+0.311*azul;
		System.out.printf("los componentes YIQ son: %.3f %.3f %.3f", y,i,q);
			
		
		
	}


	}


