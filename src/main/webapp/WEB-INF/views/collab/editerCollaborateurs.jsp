<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/css/bootstrap.css">
	<title>SGP - App</title>
	</head>
	
	<body>
		<h1>Nouveau collaborateur</h1>
		<div class="card">
			<div class="card-body">
			
				<form method="post">

			    <div class="form-group">
			        <label for="name">Nom</label>   
			        <input class="form-control " type="text" id="name" name="nom" required>
			    </div>
			    <div class="form-group">
			        <label for="firstname">Prénom</label>   
			        <input class="form-control " type="text" id="firstname" name="prenom" required>
			    </div>
			    <div class="form-group">
			        <label for="birth">Date de naissance</label> 
			        <input class="form-control" type="date" id="birth" name="naissance" required>
			    </div>
			    <div class="form-group">
			        <label for="adress">Adresse</label> 
			        <input class="form-control" type="text" id="adress" name="adresse" required>
			    </div>
			    <div class="form-group">
			        <label for="numero">Numéro de sécurité sociale </label> 
			        <input class="form-control" type="text" id="numero" name="numeroSecu" required placeholder="15 chiffres sont requis" 
			        minlength = "15" maxlength="15">
			    </div>
			    <div class="form-group">
		        	<input type="submit" value="Créer" class="btn-info form-control">
		    	</div>
			</form>
		</div>
		</div>
	</body>

</html>