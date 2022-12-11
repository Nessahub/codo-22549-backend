package ar.com.codoacodo.consola;

public class Consola {

		
		private String nombre = "";
		protected int bit = 0;		
		private String marca = "";
		 
		//constructor con todos los parametros
		//porque se que todos los hijos se crearan con dichos parametros
		//alt + shift+s
	
		public Consola(String nombre, Integer bit, String marca) {
			this.nombre = nombre;
			this.bit = bit;
			this.marca = marca;
		}

		

		//como nombre y marca son private
		// expongo getter y setter
		
		public String getNombre() {
			return nombre;
		}


		public int getBit() {
			return bit;
		}


		public String getMarca() {
			return marca;
		}



		//polimorfismo
		public String toString() {
			return "Consola [nombre=" + nombre + ", bit=" + bit + ", marca=" + marca + "]";
		}
		
		public void mostrar() {
			System.out.println(toString());
		}
		
}
