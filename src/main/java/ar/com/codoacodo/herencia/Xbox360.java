package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;

public class Xbox360 extends Consola implements IActualizable{

	//escrbo explicitamente el constructor de xbox 360
	//PERO debo enviarle al padre (Consola) los 3 parametros que pide
	public Xbox360() {
		//la primer linea de un constructor de una clase hija:
		//es invocar al constructor del padre, con los parametros que requiere
		
		super("Xbox360",1024,"Microsoft");
		
	}
	public void actualizar() {
		System.out.println("conectando xbox al servidor de microsoft...");
		System.out.println("descargando nuevo firmware..");
		System.out.println("finalizando actualización.");
	}
	
	
}
