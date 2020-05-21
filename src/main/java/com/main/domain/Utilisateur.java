package com.main.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name = "utilisateurs")
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idUtilisateur")
	private Integer idUtilisateur ;
	
	@Column(name="Nom")
	private String nom ;
	
	@Column(name="Prenom")
	private String prenom ; 
	
	@Column(name="Login")
	private String login ;
	
	@Column(name="Password")
	private String password ;
	
	@Column(name="Statut")
	private String statut ;
	
	@Column(name="EtatInscription")
	private boolean etatInscription ;
	
	
	@OneToMany(mappedBy= "utilisateur")
	@Column(name="idTirage")
	private Set<Tirage> tirages ; 
	


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


	public Utilisateur(Integer idUtilisateur, String nom, String prenom, String login, String password, String statut,
			boolean etatInscription, Set<Tirage> tirages) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.statut = statut;
		this.etatInscription = etatInscription;
		this.tirages = tirages;
	}


	public Utilisateur() {
		super();
	}


	
	
	
	

}
