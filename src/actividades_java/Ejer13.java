package actividades_java;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		int year1,mes1,dia1,hora1,minuto1,year2,mes2,dia2,hora2,minuto2,yeartotal,mestotal=0,diatotal=0,computominutos,minutototal,horatotal;
		Scanner entrada=new Scanner(System.in);
		
		do {
			System.out.println("Introduce el año de salida");
			year1=entrada.nextInt();
		} while (year1<=0);
		
		do {
			System.out.println("Introduce el mes de salida");
			mes1=entrada.nextInt();
		} while (mes1<1 || mes1>12);
		
		
		do {
			System.out.println("Introduce el dia de salida");
			dia1=entrada.nextInt();
		} while (dia1<1 || dia1>31);
		
		do {
			System.out.println("Introduce la hora de salida");
			hora1=entrada.nextInt();
		} while (hora1<0 || hora1>24);
		
		do {
			System.out.println("Introduce el minuto de salida");
			minuto1=entrada.nextInt();
		} while (minuto1<0 || minuto1>60);
		
		//****************************Hasta aquí los datos de salida del tren***********************************//
		do {
			System.out.println("Introduce el año de llegada");
			year2=entrada.nextInt();
		} while (year2<=0);
		
		do {
			System.out.println("Introduce el mes de llegada");
			mes2=entrada.nextInt();
		} while (mes2<1 || mes2>12);
		
		
		do {
			System.out.println("Introduce el dia de llegada");
			dia2=entrada.nextInt();
		} while (dia2<1 || dia2>31);
		
		do {
			System.out.println("Introduce la hora de llegada");
			hora2=entrada.nextInt();
		} while (hora2<0 || hora2>24);
		
		do {
			System.out.println("Introduce el minuto de llegada");
			minuto2=entrada.nextInt();
		} while (minuto2<0 || minuto2>60);
		
		  /**************************Hasta aquí los datos de llegada del tren************************************
		 *****************************************************************************************************
		*********************************FIN VALIDACIONES*****************************************************/
		if (minuto2<minuto1) {
			minutototal=minuto2+60-minuto1;
		} else {
			minutototal=minuto2-minuto1;
		}
		
		if (hora2<hora1 && minuto2!=minuto1) {
			horatotal=hora2+23-hora1;
		} else {
			horatotal=hora2-hora1;
		}
		
		if (dia2>dia1 && mes2==mes1 && year2==year1) {
			diatotal=dia2-dia1;
		} else {
			if (mes2!=mes1) {
				diatotal=dia2-dia1+30;
			}
		}
		
		if (mes2!=mes1 || mes2==mes1 && year2!=year1) {
			mestotal=mes2-mes1;
		} else {
			if (mes2==mes1) {
				mestotal=mes2-mes1;
			}
		}
		
		yeartotal=year2-year1-1;
		if (yeartotal<=0) {
			yeartotal=0;
		}
		
		System.out.println("Entre la hora de llegada y salida han pasado "+yeartotal+" años, "+mestotal+" meses, "+diatotal+" dias, "+horatotal+" horas, "+minutototal+" minutos");
		System.out.println(" ");
		
		computominutos = (yeartotal*525600)+(mestotal*43800)+(diatotal*1440)+(horatotal*60)+minutototal;
		
		horatotal=computominutos/60;
		minutototal=computominutos%60;
		System.out.println("Has tardado "+horatotal+" horas y "+minutototal+" minutos");
		
	}

}
