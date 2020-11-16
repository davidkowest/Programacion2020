package actividades_java;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		
		int x,suma1,suma2,suma3,cont1,cont2;
		char d;
		
		do {
		x=0;
		suma1=0;
		suma2=0;
		suma3=0;
		cont1=0;
		cont2=0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número");
			x=entrada.nextInt();
			if (x>0) {
				suma1=suma1+x;
				cont1=cont1+1;
			} else {
				if (x<0) {
					suma2=suma2+x;
					cont2=cont2+1;
				} else {
					suma3=suma3+1;
				}
			}
		}
		
		if (cont1>0) {
			System.out.println("La media de los números positivos introducidos es de "+suma1/cont1);
		} else {
			System.out.println("No ha introducido ningún número positivo");
		}
		
		if (cont2>0) {
			System.out.println("La media de los números negativos es de "+suma2/cont2);
		} else {
			System.out.println("No ha introducido ningún número negativo");
		}
		
		System.out.println("El número de 0 introducidos es de "+suma3+"\n");
		System.out.println("Pulse s si quiere salir del programa");
		d=entrada.next().charAt(0);
		

		
			
		} while (d!='s');
		
	}

}
