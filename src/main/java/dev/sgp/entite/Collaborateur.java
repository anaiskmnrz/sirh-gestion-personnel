/**
 * 
 */
package dev.sgp.entite;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/** Représentation d'un collaborateur
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Collaborateur {

	
	
	private String matricule;
	private String nom;
	private String prenom; 
	private LocalDate dateDeNaissance;
	private String adresse;
	private String numeroSecu;
	private String emailPro;
	private ZonedDateTime dateHeureCreation;
	private String photo;
	private Boolean actif;
	
	/** Constructeur
	 *
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param adresse
	 * @param numeroSecu
	 */
	public Collaborateur(String nom, String prenom, LocalDate dateDeNaissance, String adresse, String numeroSecu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numeroSecu = numeroSecu;
		this.matricule = nom + prenom;
		this.emailPro = prenom + "." + nom + "@societe.com";
		this.dateHeureCreation = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		this.photo = "../images/photo.png";
		this.actif = true;
	}

	
	/** Getter
	 *
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/** Setter
	 *
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/** Getter
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/** Setter
	 *
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/** Getter
	 *
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	/** Setter
	 *
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	/** Getter
	 *
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/** Setter
	 *
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/** Getter
	 *
	 * @return the numeroSecu
	 */
	public String getNumeroSecu() {
		return numeroSecu;
	}
	/** Setter
	 *
	 * @param numeroSecu the numeroSecu to set
	 */
	public void setNumeroSecu(String numeroSecu) {
		this.numeroSecu = numeroSecu;
	}
	/** Getter
	 *
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}
	/** Setter
	 *
	 * @param emailPro the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	/** Getter
	 *
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/** Setter
	 *
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/** Getter
	 *
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}
	/** Setter
	 *
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}


	/** Getter
	 *
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}


	/** Setter
	 *
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

}
