package ar.com.codoacodo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("FindAllArticulosController")
public class FindAllArticulosController extends HttpServlet{
	
	//http://localhost:8080/FindAllArticulosController -> ingresa a la direccion web
	//Controlador web
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		try {
		List<Articulo> articulosBuscado = dao.findAll();
		
		System.out.println(articulosBuscado);
		}catch(Exception e) {
			e.printStackTrace();
		}
		super.doGet(req, resp);
	}

	
	// aca aplicacion de consola
	public static void main(String[] args) throws Exception {
		
		//obtner todos los articulo
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		List<Articulo> articulosBuscado = dao.findAll();
		
		System.out.println(articulosBuscado);
	}

}