package personajes;

public class Personaje {
	//Atributos
		protected String nombre;
		protected int energia;
	//Constructores
		Personaje(){
			
		}
		
		Personaje (String nombre, int energia) {
			this.energia=energia;
			this.nombre=nombre;
		}
		
	//Métodos
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEnergia() {
			return energia;
		}
		public void setEnergia(int energia) {
			this.energia = energia;
		}
		
		public void alimentarse (int energia) {
			this.energia+=energia;
		}
		
		
}		
