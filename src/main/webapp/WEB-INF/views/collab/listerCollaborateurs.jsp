<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/css/bootstrap.css">
	<title>SGP - App</title>
	</head>
	
	<body>
		<h1 class="text-center jumbotron">Les collaborateurs</h1>
		<div class="container" >
		<div class="row">
		
		
			<%
			List<Collaborateur> listeCollaborateurs = (List<Collaborateur>)request.getAttribute("collaborateurs");
			for (Collaborateur collaborateur : listeCollaborateurs) {
			%>
				<div class="col-sm-3 m-2">
					<div class="card">
						<div class="card-header">
							<b> <%= collaborateur.getNom().toUpperCase()%> <%= collaborateur.getPrenom() %> </b>
						</div>
						<div class="card-body">
							<dl>
							<dd> <img src=<%=collaborateur.getPhoto()%> alt="photo contact par défaut" heigth="200px" width="200px">
							<dt>Email : </dt> 
							<dd><%= collaborateur.getEmailPro() %></dd>
							<dt> Date de Naissance : </dt>  
							<dd><%= collaborateur.getDateDeNaissance() %></dd>
							<dt> Adresse :</dt> 
							<dd><%= collaborateur.getAdresse() %></dd>
							</dl>
						</div>
				</div>
				</div>
			<%
			}
			%>
	
		</div>
		</div>
	</body>

</html>