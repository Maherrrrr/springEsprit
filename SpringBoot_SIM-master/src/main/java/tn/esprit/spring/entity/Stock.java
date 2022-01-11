package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Stock")
public class Stock implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idStock")
	private Long idStock;
	private Integer qteStock;
	private Integer qteMin;
	private String libelleStock;

	@OneToMany(mappedBy = "stock")
	Set<Produit> produitStock;

	
	public Set<Produit> getProduitStock() {
		return produitStock;
	}

	public void setProduitStock(Set<Produit> produitStock) {
		this.produitStock = produitStock;
	}

	public Long getIdStock() {
		return idStock;
	}

	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	public Integer getQteStock() {
		return qteStock;
	}

	public void setQteStock(Integer qteStock) {
		this.qteStock = qteStock;
	}

	public Integer getQteMin() {
		return qteMin;
	}

	public void setQteMin(Integer qteMin) {
		this.qteMin = qteMin;
	}

	public String getLibelleStock() {
		return libelleStock;
	}

	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}

	public Stock(Long idStock, Integer qteStock, Integer qteMin, String libelleStock) {
		super();
		this.idStock = idStock;
		this.qteStock = qteStock;
		this.qteMin = qteMin;
		this.libelleStock = libelleStock;
	}

	public Stock() {
		super();
	}

}
