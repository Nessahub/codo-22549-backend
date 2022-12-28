<!-- codigo estatico -->
<!Doctype html>
<html lang ="es">
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	</head>
	<body>
		<!-- navbar -->
		<jsp:include page="navbar.jsp"/>
		
		<!-- formulario de alta-->
	<main class="container">
	<h1>Nuevo Producto</h1>
		<div class="row">
		<div class="col-12 mt-12">
		<form class="row g-3 needs-validation" novalidate
		action="<%=request.getContentType()%>/CreateArticuloController" 
		method="post">
  			<div class="col-md-4">
    			<label for="validationCustom01" class="form-label">
    			C&oacute;digo
    			</label>
    			<input 
    			name="titulo"
    			type="text" 
    			class="form-control" 
    			id="validationCustom01" 
    			value="" 
    			required>
    		<div class="valid-feedback">
     		 Looks good!
    	  </div>
  		</div>
  			<div class="col-md-4">
   				 <label for="validationCustom02" class="form-label">
   				 Autor
   				 </label>
    			<input 
    			name="autor"
    			type="text" 
    			class="form-control" 
    			id="validationCustom02" 
    			value="" 
    			required>
    		<div class="valid-feedback">
     		 Looks good!
    	  </div>
  		</div>
  			<div class="col-md-4">
    			<label for="validationCustomUsername" class="form-label">
    			Precio
    			</label>
    		<div class="input-group has-validation">
      			<input 
      			name="precio"
      			type="number" 
      			class="form-control" 
      			id="validationCustomUsername" 
      			aria-describedby="inputGroupPrepend" 
      			required>
      		<div class="invalid-feedback">
        		Please choose a username.
      	  </div>
    	</div> 
  	  </div>
  			<div class="col-md-6">
    			<label for="validationCustom03" class="form-label">
    			Im&aacute;gen
    			</label>
    			<input 
    			name="imagen"
    			type="file" 
    			class="form-control" 
    			id="validationCustom03" 
    			required>
    		<div class="invalid-feedback">
      			Please provide a valid city.
    	  </div>
  	  </div>
  			<div class="col-md-3">
    			<label for="validationCustom04" class="form-label">Categoría</label>
    			<select class="form-select" id="validationCustom04" required>
      				<option selected disabled value="">Elegir</option>
      				<option>Libro</option>
      				<option>Dvd</option>
      				<option>Cd Musical</option>
      				<option>Otro</option>
    			</select>
    		<div class="invalid-feedback">
      			Por favor, elige una de las opciones sugeridas.
    	  </div>
  	  </div>
  			<div class="col-md-3">
  		  		<label for="validationCustom05" class="form-label">Observación</label>
    			<input type="text" class="form-control" id="validationCustom05" required>
    		
  	  </div>
  			<div class="col-12">
    		<div class="form-check">
      			<input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
      			<label class="form-check-label" for="invalidCheck">
        		He revisado los datos ingresados que sean válidos.
      			</label>
      		<div class="invalid-feedback">
        		Marca la opción de verificación de datos ingresados.
      	  </div>
    	</div>
  	  </div>
  			<div class="col-12">
    			<button class="btn btn-primary" type="submit">Cargar nuevo</button>
  		  </div>
		 </form>
	  	</div>
	  </div>
	</main>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	</body>
</html>