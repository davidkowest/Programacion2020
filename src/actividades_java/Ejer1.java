package actividades_java;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		float x,suma;
		char d;
		
		
		do {
			suma=0;
			System.out.println("Por favor, introduzca la nota de Programación:");
			x=teclado.nextFloat();
			suma=suma+x;
			
			System.out.println("Por favor, introduzca la nota de Lenguaje de marcas:");
			x=teclado.nextFloat();
			suma=suma+x;
			
			System.out.println("Por favor, introduzca la nota de Base de datos:");
			x=teclado.nextFloat();
			suma=suma+x;
			
			System.out.println("Por favor, introduzca la nota de Entornos de desarrollo:");
			x=teclado.nextFloat();
			suma=suma+x;
			
			System.out.println("Por favor, introduzca la nota de Sistemas informáticos:");
			x=teclado.nextFloat();
			suma=suma+x;
			
			System.out.println("Por favor, introduzca la nota de Formación y orientación Laboral:");
			x=teclado.nextFloat();
			suma=suma+x;
			
			System.out.println("Tu nota media del curso es: "+(suma/6));
			System.out.println("Pulse s si quieres volver a repetir el programa");
			System.out.println();
			d=teclado.next().charAt(0);
			
		} while (d=='s');
		

	}

}
