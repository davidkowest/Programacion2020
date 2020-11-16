package actividades_java;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		int x=0,semilla=0,costosemillas=0,valorsemilla=0;
		char d=0;
		Scanner entrada=new Scanner (System.in);
		
		do {
			do {
				System.out.println("Elige un tipo de verdura");
				System.out.println("");
				System.out.println("1.- Tomate");
				System.out.println("2.- Repollo");
				System.out.println("3.- Patata");
				System.out.println("4.- Cebolla");
				System.out.println("");
				x=entrada.nextInt();
				
				switch (x) {
				case 1:
					do {
						System.out.println("Elige un tipo de tomate:");
						System.out.println("");
						System.out.println("1.- Pera");
						System.out.println("2.- Ensalada");
						x=entrada.nextInt();
						switch (x) {
						case 1:
							valorsemilla=15;
							break;

						default:
							valorsemilla=20;
							break;
						}
					} while (x<=0 || x>=3);
					break;
				case 2:
					valorsemilla=10;
					break;
				case 3:
					do {
						System.out.println("Elige un tipo de patata:");
						System.out.println("");
						System.out.println("1.- Criolla");
						System.out.println("2.- Pastusa");
						System.out.println("3.- Salentuna");
						x=entrada.nextInt();
						switch (x) {
						case 1: valorsemilla=8;
							
							break;
						case 2: valorsemilla=9;
							break;
						default:
							valorsemilla=11;
							break;
						}
						
						
					} while (x<=0 || x>=4);
					break;
				default:
					do {
						

						System.out.println("Elige un tipo de cebolla:");
						System.out.println("");
						System.out.println("1.- Larga");
						System.out.println("2.- Vieja");
						x=entrada.nextInt();
						
						switch (x) {
						case 1:
							valorsemilla=15;
							break;

						default:
							valorsemilla=13;
							break;
						}
						
					} while (x<1 || x>2);
					break;
				}
				
			} while (x<=0 || x>4);
			do {
				System.out.println("¿Que cantidad de semillas va a plantar?");
				semilla=entrada.nextInt();
				
			} while (semilla<=0);
			
			costosemillas=semilla*valorsemilla;
			System.out.println("");
			System.out.println("El costo del cultivo es: "+costosemillas);
			System.out.println("Pulsa s si quiere volver a repetir el programa");
			d=entrada.next().charAt(0);
		} while (d=='s');
	}

}