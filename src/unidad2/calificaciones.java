package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int calif_matem,calif_fisica,calif_quimica;
		int tarea_mat1,tarea_mat2,tarea_mat3;
		int tarea_fis1,tarea_fis2;
		int tarea_quim1,tarea_quim2,tarea_quim3;
		float prom_mat;
		float prom_fis;
		float prom_quim;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce la nota del examen de matematicas: ");
		calif_matem=Integer.parseInt(entrada.readLine());
		System.out.println("Introduce la nota de la primera tarea de matemáticas: ");
		tarea_mat1=Integer.parseInt(entrada.readLine());
		System.out.println("Introduce la nota de la segunda tarea de matemáticas: ");
		tarea_mat2=Integer.parseInt(entrada.readLine());
		System.out.println("Introduce la nota de la tercera tarea de matemáticas: ");
		tarea_mat3=Integer.parseInt(entrada.readLine());
		System.out.println("Introduce la nota del examen de física: ");
		calif_fisica=Integer.parseInt(entrada.readLine());
		System.out.println("Introduce la nota de la primera tarea de física: ");
		tarea_fis1=Integer.parseInt(entrada.readLine());
		System.out.println("Introduce la nota de la segunda tarea de física: ");
		tarea_fis2=Integer.parseInt(entrada.readLine());
		System.out.println("Introduce la nota del examen de química: ");
		calif_quimica=Integer.parseInt(entrada.readLine());
		System.out.println("Introduce la nota de la primera tarea de química: ");
		tarea_quim1=Integer.parseInt(entrada.readLine());
		System.out.println("Introduce la nota de la segunda tarea de química: ");
		tarea_quim2=Integer.parseInt(entrada.readLine());
		System.out.println("Introduce la nota de la tercera tarea de química: ");
		tarea_quim3=Integer.parseInt(entrada.readLine());
		float suma_tareasmat=tarea_mat1+tarea_mat2+tarea_mat3;
		suma_tareasmat=suma_tareasmat/3;
		prom_mat=calif_matem*0.9f+suma_tareasmat*0.1f;
		float suma_tareasfis=tarea_fis1+tarea_fis2;
		suma_tareasfis=suma_tareasfis/2;
		prom_fis=calif_fisica*0.80f+suma_tareasfis*0.20f;
		float suma_tareasquim=tarea_quim1+tarea_quim2+tarea_quim3;
		suma_tareasquim=suma_tareasquim/3;
		prom_quim=calif_quimica*0.85f+suma_tareasquim*0.15f;
		float prom_total=(prom_mat+prom_fis+prom_quim)/3;
		System.out.print("El promedio de la nota de matemáticas es: ");
		System.out.printf("%.2f\n",prom_mat);
		System.out.print("El promedio de la nota de física es: ");
		System.out.printf("%1.2f\n",prom_fis);
		System.out.print("El promedio de la nota de química es: ");
		System.out.printf("%1.2f\n",prom_quim);
		System.out.print("El promedio de todas las asignaturas es: ");
		System.out.printf("%1.2f\n",prom_total);
				
		
		
	}

}
