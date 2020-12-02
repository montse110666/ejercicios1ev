package unidad2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class conversor {

	static float euro;
	static float dolar;
	static String linea;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		float euro;
		float dolar;
		String linea;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Introduce Euros: ");
		linea = entrada.readLine();
		euro=Float.parseFloat(linea);
		dolar=euro*1.17f;
		System.out.print(euro + "€ son ");
		System.out.printf("%.2f",dolar);
		System.out.print(" dolares");
		
	}

}
