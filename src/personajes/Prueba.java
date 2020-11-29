package personajes;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		String nombre,arma,poder;
		int energia,x;
		char d;
		
		Scanner entrada= new Scanner (System.in);
		
		
		do {
			do {
				System.out.println("Elige un tipo de personaje:");
				System.out.println("");
				System.out.println("1.- Guerrero");
				System.out.println("2.- Mago");
				x=entrada.nextInt();
				
				switch (x) {
				case 1: 
				System.out.println("Introduce el nombre del guerrero");
				nombre=entrada.next();
				System.out.println("Introduce la energía inicial del guerrero");
				energia=entrada.nextInt();
				System.out.println("Introduce el arma del guerrero");
				arma=entrada.next();
				
				Guerrero g1= new Guerrero (nombre,energia,arma);
					
					break;


					break;
				}
			} while (x<=0 || x>2);
			
			
			System.out.println("pulse s si quieres crear otro personaje");
			d=entrada.next().charAt(0);
		} while (d=='s');
		
	}

}
