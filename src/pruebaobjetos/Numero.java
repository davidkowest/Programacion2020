package pruebaobjetos;

public class Numero {
	
	//Atributos
	private int numero;
	
	//Contructor
	
	Numero () {
		this.numero=0;
	}
	
	Numero (int numero) {
		this.numero=numero;
	}
	
	
	//Método
	
	public int aniade (int numero) {
		return this.numero+numero;
	}
	
	public int resta (int numero) {
		return this.numero-numero;
	}
	
	public int getNumero () {
		return numero;
	}
	
	public void setNumero (int numero) {
		this.numero=numero;
	}
	
	public int getDoble () {
		return numero*2;
	}
	
	public int getTriple () {
		return numero*3;
	}
	
}
