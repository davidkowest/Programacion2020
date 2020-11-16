package actividades_java;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		int n1,n2,n3,n;
		char d=0;
		Scanner entrada=new Scanner (System.in);
		do {
			n1=-2000000;
			n2=-2000000;
			n3=0;
			n=0;
			
			do {
				System.out.println("¿Cuantos numeros vas a introducir?");
				n=entrada.nextInt();
			} while (n<=1);
			for (int i = 1; i <= n; i++) {
				System.out.println("Introduce un numero");
				n3=entrada.nextInt();
				if (n3>=n1) {
					n2=n1;
					n1=n3;
				} else {
					if (n3>n2) {
						n2=n3;
						
					}
				}
			}
			System.out.println("Los numeros mayones son "+n1+" y "+n2);
			System.out.println("pulse s para salir del programa");
			d=entrada.next().charAt(0);
			
		} while (d!='s');
		

	}

}