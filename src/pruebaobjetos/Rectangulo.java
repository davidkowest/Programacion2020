package pruebaobjetos;

public class Rectangulo {
	
	//Atributos
	
//	private Punto a;
//	private Punto b;
//	private Punto c;
//	private Punto d;
	private float base;
	private float altura;
	
	private Punto [] puntos;
	
	//constructores
	
	public Rectangulo(Punto [] puntos) {
//		this.a=a;
//		this.b=b;
//		this.c=c;
//		this.d=d;
		
		this.puntos= puntos;
		
		
		
		this.base=puntos[1].getX();
		this.altura=puntos[3].getY();
	}
	
	

	public Rectangulo(double base,double altura) {
		this.base=(float)base;
		this.altura=(float)altura;
	}
	//M�todos
	public float superficie () {
		return this.base*this.altura;
	}



	public Punto[] getPuntos() {
		return puntos;
	}



	public void setPuntos(Punto[] puntos) {
		this.puntos = puntos;
	}
	
	
	
	
	
}
