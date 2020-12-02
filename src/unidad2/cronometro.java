package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cronometro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String nombre;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long tiempo1 = System.currentTimeMillis();
		System.out.println("Introduce tu nombre: ");
		nombre = in.readLine();
		long tiempo2 = System.currentTimeMillis() - tiempo1;
		long segundos = tiempo2 / 1000;
		long milis = tiempo2 % 1000;	
		System.out.printf("Hola %s, has tardado %d, %d segundos en decirme tu nombre", nombre, segundos, milis);

	}

}
