package com.main.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "utilisateurs")
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idUtilisateur ;
	
	
	private String nom ;
	
	
	private String prenom ; 
	
	
	private String login ;
	
	
	private String password ;
	
	
	private String statut ;
	
	
	private boolean etatInscription ;
	
	
	


	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public boolean isEtatInscription() {
		return etatInscription;
	}


	public void setEtatInscription(boolean etatInscription) {
		this.etatInscription = etatInscription;
	}


	public Utilisateur(int idUtilisateur, String nom, String prenom, String login, String password, String statut,
			boolean etatInscription) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.statut = statut;
		this.etatInscription = etatInscription;
	}


	public Utilisateur() {
		super();
	}
	
	
	

}
