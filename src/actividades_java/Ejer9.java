package actividades_java;

import java.util.Scanner;

/**
 * 
 * @author Davidkowest
 *
 */

public class Ejer9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float x, c, cuenta;
		int v = 0;

		System.out.println("Introduce el primer n�mero");
		x = entrada.nextFloat();
		System.out.println("Introduce el segundo n�mero");
		c = entrada.nextFloat();

		do {
			cuenta=0;
			System.out.println("\nElija una de las siguientes opciones\n");
			System.out.println("1.- Sumar los n�meros.");
			System.out.println("2.- Restar los n�meros.");
			System.out.println("3.- Multiplicar los n�meros.");
			System.out.println("4.- Dividir los n�meros.");
			System.out.println("5.- Salir del programa");
			v=entrada.nextInt();
			
			switch (v) {
			case 1:
				cuenta = x + c;
				System.out.println("La suma de los n�meros es "+cuenta);
				break;
			case 2:
				cuenta = x - c;
				System.out.println("La resta de los n�meros es "+cuenta);
				break;	
			case 3:
				cuenta = x * c;
				System.out.println("El producto de los n�meros es "+cuenta);
				break;	
			case 4:
				cuenta = x / c;
				System.out.println("La divisi�n de los n�meros es "+cuenta);
				break;
			
			}
		} while (v != 5);
	}

}
