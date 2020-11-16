package actividades_java;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		int sbase,comision,km,dieta,sneto;
		char d=0;
		Scanner entrada=new Scanner (System.in);
		
		do {
			sbase=0;
			comision=0;
			km=0;
			dieta=0;
			sneto=0;
			
			do {
				System.out.println("Introduzca su sueldo base");
				sbase=entrada.nextInt();
				System.out.println("Introduzca el total de las ventas");
				comision=entrada.nextInt();
				System.out.println("Introduzca cantidad de km recorridos");
				km=entrada.nextInt();
				System.out.println("Introduzca el numero de dias de desplazamiento");
				dieta=entrada.nextInt();
			} while (sbase<=0 && comision<0 && km<0 && dieta<0);
			
			sbase=(sbase*82)/100;
			comision=comision*5/100;
			dieta=dieta*60;
			sneto=sbase+comision+km+dieta-150;
			
			System.out.println("El sueldo liquido a percibir sera de "+sneto+" eur.");
			System.out.println("Pulse s si desea volver a repetir el programa");
			d=entrada.next().charAt(0);
		} while (d=='s');

	}

}