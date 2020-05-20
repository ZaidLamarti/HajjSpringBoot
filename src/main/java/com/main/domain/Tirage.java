package com.main.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table (name = "tirages")
public class Tirage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTirage ; 
	
	
	private int idUtilisateur ;
	
	
	private int idCandidature ;
	
	
	private int idCanditatureChoisi ;
	
	
	private int idCandidatureAttente ; 
	
	
	private int nbrRetenir ; 
	
	
	private int nbrAttente ;
	
	@Column(length = 50)
	private String lieu ;
	
	@Column(length = 40)
	private boolean etat ;


	public Integer getIdTirage() {
		return idTirage;
	}


	public void setIdTirage(Integer idTirage) {
		this.idTirage = idTirage;
	}


	public int getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public int getIdCandidature() {
		return idCandidature;
	}


	public void setIdCandidature(int idCandidature) {
		this.idCandidature = idCandidature;
	}


	public int getIdCanditatureChoisi() {
		return idCanditatureChoisi;
	}


	public void setIdCanditatureChoisi(int idCanditatureChoisi) {
		this.idCanditatureChoisi = idCanditatureChoisi;
	}


	public int getIdCandidatureAttente() {
		return idCandidatureAttente;
	}


	public void setIdCandidatureAttente(int idCandidatureAttente) {
		this.idCandidatureAttente = idCandidatureAttente;
	}


	public int getNbrRetenir() {
		return nbrRetenir;
	}


	public void setNbrRetenir(int nbrRetenir) {
		this.nbrRetenir = nbrRetenir;
	}


	public int getNbrAttente() {
		return nbrAttente;
	}


	public void setNbrAttente(int nbrAttente) {
		this.nbrAttente = nbrAttente;
	}


	public String getLieu() {
		return lieu;
	}


	public void setLieu(String lieu) {
		this.lieu = lieu;
	}


	public boolean isEtat() {
		return etat;
	}


	public void setEtat(boolean etat) {
		this.etat = etat;
	}


	public Tirage(int idTirage, int idUtilisateur, int idCandidature, int idCanditatureChoisi, int idCandidatureAttente,
			int nbrRetenir, int nbrAttente, String lieu, boolean etat) {
		super();
		this.idTirage = idTirage;
		this.idUtilisateur = idUtilisateur;
		this.idCandidature = idCandidature;
		this.idCanditatureChoisi = idCanditatureChoisi;
		this.idCandidatureAttente = idCandidatureAttente;
		this.nbrRetenir = nbrRetenir;
		this.nbrAttente = nbrAttente;
		this.lieu = lieu;
		this.etat = etat;
	}


	public Tirage() {
		super();
	}
	
	
	
	
	
	
}
