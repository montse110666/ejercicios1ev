package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.println("Escrie un n�mero");
		num=entrada.nextInt();
		if (num % 2 ==0) {
			System.out.println("el n�mero " + num + " es par" );
		}
			else {
				System.out.println("el n�mero " + num + " es impar" );
		}
		
	}

}
