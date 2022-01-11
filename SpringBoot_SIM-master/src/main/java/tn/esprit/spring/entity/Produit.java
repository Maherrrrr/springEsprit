package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Produit")
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduit")
	private long idProduit;
	private String codeProduit;
	private String libelleProduit;
	private float prixUnitaire;
	@ManyToOne
	Rayon rayon;
	@ManyToOne
	Stock stock;
	@OneToOne
	DetailProduit detailProduit;
	@OneToMany(mappedBy = "prodFacture")
	Set<DetailFacture> detailFactures;
	@ManyToMany
	Set<Fournisseur> fournisseurs;

	public Rayon getRayon() {
		return rayon;
	}

	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public DetailProduit getDetailProduit() {
		return detailProduit;
	}

	public void setDetailProduit(DetailProduit detailProduit) {
		this.detailProduit = detailProduit;
	}

	public Set<DetailFacture> getDetailFactures() {
		return detailFactures;
	}

	public void setDetailFactures(Set<DetailFacture> detailFactures) {
		this.detailFactures = detailFactures;
	}

	public Set<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}

	public void setFournisseurs(Set<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}

	public long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}

	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getLibelleProduit() {
		return libelleProduit;
	}

	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Produit(long idProduit, String codeProduit, String libelleProduit, float prixUnitaire) {
		super();
		this.idProduit = idProduit;
		this.codeProduit = codeProduit;
		this.libelleProduit = libelleProduit;
		this.prixUnitaire = prixUnitaire;
	}

	public Produit() {
		super();
	}

}
