/**
 * 
 */
package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class EditerCollaborateurController extends HttpServlet{

	/** serialVersionUID **/
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws 
	ServletException, IOException{
		
		//recupere la valeur d'un paramètre dont le nom est avecPhoto
		String matriculeParam = req.getParameter("matricule");
		if (matriculeParam == null) {
			resp.setStatus(400);
			resp.getWriter().write("Un matricule est attendu");
		} else {
			resp.setStatus(200);
			resp.setContentType("text/html");
		
			//code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("<h1>Edition de collaborateur</h1>"
				+ "Matricule : " + matriculeParam);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws 
	ServletException, IOException{
		
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		
		if (matriculeParam == null || titreParam == null || nomParam == null || prenomParam == null) {
			resp.setStatus(400);
			resp.getWriter().write("Les parametres suivants sont incorrects: ");
			if (matriculeParam == null) {
				resp.getWriter().write("matricule ");
			}
			if (titreParam == null) {
				resp.getWriter().write("titre ");
			}
			if (nomParam == null) {
				resp.getWriter().write("nom ");
			}
			if (prenomParam == null) {
				resp.getWriter().write("prenom ");
			}
		}else {
			resp.setStatus(201);
			//resp.setContentType("text/html");
			resp.getWriter().write("Creation d’un collaborateur avec les informations suivantes : \n"
					//+ "<ul> <li>"
					+ "matricule=" + matriculeParam 
					+ ",titre=" + titreParam 
					+ ",nom=" + nomParam 
					+ ",prenom=" + prenomParam +"."
							//+ "/* </li></ul>"
					);
		}
	}
	
	
	
}
