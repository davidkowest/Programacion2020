package actividades_java;

import java.util.Random;
import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random r= new Random();
		
		int x;
		char d;
		
		do {

			int nsecreto=r.nextInt(100)+1;
			System.out.println("Vamos a jugar a un juego\n");
			System.out.println("He instalado bombas en los lugares mas emblem�ticos de este maldito pa�s");
			System.out.println("Si quieres salvar a tu naci�n deberas averiguar en que n�mero del 1 al 100 estoy pensando");
			System.out.println("Adelante, introduce un n�mero. �POR ESPA�ITA!");
			
			do {
				x=entrada.nextInt();
				if (x>nsecreto) {
					System.out.println("�Te pasaste de listo! Prueba con un n�mero mas bajo");
				} else {
					if (x<nsecreto) {
						System.out.println("Te quedaste corto como tus neuronas. Prueba un n�mero mayor");
					}
				}
			} while (x!=nsecreto);
			System.out.println("�MALDICI�N! �Acertaste! �Tendr�s la misma suerte la pr�xima vez?\n");
			System.out.println("�Quieres volver a intentarlo?");
			
			System.out.println("Pulse cualquier tecla para reintentar, pulse S si quiere salir del programa");
			d=entrada.next().charAt(0);
		} while (d!='s');

	}

}
