package actividades_java;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int x,cont;
		char d;
		
		do {
			do {
				cont=0;
				x=0;
				System.out.println("Introduce un número positivo");
				x=entrada.nextInt();
			} while (x<=0);
			
			for (int i = 1; i <= x; i++) {
				if (i%3==0) {
					System.out.println(i+" es múltiplo de 3");
					cont=cont+1;
				}
			}
			System.out.println(" ");
			System.out.println("En total hay "+cont+" múltiplos de 3 entre 1 y "+x);
			
			System.out.println("pulse s si desea salir del programa");
			d=entrada.next().charAt(0);
		} while (d!='s');

	}

}
