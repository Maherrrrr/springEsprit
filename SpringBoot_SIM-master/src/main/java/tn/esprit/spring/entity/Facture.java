package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Facture")
public class Facture implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFacture")
	private long idFacture;
	private float montantRemise;
	private float montantFacture;
	@OneToMany(mappedBy = "facture")
	Set<DetailFacture> detailFact ;
	@ManyToOne
	Client client;
	
	
	DetailFacture detailFacture;
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	private boolean active;

	public long getIdFacture() {
		return idFacture;
	}

	public Set<DetailFacture> getDetailFact() {
		return detailFact;
	}

	public void setDetailFact(Set<DetailFacture> detailFact) {
		this.detailFact = detailFact;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public DetailFacture getDetailFacture() {
		return detailFacture;
	}

	public void setDetailFacture(DetailFacture detailFacture) {
		this.detailFacture = detailFacture;
	}

	public void setIdFacture(long idFacture) {
		this.idFacture = idFacture;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	public float getMontantFacture() {
		return montantFacture;
	}

	public void setMontantFacture(float montantFacture) {
		this.montantFacture = montantFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Facture(long idFacture, float montantRemise, float montantFacture, Date dateFacture, boolean active) {
		super();
		this.idFacture = idFacture;
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateFacture = dateFacture;
		this.active = active;
	}

	public Facture() {
		super();
	}

}
