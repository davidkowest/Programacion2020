package actividades_java;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {
		
		int n=0,suma1=0,suma2=0,f=0;
		char d=0;
		Scanner entrada=new Scanner (System.in);
		
		
		do {
			
			do {
				System.out.println("Introduzca un numero mayor que 2");
				n=entrada.nextInt();
			} while (n<=2);
			
			for (int x = 2; x <= n; x++) {
				suma1=0;
				suma2=0;
				
				for (int i = x-1; i >= 1; i--) {
					suma1=suma1+i;
				}
				f=0;
				do {
					if (f==0) {
						f=x+1;
					} else {
						f=f+1;
					}
					
					suma2=suma2+f;
				} while (suma2<suma1);
				if (suma1==suma2) {
					System.out.println(x+" es un centro numerico");
				}
			}
			
			System.out.println("Pulse s para salir del programa");
			d=entrada.next().charAt(0);
			
		} while (d!='s');

	}

}