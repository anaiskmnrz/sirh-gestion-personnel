/**
 * 
 */
package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class EditerCollaborateurController extends HttpServlet{

	/** serialVersionUID **/
	private static final long serialVersionUID = 1L;

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws 
	ServletException, IOException{
		
		req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateurs.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws 
	ServletException, IOException{
		
		//sinon l'utf-8 ne fonctionne pas
		req.setCharacterEncoding("UTF-8");
		
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String adresse = req.getParameter("adresse");
		String dateNaissance = req.getParameter("naissance"); 
		String numSecu = req.getParameter("numeroSecu");
		
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		  //convert String to LocalDate
		 
		  LocalDate date = LocalDate.parse(dateNaissance, formatter);
		  
		  
		
		Collaborateur collaborateur = new Collaborateur(nom, prenom, date, adresse, numSecu);
		collabService.sauvegarderCollaborateur(collaborateur);
		
		resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");
		
	}
	
	
	
}
