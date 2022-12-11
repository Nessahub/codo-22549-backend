package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;
import ar.com.codoacodo.herencia.interfaces.IJugable;
// siempre va primero el "extends" y despues el "implements"
//se puede heredar de una clase / y se puede implementar de varias interfaces
public class Play extends Consola implements IActualizable, IJugable{

	private Integer version;
	
	public Play(Integer bit, Integer version) {
		super("PlayStation", bit, "Sony");
		this.version = version;
	}

	public Integer getVersion() {
		return version;
	}

	
	public String toString() {
		String toStringDePadre = super.toString();
		String toStringDeHijo = "Play [version=" + version + "]";
		return toStringDePadre + toStringDeHijo;
	}

	public void actualizar() {
		System.out.println("actualiznado play " + this.version);
		System.out.println("conectando al servidor de sony");
		System.out.println("descargando nuevo software");
	}

	public void jugar() {
		System.out.println("Encendiendo Play" + this.version);
		System.out.println("Cargando juegos del HD");
		System.out.println("Todo listo seleccione juego");
		
	}
	
}
