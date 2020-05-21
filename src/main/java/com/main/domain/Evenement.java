package com.main.domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity 
@Table (name = "evenements")
public class Evenement {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEvenement ;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "evenement", fetch = FetchType.LAZY)
	private Tirage tirage ; 
	
	@Column(length = 30,name="Nom")
	private String nom ; 
	
	@Column(length = 30,name="Heure")
	private double heure ;
	
	@Column(length = 30,name="DateEvenement")
	private Date dateEvenement ;
	
	


	public Integer getIdEvenement() {
		return idEvenement;
	}


	public void setIdEvenement(Integer idEvenement) {
		this.idEvenement = idEvenement;
	}


	public Tirage getIdTirage() {
		return tirage;
	}


	public void setIdTirage(Tirage tirage) {
		this.tirage = tirage;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getHeure() {
		return heure;
	}


	public void setHeure(double heure) {
		this.heure = heure;
	}


	public Date getDateEvenement() {
		return dateEvenement;
	}


	public void setDateEvenement(Date dateEvenement) {
		this.dateEvenement = dateEvenement;
	}


	public Evenement(int idEvenement, Tirage tirage, String nom, double heure, Date dateEvenement) {
		super();
		this.idEvenement = idEvenement;
		this.tirage = tirage;
		this.nom = nom;
		this.heure = heure;
		this.dateEvenement = dateEvenement;
	}


	public Evenement() {
		super();
	}
	

}
