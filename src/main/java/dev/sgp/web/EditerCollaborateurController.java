/**
 * 
 */
package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
		
		if (nom == null || prenom == null || adresse == null || dateNaissance == null || numSecu == null) {
			resp.setStatus(400);
			req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateurs.jsp").forward(req, resp);
		} else {
			resp.setStatus(200);
		}
		
		LocalDate date = null;
		try {
			// convert string to LocalDate
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			date = LocalDate.parse(dateNaissance, formatter);
			resp.setStatus(200);
		} catch (DateTimeParseException e) {
			resp.setStatus(400);
			req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateurs.jsp").forward(req, resp);
		}
		
		if(numSecu.length()!=15) {
			resp.setStatus(400);
			req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateurs.jsp").forward(req, resp);
		} else {
			resp.setStatus(200);
		}
		
		if (resp.getStatus()== 200) {
		Collaborateur collaborateur = new Collaborateur(nom, prenom, date, adresse, numSecu);
		collabService.sauvegarderCollaborateur(collaborateur);
		
		resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");}
		
	}
	
	
	
}
