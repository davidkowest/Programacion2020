package actividades_java;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		int  x=0,d;
		char c;
		Scanner entrada=new Scanner (System.in);
		do {
			do {System.out.println("Introduce un número de 4 cifras");
			x=entrada.nextInt();
			} while ((x<1000 || x>9999) && (x>-1000 || x<-9999));
			
			d=x/1000;
			System.out.println("La primera cifra es "+d);
			x=x%1000;
			d=x/100;
			System.out.println("La segunda cifra es "+d);
			x=x%100;
			d=x/10;
			System.out.println("La tercera cifra es: "+d);
			x=x%10;
			System.out.println("La cuarta cifra es: "+x);
			System.out.println("¿Desea introducir otro numero? En caso afirmativo pulse s");
			c=entrada.next().charAt(0);
		} while (c == 's');

	}

}
