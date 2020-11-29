package paquete1;

public class Main {

	public static void main(String[] args) {
		Numero n = new Numero(3);
		Envoltorio e = new Envoltorio (n);
		System.out.println(n.getValor());
		System.out.println(e.getNumero().getValor()); 
		}


	}