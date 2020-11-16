package pruebaobjetos;

public class Rectangulo {
	
	//Atributos
	
	private Punto a;
	private Punto b;
	private Punto c;
	private Punto d;
	private float base;
	private float altura;
	
	//constructores
	
	public Rectangulo(Punto a,Punto b,Punto c,Punto d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		
		this.base=b.getX();
		this.altura=c.getY();
	}
	
	public Rectangulo(double base,double altura) {
		this.base=(float)base;
		this.altura=(float)altura;
	}
	//Métodos
	public float superficie () {
		return this.base*this.altura;
	}
	
	
	
}
