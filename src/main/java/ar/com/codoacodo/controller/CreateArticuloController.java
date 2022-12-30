package ar.com.codoacodo.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.controller.validators.CreateProductoValidator;
import ar.com.codoacodo.controller.validators.IValidable;
import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/CreateArticuloController")
public class CreateArticuloController extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//crear un articulo
		//recibimos los parametros enviados por un formularios
		
		CreateArticuloRequest createRequest = new CreateArticuloRequest(req);
		IValidable validator = new CreateProductoValidator(createRequest);
		List<String> errors = validator.validate();
		
		//verifico si hay errores
		if(!errors.isEmpty()){
			//volver a nuevo.jsp con la lista de errores
			//guardo la lista con el request 
			req.setAttribute("errors", errors);
			//redirect a otra pagina u otro servlet(Controller/WebServlet)
			getServletContext().getRequestDispatcher("/nuevo.jsp").forward(req, resp);
			return;
		}

		//instanciomos nuestro objeto
		var articulo = new Articulo(createRequest.getImg(), createRequest.getTitulo(), createRequest.getAutor(), createRequest.getPrecio());
		
		//hacemos uso del dao
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		//control de errores se vera con detalle en el curso de spring
		try {
			dao.create(articulo);
		} catch (Exception e) {
			e.printStackTrace();			
		}
		
		//redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/FindAllArticulosController").forward(req, resp);
		
	}
}