package actividades_java;

import java.util.Random;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		float cont1,cont2,cont3,cont4,cont5,cont6,n;
		char d;
		Random r=new Random();
		do {
			System.out.println("¿Cuantas veces vas a lanzar el dado?");
			n=entrada.nextInt();
			cont1=0;
			cont2=0;
			cont3=0;
			cont4=0;
			cont5=0;
			cont6=0;
			if (n>0) {
				for (int i = 1; i <= n; i++) {
					int naleatorio=r.nextInt(6)+1;
					if (naleatorio==1) {
						cont1=cont1+1;
					} else {
						if (naleatorio==2) {
							cont2=cont2+1;
						} else {
							if (naleatorio==3) {
								cont3=cont3+1;
							} else {
								if (naleatorio==4) {
									cont4=cont4+1;
								} else {
									if (naleatorio==5) {
										cont5=cont5+1;
									} else {
										cont6=cont6+1;
									}
								}
							}
						}
					}
				}
				System.out.println("La probabilidad de que salga la cara 1 es del "+cont1/n*100+"%");
				System.out.println("La probabilidad de que salga la cara 2 es del "+cont2/n*100+"%");
				System.out.println("La probabilidad de que salga la cara 3 es del "+cont3/n*100+"%");
				System.out.println("La probabilidad de que salga la cara 4 es del "+cont4/n*100+"%");
				System.out.println("La probabilidad de que salga la cara 5 es del "+cont5/n*100+"%");
				System.out.println("La probabilidad de que salga la cara 6 es del "+cont6/n*100+"%");
			} else {
				System.out.println("El número introducido no es positivo");
			}
			
			System.out.println("Pulse s para salir del programa, pulse cualquier tecla para volver a tirar el dado");
			d=entrada.next().charAt(0);
		} while (d!='s');
	}

}
