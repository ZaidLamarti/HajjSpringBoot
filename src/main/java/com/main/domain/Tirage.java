package com.main.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity 
@Table (name = "tirages")
public class Tirage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTirage ; 

	@ManyToOne
	@JoinColumn(name="idUtilisateur")
	private Utilisateur utilisateur ;
	
	@OneToMany(mappedBy="tirage")
	@Column(name="Candidatures")
	private Set<Candidature> candidatures ;
	
	@OneToMany(mappedBy="tirage")
	@Column(name="CandidaturesChoisi")
	private Set<Candidature> idCanditatureChoisi ;
	
	@OneToMany(mappedBy="tirage")
	@Column(name="CandidaturesAttente")
	private Set<Candidature> idCandidatureAttente ; 
	
	@Column(name="NombreRetenir")
	private int nbrRetenir ; 
	
	@Column(name="NombreAttente")
	private int nbrAttente ;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idEvenement")
	private Evenement evenement ;
	
	@Column(length = 50,name="Lieu")
	private String lieu ;
	
	@Column(length = 40,name="Etat")
	private boolean etat ;


	public Integer getIdTirage() {
		return idTirage;
	}


	public void setIdTirage(Integer idTirage) {
		this.idTirage = idTirage;
	}



	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	public Set<Candidature> getCandidatures() {
		return candidatures;
	}


	public void setCandidatures(Set<Candidature> candidatures) {
		this.candidatures = candidatures;
	}


	public Evenement getEvenement() {
		return evenement;
	}


	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}


	


	public Set<Candidature> getIdCanditatureChoisi() {
		return idCanditatureChoisi;
	}


	public void setIdCanditatureChoisi(Set<Candidature> idCanditatureChoisi) {
		this.idCanditatureChoisi = idCanditatureChoisi;
	}


	public Set<Candidature> getIdCandidatureAttente() {
		return idCandidatureAttente;
	}


	public void setIdCandidatureAttente(Set<Candidature> idCandidatureAttente) {
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

	


	public Tirage(Integer idTirage, Utilisateur utilisateur, Set<Candidature> candidatures,
			Set<Candidature> idCanditatureChoisi, Set<Candidature> idCandidatureAttente, int nbrRetenir, int nbrAttente,
			Evenement evenement, String lieu, boolean etat) {
		super();
		this.idTirage = idTirage;
		this.utilisateur = utilisateur;
		this.candidatures = candidatures;
		this.idCanditatureChoisi = idCanditatureChoisi;
		this.idCandidatureAttente = idCandidatureAttente;
		this.nbrRetenir = nbrRetenir;
		this.nbrAttente = nbrAttente;
		this.evenement = evenement;
		this.lieu = lieu;
		this.etat = etat;
	}


	public Tirage() {
		super();
	}
	
	
	
	
	
	
}
