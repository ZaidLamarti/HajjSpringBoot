package com.main.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table (name = "candidats")
public class Candidat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCandidat ;
	
	
	private int idCandidature ;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String code ;
	
	@Column(length = 40)
	private String nom ; 
	
	@Column(length = 40)
	private String prenom ; 
	
	@Column(length = 40)
	private String num ; 
	
	@Column(length = 40)
	private String cin ;
	
	@Column(length = 40)
	private Date dateDeNaissance ;
	
	@Column(length = 20)
	private String sexe ;
	
	@Column(length = 40)
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

	public int getIdCandidature() {
		return idCandidature;
	}

	public void setIdCandidature(int idCandidature) {
		this.idCandidature = idCandidature;
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

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
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

	public Candidat(int idCandidat, int idCandidature, String code, String nom, String prenom, String num, String cin,
			Date dateDeNaissance, String sexe, String mail) {
		super();
		this.idCandidat = idCandidat;
		this.idCandidature = idCandidature;
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
		this.cin = cin;
		this.dateDeNaissance = dateDeNaissance;
		this.sexe = sexe;
		this.mail = mail;
	}

	public Candidat() {
		super();
	}


}
