package paquete1;

public class Envoltorio {
	private Numero n;

	public Envoltorio(Numero n) {
		n.setValor(0);
	}

	public Numero getNumero() {
		return n;
	}
}