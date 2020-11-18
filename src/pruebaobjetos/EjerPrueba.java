package pruebaobjetos;

public class EjerPrueba {

	public static void main(String[] args) {
//		//Ejercicio 1
//		
//		Persona p1=new Persona();
//		
//		p1.modificarNombre("David");
//		p1.modificarApellidos("Aguilar Mart�n");
//		p1.modificarNif("28789456Z");
//		
//		System.out.println("Mi nombre es "+p1.obtenerNombre()+" "+p1.obtenerApellidos()+" y mi NIF es "+p1.obtenerNif());
//
//		//Ejercicio 2
//		
//		Vehiculo v1=new Vehiculo("Renault");
//		
//		v1.setcRuedas(true);
//		
//		v1.setPotencia(100);
//		
//		v1.printVehiculo();
//		
//		//Ejercicio 3
//		
//		Numero n1=new Numero(6);
//		
//		System.out.println("El doble de "+n1.getNumero()+" es "+n1.getDoble());
//		System.out.println("El triple de "+n1.getNumero()+" es "+n1.getTriple());
//		System.out.println("La suma de "+n1.getNumero()+" mas 8 es "+n1.aniade(8));
//		System.out.println("La resta de "+n1.getNumero()+" menos 3 es "+n1.resta(3)+"\n");
//		
//		//Ejercicio 4
		
		Punto a=new Punto(0, 0);
		Punto b=new Punto(5, 0);
		Punto c=new Punto(0, 8);
		Punto d=new Punto(5, 8);
		
		Punto [] puntos = {a,b,c,d};
		
		Rectangulo r1=new Rectangulo();
		r1.setPuntos(puntos);
	
		//continuar corrigiendo
		
		
		System.out.println("La superficie del tri�ngulo es "+r1.superficie());
		
		Rectangulo r2=new Rectangulo(3.4, 20.7);
		System.out.println("La superficie del tri�ngulo es "+r2.superficie());
		
		
		
		//Ejercicio 5
		
//		Cuenta c1=new Cuenta();
//		c1.muestraCuenta();
//		System.out.println("");
//		Cuenta c2=new Cuenta("28935601Z", 3500.8, 15);
//		c2.muestraCuenta();
//		System.out.println("");
//		
//		c1.ingresarSaldo(200);
//		c1.muestraCuenta();
//		System.out.println("");
//		c2.retirarSaldo(300);
//		c2.muestraCuenta();
//		System.out.println();
//		c2.actualizarSaldo(64);
//		c2.muestraCuenta();
		
		
//		//Ejercicio 6
//		
//		Punto a=new Punto(2,2);
//		Punto b=new Punto(6,6);
//		
//		Linea l1=new Linea(a, b);
//		
//		l1.mueveDerecha(2);
//		l1.mueveArriba(7);
//		
//		l1.muestraLinea();
//		
		
	}

}
