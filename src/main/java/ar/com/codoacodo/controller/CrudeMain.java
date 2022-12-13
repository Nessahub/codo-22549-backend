package ar.com.codoacodo.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import ar.com.codoacodo.domain.Articulo;

public class CrudeMain {

	public static void main(String[] args) {
		
		//investigar Scanner para leer datos del teclado
		
		
		boolean ok = false;
		
		do {
			Scanner teclado = new  Scanner(System.in);
			System.out.println("Selecione un opcion \n\n" 
					+ "1-Alta "
					+ "2-Baja "
					+ "3-Modif "
					+ "4-Buscar por id "
					+ "5-Salir");
			
			try {
				//leer la opcion del telcado
				int a = teclado.nextInt();
				ok = true;
				
			}catch (InputMismatchException e ) {
				System.out.println("Opcion invalida, vuelve a intentarlo \n");
			}
			
		}while(!ok);
		
	/*	//op es una opcion valida 
	 * 
	 * String opElegida = "";
	 * 
		switch (a) {
		case 1:
			//leer los datos del articulo
			 * 
			 * opElegida = "Alta de articulo";
			 * dao.create(articulo);
			break;
			
		case 2:
			//pedir id para dar de baja
			 * 
			 * opElegida = "Baja de Articulo"; 
			 * dao.delete(Long id);
			break;
			
		case 3:
			//modificar un articulo
			 * 
			 * opElegida = "Modifica un articulo";
			 * dao.update(articulo);
			break;
		
		case 4:
			// Buscar por id
			 * 
			 * opElegida = "Buscar un Articulo";
			 * dao.getById(Long id);
			break;
			
		case 5:// Salir del menu
		
				opElegida = "Salir del menu"
				System.out.println("

		default:
			opElegida = "Invalida, ingresa otra opcion." 
			break;
		}
		System.out.println("Ingrese id de articulo");
		Long id = teclado.nextLong();
		
		System.out.println("id es "+ id);
		
		teclado.close();

		*/
	}

}