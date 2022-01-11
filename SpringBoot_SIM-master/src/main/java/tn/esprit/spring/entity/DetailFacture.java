package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "DetailFacture")
public class DetailFacture implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DetailFacture")
	private Long idDetailFacture;
	private Integer qte;
	private float prixTotal;
	private Integer pourcentageRemise;
	private Integer montantRemise;
	@ManyToOne
	Produit prodFacture;
	@ManyToOne
	Facture facture;

	public Produit getProdFacture() {
		return prodFacture;
	}

	public void setProdFacture(Produit prodFacture) {
		this.prodFacture = prodFacture;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Long getIdDetailFacture() {
		return idDetailFacture;
	}

	public void setIdDetailFacture(Long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}

	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Integer getPourcentageRemise() {
		return pourcentageRemise;
	}

	public void setPourcentageRemise(Integer pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}

	public Integer getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(Integer montantRemise) {
		this.montantRemise = montantRemise;
	}

	public DetailFacture(Long idDetailFacture, Integer qte, float prixTotal, Integer pourcentageRemise,
			Integer montantRemise) {
		super();
		this.idDetailFacture = idDetailFacture;
		this.qte = qte;
		this.prixTotal = prixTotal;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
	}

	public DetailFacture() {
		super();
	}

}
