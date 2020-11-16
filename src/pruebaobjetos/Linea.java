package pruebaobjetos;

public class Linea {
	//Atributos
	
	private Punto a;
	private Punto b;
	
	//contructores
	
	public Linea () {
		this.a=new Punto (0,0);
		this.b=new Punto (0,0);
	}
	
	public Linea (Punto a,Punto b) {
		this.a=a;
		this.b=b;
	}
	
	//Métodos
	
	public void mueveDerecha (double derecha) {
		this.a.setX(this.a.getX()+(float)derecha);
		this.b.setX(this.b.getX()+(float)derecha);
	}
	
	public void mueveIzquierda (double izquierda) {
		this.a.setX(this.a.getX()-(float)izquierda);
		this.b.setX(this.b.getX()-(float)izquierda);
	}
	
	public void mueveArriba (double arriba) {
		this.a.setY(this.a.getY()+(float)arriba);
		this.b.setY(this.b.getY()+(float)arriba);
	}
	
	public void mueveAbajo (double abajo) {
		this.a.setY(this.a.getY()-(float)abajo);
		this.b.setY(this.b.getY()-(float)abajo);
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}
	
	public void  muestraLinea () {
		System.out.println("[("+a.getX()+","+a.getY()+"),("+b.getX()+","+b.getY()+")]");
	}
	
	
	
}
