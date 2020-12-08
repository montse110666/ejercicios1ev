package unidad4;

import java.util.Scanner;

public class ejercicio5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		char []letras={'T','R','W','A','G','M','Y','F','P','D',
		          'X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		String nif;
		System.out.println("Escribe tu DNI con la letra: ");
		nif=entrada.nextLine();
		int numero=Integer.parseInt(nif.substring(0, nif.length() - 1));
		int resto=numero%23;
		char letra=nif.charAt(nif.length()-1);
		if (letra==letras[resto]) System.out.println("El Nif es ccorrecto");
		else System.out.println("No es correcto, el NIF correcto es " + numero + letras[resto]);
				
		}
		

	}


