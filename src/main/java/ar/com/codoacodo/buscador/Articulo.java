package ar.com.codoacodo.buscador;

public class Articulo {

	//atributos
	private String img;
	private String titulo;
	private String autor;
	private float precio;
	
	//constructor/es
	public Articulo() {
		
	}
	
	//metodos
	public void detalle () {
		//mostrar los datos del objeto
		System.out.println("Imagen" + img);
		System.out.println("Título: " + titulo);
		System.out.println("Autor " + autor);
		System.out.println("Precio: " + precio);
	}
	
}

