package ar.com.codoacodo.consola;

public class Play extends Consola{

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


	
	
}
