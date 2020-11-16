package actividades_java;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		int x,m;
		boolean a;
		Scanner entrada=new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número entre el 1 y el 100");
			x=entrada.nextInt();
		} while (x<1 || x>100);
		
		for (int i = 2; i<=x; i++) {
			m=2;
			a=true;
			while (a==true && m<=i/2) {
				if (i%m==0) {
					a=false;
				} 
				m=m+1;
			}
			if (a==true) {
				System.out.println("El número "+i+" es primo");
			}
			
		}
		
	}

}
