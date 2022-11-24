package ar.com.codoacodo.consola;

public class MainConsolas {

	public static void main(String[] args) {
		
		Consola[] consolas = Vendedor.venderConsolas();
		
		for(int i = 0; i < consolas.length; i++) {
			consolas[i].mostrar();
		}
		
	}

}
