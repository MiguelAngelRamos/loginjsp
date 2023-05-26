<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
	<title>Welcome</title>
</head>
<body>
	<div class="container">
		<!-- Codigo del Formulario Login -->
		 <div class="row mt-5">
		    <div class="col-4 offset-4">
		      <form action="Auth" method="post" >
		        <div class="mb-3">
		          <label for="exampleInputEmail1" class="form-label">Usuario</label>
		          <input
		            type="text"
		            class="form-control"
		            id="exampleInputEmail1"
		        	name="usuario"
		        	required
		          />
		        </div>
		
		        <div class="mb-3">
		          <label for="exampleInputPassword1" class="form-label">Ingrese su contraseña</label>
		          <input
		            type="password"
		            class="form-control"
		            id="exampleInputPassword1"
		            name="password"
		            required
		          />
		    
		        </div>
		        <div class="d-grid gap-2">
		          <button type="submit" class="btn btn-success">Acceder</button>
		        </div>
		      </form>
		
		    </div>
		  </div>
		<!-- Fin Codigo del Formulario Login -->
	</div>
</body>
</html>