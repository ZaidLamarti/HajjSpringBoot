package com.hajj.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "evenement")

public class Evenement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	
	/*
	 * @ManyToMany(fetch = FetchType.LAZY)
	 * 
	 * @JoinTable( name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
	 * inverseJoinColumns = @JoinColumn(name = "role_id")) private Set<Role> roles =
	 * new HashSet<>();
	 */
	
	@Column(length = 40)
	private String nom ;
	
	private double heure ;
	
	@Temporal(TemporalType.DATE)
	private Date date ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
