package pruebaobjetos;

public class Vehiculo {
	//Atributos
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
	//Constructores
	
	Vehiculo (String modelo) {
		this.modelo=modelo;
	}
	
	//M�todos
	
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public boolean iscRuedas() {
		return cRuedas;
	}
	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	
	public void printVehiculo(){
		if (cRuedas) {
			System.out.println("El modelo es: "+modelo+" La potencia es: "+potencia+" y tiene tracci�n en 4 ruedas");
		} else {
			System.out.println("El modelo es: "+modelo+" La potencia es: "+potencia+" y no tiene tracci�n en 4 ruedas");
		}
	}
	
	
	
	
	
}
