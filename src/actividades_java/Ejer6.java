package actividades_java;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		int x;
		char d;
		Scanner entrada=new Scanner(System.in);
		
		do {
			do {
				System.out.println("Introduce la nota del alumno (recuerda introducir una nota válida)");
				x=entrada.nextInt();	
			} while (x<0 || x>10);
			
			if (x<=4) {
				System.out.println("Tu nota es un "+x+" significa que estas suspenso");
			} else {
				if (x<=6) {
					System.out.println("Tu nota es un "+x+" significa que has sacado un bien. ¡Aprobado por los pelos!");
				} else {
					if (x<=8) {
						System.out.println("Tu nota es un "+x+" ¡Significa que has sacado notable! ¡Enhorabuena!");
					} else {
						System.out.println("Tu nota es un "+x+" ¡Significa que has sacado un sobresaliente! ¡Todo esfuerzo tiene su recompensa!");
					}
				}
			}
			
			System.out.println("Pulse s para salir");
			d=entrada.next().charAt(0);
		} while (d!='s');

	}

}
