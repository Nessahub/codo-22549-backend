package ar.com.codoacodo.buscador;

public class HomeMain {

	public static void main(String[] args) {
		//para crear un objeto
		// Clase nombreDelObjeto = new Clase();
		
		//ahora que miBuscador está vivo, puedo ejecutar cualquiera de 
		//sus metodos publicos
		Buscador miBuscador = new Buscador();
		
		//primero defino cual es la clave de busqueda
		miBuscador.cambiarClave("iron man");
		
		//ejecuto metodo Buscar() del objeto miBuscador
		miBuscador.buscar();
	
		//cuantos resultados encontró el buscador
		System.out.println("Hemos encontrado " + miBuscador.getCantRes() + " resultados para " 
		+ miBuscador.getClaveBusqueda() + "");
	}

}
