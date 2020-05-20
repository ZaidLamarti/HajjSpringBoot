package com.main.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity 
@Table (name = "evenements")
public class Evenement {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEvenement ;
	
	
	private int idTirage ; 
	
	@Column(length = 30)
	private String nom ; 
	
	@Column(length = 30)
	private double heure ;
	
	@Column(length = 30)
	private Date dateEvenement ;
	
	


	public Integer getIdEvenement() {
		return idEvenement;
	}


	public void setIdEvenement(Integer idEvenement) {
		this.idEvenement = idEvenement;
	}


	public int getIdTirage() {
		return idTirage;
	}


	public void setIdTirage(int idTirage) {
		this.idTirage = idTirage;
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


	public Evenement(int idEvenement, int idTirage, String nom, double heure, Date dateEvenement) {
		super();
		this.idEvenement = idEvenement;
		this.idTirage = idTirage;
		this.nom = nom;
		this.heure = heure;
		this.dateEvenement = dateEvenement;
	}


	public Evenement() {
		super();
	}
	

}
