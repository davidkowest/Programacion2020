package pruebaobjetos;

public class Cuenta {
	//atributos
	
	private int ncuenta;
	private String dni;
	private float saldo;
	private float interes;
	
	//Constructores
	Cuenta () {
		this.ncuenta=0;
		this.dni="123456989Q";
		this.saldo=0;
		this.interes=0;
	}
	
	Cuenta (String dni, double saldo, double interes) {
		this.dni=dni;
		this.saldo=(float) saldo;
		this.interes=(float) interes;
	}
	
	//Metodos
	
	public void actualizarSaldo (int dias) {
		this.saldo=saldo*(interes*dias/100/365+1);
	}
	
	public void ingresarSaldo (double saldo) {
		this.saldo=this.saldo+(float)saldo;
	}
	
	public void retirarSaldo (double saldo) {
		if (this.saldo>saldo) {
			this.saldo=this.saldo-(float)saldo;
		} else {
			System.out.println("No tiene saldo suficiente");
		}
	}
	
	public void muestraCuenta () {
		System.out.println("El numero de cuenta es "+ncuenta);
		System.out.println("El DNI del cliente es "+dni);
		System.out.println("El saldo del cliente es "+saldo);
		System.out.println("El interés de la cuenta es "+interes+"%");
	}
	
	
	
	public int getNcuenta() {
		return ncuenta;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = (float) saldo;
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = (float) interes;
	}
	
	
	
	
	
	
}
