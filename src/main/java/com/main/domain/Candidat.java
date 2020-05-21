package com.main.domain;

import java.sql.Date;
import java.time.LocalDate;

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
@Table (name = "candidats")
public class Candidat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCandidat")
	private int idCandidat ;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "candidat", fetch = FetchType.LAZY)
	private Candidature candidature ;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String code ;
	
	@Column(length = 40,name="Nom")
	private String nom ; 
	
	@Column(length = 40,name="Prenom")
	private String prenom ; 
	
	@Column(length = 40)
	private String num ; 
	
	@Column(length = 40,name="Cin")
	private String cin ;
	
	@Column(length = 40,name="DateDeNaissance")
	private LocalDate dateDeNaissance ;
	
	@Column(length = 20,name="Sexe")
	private String sexe ;
	
	@Column(length = 40,name="Mail")
	private String mail ;

	
	
	/*
	 * @ManyToMany(fetch = FetchType.LAZY)
	 * 
	 * @JoinTable( name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
	 * inverseJoinColumns = @JoinColumn(name = "role_id")) private Set<Role> roles =
	 * new HashSet<>();
	 */
	
	
	public Integer getIdCandidat() {
		return idCandidat;
	}

	public void setIdCandidat(Integer idCandidat) {
		this.idCandidat = idCandidat;
	}

	public Candidature getCandidature() {
		return candidature;
	}

	public void setIdCandidature(Candidature candidature) {
		this.candidature = candidature;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public void setIdCandidat(int idCandidat) {
		this.idCandidat = idCandidat;
	}

	public void setCandidature(Candidature candidature) {
		this.candidature = candidature;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Candidat(int idCandidat, Candidature candidature, String code, String nom, String prenom, String num, String cin,
			LocalDate localDate, String sexe, String mail) {
		super();
		this.idCandidat = idCandidat;
		this.candidature = candidature;
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
		this.cin = cin;
		this.dateDeNaissance = localDate;
		this.sexe = sexe;
		this.mail = mail;
	}

	public Candidat() {
		super();
	}


}
