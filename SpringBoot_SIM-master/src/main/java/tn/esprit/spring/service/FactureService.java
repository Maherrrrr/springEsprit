package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Facture;

public interface FactureService {

	public List<Facture> retrieveAllFactures();
	public Long addFacture(Facture c);
	public void deleteFacture(Long id);
	public Long updateFacture(Facture c);
	public Facture retrieveFacture(Long id);
}
