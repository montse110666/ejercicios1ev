package unidad3;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String operador;
		Scanner entrada=new Scanner(System.in);
		String respuesta="S";
		int num1=0;
		int num2=0;
		int resultado=0;
		while (respuesta.equalsIgnoreCase("S")) {
			System.out.printf("Que operaci�n deseas realizar, teniendo en cuenta que:%n + = sumar%n - = restar%n x = multiplicar%n / = dividir%n ");
			operador=entrada.next();
			System.out.println("Dame el primer n�mero: ");
			num1=entrada.nextInt();
			System.out.println("Dame el segundo n�mero: ");
			num2=entrada.nextInt();
			if (operador.equals("+")) {
			   resultado =num1+num2;	   		   			
			}
			if (operador.equals("-")) {
				resultado=num1-num2;
			}
			if (operador.equals("x")) {
				resultado=num1*num2;
			}
			if (operador.equals("/")) {
				resultado=num1/num2;
			}
			System.out.println("El resultado de la operaci�n " + num1 + operador + num2 + " es: "+ resultado);
			System.out.println("Quieres realizar otra operaci�n, S/N? ");
			respuesta=entrada.next();
		}
	}
}