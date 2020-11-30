package personajes;

public class Mago extends Personaje {
	//Atributos
		private String poder;
		
	//Constructores
	
		Mago () {
			this.energia=100;
		}
		
		Mago (String nombre, String poder) {
			super(nombre, 100);
			this.poder=poder;
		}

		
	//M�todos
		
		public String getPoder() {
			return poder;
		}

		public void setPoder(String poder) {
			this.poder = poder;
		}
		
		public String encantar () {
			this.energia-=2;
			return "Mago [poder=" + poder + ", energia=" + energia + "]";
		}
		
}
