package ar.com.codoacodo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/SearchArticuloController")
public class SearchArticuloController extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		
				String claveBusqueda = req.getParameter("claveBusqueda"); 
			
				
				IArticuloDAO dao = new ArticuloDAOMysqlImpl();
				
				List<Articulo> articulosBuscado = new ArrayList<>();
				try {
					articulosBuscado = dao.search(claveBusqueda);		
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				//guardo bajo el nombre productos una lista de articulos
				req.setAttribute("productos", articulosBuscado);
				
				//redirect a otra pagina u otro servlet(Controller/WebServlet)
				getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);

				try {
					dao.search(claveBusqueda);
					System.out.println("Se dió de alta el articulo");
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				//redirect a otra pagina u otro servlet(Controller/WebServlet)
				getServletContext().getRequestDispatcher("/FindAllArticulosController").forward(req, resp);
				
	}

}