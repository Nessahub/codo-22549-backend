package ar.com.codoacodo.buscador;

//nombre clase
public class Buscador {
	
	//visibilidad de una clase
	/*
	 - private
	 + public
	 ~ o # protected 
	 
	 */
	
	//o.o.p. atributos seam privados
	private String claveBusqueda;
	
	private Articulo[] resultado; 
	
	private int cantRes;
	//constructor/es: tiene el mismo nombre de la clase que puede o no tener parametros.
	public Buscador() {
		System.out.println("nace un buscador");
		//cuando nace definimos el tamaño del resultado
		resultado = new Articulo[0];
	}
	
	//metodos
	public void buscar() {
		System.out.println("buscando " + claveBusqueda);
		//aca debo cargar el array con resultados con objetos de la clase del articulo
		//simular que encontramos 3 resultados
		
		//Articulo res1 = new Articulo();
		//Articulo res2 = new Articulo();
		//Articulo res3 = new Articulo();
		
		//instancio nuevamente el array de resultado
		resultado = new Articulo[3];
		
		//resultado[0]=res1;
		//resultado[0]=res2;
		//resultado[0]=res3;
		
		//actualizo la cantidad de resultado
		cantRes = resultado.length;
		
	}
	public void cambiarClave(String nuevaClave) {
		claveBusqueda = nuevaClave;
	}
	
	public int getCantRes() {
		return cantRes;
	} 
	
	public String getClaveBusqueda() {
		if(claveBusqueda == null) {
			return "";
		}
		return claveBusqueda;
	}
}
