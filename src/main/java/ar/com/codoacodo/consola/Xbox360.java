package ar.com.codoacodo.consola;

public class Xbox360 extends Consola{

	//escrbo explicitamente el constructor de xbox 360
	//PERO debo enviarle al padre (Consola) los 3 parametros que pide
	public Xbox360() {
		//la primer linea de un constructor de una clase hija:
		//es invocar al constructor del padre, con los parametros que requiere
		
		super("Xbox360",1024,"Microsoft");
		
	}
	
	
}
