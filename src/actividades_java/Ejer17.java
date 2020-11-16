package actividades_java;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {
		int b=0,x=0,suma,num=0,cont,cont2;
		char d=0;
		Scanner entrada=new Scanner (System.in);
		
		do {
			suma=0;
			cont=0;
			cont2=0;
			
			System.out.println("Introduzca el valor baliza");
			b=entrada.nextInt();
			System.out.println("¿Que cantidad de numeros va a introducir?");
			x=entrada.nextInt();
			
			for (int i = 1; i <= x; i++) {
				do {
					System.out.println("Introduzca un numero");
					num=entrada.nextInt();
				} while (num==b);
				if (num>b) {
					suma=suma+num;
					cont=cont+1;
				} else {
					cont2=cont2+1;
				}
			}
			System.out.println("En total, hay "+cont2+" numeros menores que "+b);
			System.out.println("Hay "+cont+" numeros mayores que "+b);
			System.out.println("La suma de los numeros mayores que "+b+" es de "+suma);
			System.out.println("");
			System.out.println("Pulse s para reiniciar el programa");
			d=entrada.next().charAt(0);
			
			
			
		} while (d=='s');
		

	}

}