package com.hajj.domain;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur")

public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	
	@Column(length = 30)
	private String nom ;
	
	@Column(length = 30)
	private String prenom ;
	
	@Column(length = 30 , unique=true)
	private String login ;
	
	@Column(length = 30)
	private String password ;
	
	private String statut ;
	
	public static boolean etatInscription = false ;

	public Integer getIdUtilisateur() {
		return id;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.id = idUtilisateur;
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

	public static boolean isEtatInscription() {
		return etatInscription;
	}

	public static void setEtatInscription(boolean etatInscription) {
		Utilisateur.etatInscription = etatInscription;
	}

}