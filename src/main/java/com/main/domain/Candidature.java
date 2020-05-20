package com.main.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "candidatures")
public class Candidature {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCandidature ;
	
	
	private Integer idCandidat ; 
	
	
	private int idTirage ; 
	
	
	private String type ; 
	
	
	private int annee ;


	public Integer getIdCandidature() {
		return idCandidature;
	}


	public void setIdCandidature(Integer idCandidature) {
		this.idCandidature = idCandidature;
	}


	public int getIdCandidat() {
		return idCandidat;
	}


	public void setIdCandidat(int idCandidat) {
		this.idCandidat = idCandidat;
	}


	public int getIdTirage() {
		return idTirage;
	}


	public void setIdTirage(int idTirage) {
		this.idTirage = idTirage;
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


	public Candidature(int idCandidature, int idCandidat, int idTirage, String type, int annee) {
		super();
		this.idCandidature = idCandidature;
		this.idCandidat = idCandidat;
		this.idTirage = idTirage;
		this.type = type;
		this.annee = annee;
	}


	public Candidature() {
		super();
	} 
	
	
}
