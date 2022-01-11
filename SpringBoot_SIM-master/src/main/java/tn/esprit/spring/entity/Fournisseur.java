package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Fournisseur")
public class Fournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFournisseur")
	private long idFournisseur;
	private String codeFournisseur;
	private String libelleFournisseur;

	public long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getCodeFournisseur() {
		return codeFournisseur;
	}

	public void setCodeFournisseur(String codeFournisseur) {
		this.codeFournisseur = codeFournisseur;
	}

	public String getLibelleFournisseur() {
		return libelleFournisseur;
	}

	public void setLibelleFournisseur(String libelleFournisseur) {
		this.libelleFournisseur = libelleFournisseur;
	}

	public Fournisseur(long idFournisseur, String codeFournisseur, String libelleFournisseur) {
		super();
		this.idFournisseur = idFournisseur;
		this.codeFournisseur = codeFournisseur;
		this.libelleFournisseur = libelleFournisseur;
	}

	public Fournisseur() {
		super();
	}

}
