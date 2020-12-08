package unidad4;

import java.util.Scanner;

public class ejercicio5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		char []letras={'T','R','W','A','G','M','Y','F','P','D',
		          'X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int nif=0;
		System.out.println("Escribe tu DNI: ");
		nif=entrada.nextInt();
		int resto=nif%23;
		char letra=letras[resto];
		System.out.println("Tu NIF es: " + nif + letra);
	}

}
