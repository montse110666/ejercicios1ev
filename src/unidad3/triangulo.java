package unidad3;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1;
		double num2;
		double num3;
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce la longitud del primer lado: ");
		num1=entrada.nextDouble();
		System.out.println("introduce la longitud del segundo lado: ");
		num2=entrada.nextDouble();
		System.out.println("introduce la longitud del tercer lado: ");
		num3=entrada.nextDouble();
		if (num1<num2+num3 & num2<num1+num3 & num3<num1+num2) {
			System.out.println("Los datos introducidos pueden formar un triángulo");
			if (num1==num2 & num1==num3) System.out.println("el triángulo es equilátero");
			else {
				if (num1==num2 || num1==num3 || num2==num3) {
					System.out.println("el triángulo es isósceles");
				}
				else System.out.println("El triángulo es escaleno");
			}
		}
		else System.out.println("Los datos introducidos no pueden formar un triángulo");
}
}