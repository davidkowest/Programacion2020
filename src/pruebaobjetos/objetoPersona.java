package pruebaobjetos;

public class objetoPersona {

	public static void main(String[] args) {
		Persona p=new Persona();
		
		p.modificarNombre("Manuel");
		p.modificarGenero('H');
		p.modificarOcupacion("Profesor");

		System.out.println("Mi nombre es: "+p.obtenerNombre()+" mi género es "+p.obtenerGenero()+" mi profesión es "+p.obtenerOcupacion());
	}

}
