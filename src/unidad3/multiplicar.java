package unidad3;

import java.util.Scanner;

public class multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int tabla=0;
		int i;
		int resultado=0;
		int fallo=0;
		String respuesta="S";
	while (respuesta.equalsIgnoreCase("S")) {
		System.out.println("¿Que tabla desea repasar, del 1 al 9? ");
		tabla=entrada.nextInt();
		for (i=1; i<=10; i++) {
			System.out.println(i+ "x" +tabla+"= ");
			resultado=entrada.nextInt();
			if (i*tabla!=resultado) {
				System.out.println("El resultado no es correcto");
				System.out.println("La respuesta correcta es " + i*tabla);
				fallo++;
			}
		}
		if (fallo<2) System.out.println("HA APROBADO");
		else System.out.println("HA SUSPENDIDO");
		System.out.println("¿Desea repasar otra tabla? S/N ");
		respuesta=entrada.next();
		fallo=0;	}
	}
}
