package actividades_java;

public class Ejer8 {

	public static void main(String[] args) {
		int suma1,suma2;
		suma1=0;
		suma2=0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				suma1=suma1+i;
			} else {
				suma2=suma2+i;
			}
		}
		
		System.out.println("La suma total de los numeros pares entre 1 y 99 es "+suma1);
		System.out.println("La suma total de los numeros impares entre 2 y 100 es "+suma2);
	}

}
