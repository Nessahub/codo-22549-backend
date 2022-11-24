package ar.com.codoacodo.consola;

public class Vendedor {

	/*
	 * PlayStation
	 * Xbox
	 * SegaGenesis
	 */
	public static Consola[] venderConsolas() {
		
		var xbox360 = new Xbox360();
		
		var play1 = new Play(36, 1);
		var play2 = new Play(128, 2);
		var play3 = new Play(256, 3);
		var play4 = new Play(1024, 4);

		var sega = new SegaGenesis();
		
		return new Consola[] {xbox360,play1,play2,play3,play4,sega};
	}
}
