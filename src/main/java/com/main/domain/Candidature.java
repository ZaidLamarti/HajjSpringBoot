package com.main.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table (name = "candidatures")
public class Candidature {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCandidature")
	private int idCandidature ;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCandidat")
	private Candidat candidat ; 
	
	@ManyToOne
	@JoinColumn(name="idTirage")
	private Tirage tirage ; 
	
	@Column(name="Type")
	private String type ; 
	
	@Column(name="Annee")
	private int annee ;


	public Integer getIdCandidature() {
		return idCandidature;
	}


	public void setIdCandidature(Integer idCandidature) {
		this.idCandidature = idCandidature;
	}


	public Candidat getCandidat() {
		return candidat;
	}


	public void setIdCandidat(Candidat candidat) {
		this.candidat = candidat;
	}


	


	public Tirage getTirage() {
		return tirage;
	}


	public void setTirage(Tirage tirage) {
		this.tirage = tirage;
	}


	public void setIdCandidature(int idCandidature) {
		this.idCandidature = idCandidature;
	}


	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getAnnee() {
		return annee;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}



	public Candidature(int idCandidature, Candidat candidat, Tirage tirage, String type, int annee) {
		super();
		this.idCandidature = idCandidature;
		this.candidat = candidat;
		this.tirage = tirage;
		this.type = type;
		this.annee = annee;
	}


	public Candidature() {
		super();
	} 
	
	
}
