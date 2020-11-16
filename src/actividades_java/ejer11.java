package actividades_java;

import java.util.Scanner;

public class ejer11 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n1,n2,suma1,suma2;
		char d;
		
		do {
			suma1=0;
			suma2=0;
			System.out.println("Introduce el primer número");
			n1=entrada.nextInt();
			System.out.println("Introduce el segundo número");
			n2=entrada.nextInt();
			for (int i = 1; i <= n1-1; i++) {
				if (n1%i==0) {
					suma1=suma1+i;
				}
			}
			for (int i = 1; i <= n2-1; i++) {
				if (n2%i==0) {
					suma2=suma2+i;
				}
			}
			if (suma1==n2 && suma2==n1) {
				System.out.println(n1+" y "+n2+" son números amigos");
			} else {
				System.out.println(n1+" y "+n2+" no son números amigos");
			}
			System.out.println("Pulse s para salir del programa");
			
			d=entrada.next().charAt(0);
		} while (d!='s');

	}

}
