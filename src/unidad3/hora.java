package unidad3;

import java.util.Scanner;

public class hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		int hora=25;
		int minutos=60;
		int segundos=60;
		while (hora>24) {
			System.out.println("introduce hora no mayor de 24: ");
			hora=entrada.nextInt();
		}
		while (minutos>59) {
			System.out.println("introduce minutos, no mayor de 59");
			minutos=entrada.nextInt();
		}
		while (segundos>59) {
			System.out.println("introduce segundos, no mayor de 59");
			segundos=entrada.nextInt();
		}
		if (segundos>58) {
			segundos=0;
			if (minutos>58) {
			minutos=0;
			hora++;
			}
			else {
				minutos++;
			}
		}
		else {
			segundos++;
			
		
		}
		System.out.println("La hora un segundo después es: " +hora +" : "+ minutos +" : "+ segundos);
		
	}

}
