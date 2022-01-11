package tn.esprit.spring.entity;

import javax.persistence.Column;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Rayon")
public class Rayon implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRayon")
	private long idRayon;
	private String codeRayon;
	private String libelleRayon;

	@OneToMany(mappedBy = "rayon")
	Set<Produit> produits;

	public long getIdRayon() {
		return idRayon;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

	public void setIdRayon(long idRayon) {
		this.idRayon = idRayon;
	}

	public String getCodeRayon() {
		return codeRayon;
	}

	public void setCodeRayon(String codeRayon) {
		this.codeRayon = codeRayon;
	}

	public String getLibelleRayon() {
		return libelleRayon;
	}

	public void setLibelleRayon(String libelleRayon) {
		this.libelleRayon = libelleRayon;
	}

	public Rayon(long idRayon, String codeRayon, String libelleRayon) {
		super();
		this.idRayon = idRayon;
		this.codeRayon = codeRayon;
		this.libelleRayon = libelleRayon;
	}

	public Rayon() {
		super();
	}

}
