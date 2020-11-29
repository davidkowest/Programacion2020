package personajes;

public class Guerrero extends Personaje {
	//Atributos
	private String arma;
	
	//Constructor
	Guerrero () {
		
	}
	
	Guerrero (String nombre, int energia, String arma) {
		this.nombre=nombre;
		this.energia=energia;
		this.arma=arma;
	}


	//Métodos
	
	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	
	public String combatir (int energia) {
		this.energia-=energia;	
		return "Guerrero [arma=" + arma + ", energia=" + energia + "]";
	}

	
}
