package ar.com.codoacodo.buscador;

public class Articulo {

	//atributos
	
	private String img;
	private String titulo;
	private String autor;
	private float precio;
	
	//constructor
	
	
	//metodos
	public void detalle () {
		//mostrar los datos del objeto
		System.out.println("Imagen" + img);
		System.out.println("Título: " + titulo);
		System.out.println("Autor " + autor);
		System.out.println("Precio: " + precio);
	}

	public Articulo(String img, String titulo, String autor, float precio) {
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}

