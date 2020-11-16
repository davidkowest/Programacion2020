package pruebaobjetos;

public class Persona {
	//Atributos
	
	private String nombre;
	private String apellidos;
	private char genero;
	private String ocupacion;
	private String nif;
	
	//Constructores 
	
	
	//Métodos
	
	public String obtenerNombre () {
		return this.nombre;
	}
	
	public void modificarNombre (String nombre) {
		this.nombre=nombre;
	}
	
	public char obtenerGenero () {
		return this.genero;
	}
	

	public void modificarGenero (char genero) {
		this.genero=genero;
	}
	
	public String obtenerOcupacion () {
		return this.ocupacion;
	}
	

	public void modificarOcupacion (String ocupacion) {
		this.ocupacion=ocupacion;
	}
	
	public String obtenerNif () {
		return this.nif;
	}
	
	public void modificarNif (String nif) {
		this.nif=nif;
	}
	
	public String obtenerApellidos () {
		return this.apellidos;
	}
	
	public void modificarApellidos (String apellidos) {
		this.apellidos=apellidos;
	}
}
