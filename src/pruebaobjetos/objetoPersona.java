package pruebaobjetos;

public class objetoPersona {

	public static void main(String[] args) {
		Persona p=new Persona();
		
		p.modificarNombre("Manuel");
		p.modificarGenero('H');
		p.modificarOcupacion("Profesor");

		System.out.println("Mi nombre es: "+p.obtenerNombre()+" mi g�nero es "+p.obtenerGenero()+" mi profesi�n es "+p.obtenerOcupacion());
	}

}
