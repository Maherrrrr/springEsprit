package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Repository.FactureRepository;
import tn.esprit.spring.entity.Facture;

@Service
public class FactureServiceImpl implements FactureService{
	@Autowired
	FactureRepository factureRepository;

	public List<Facture> retrieveAllFactures() {
		List<Facture> Facture = (List<Facture>) factureRepository.findAll();

		return Facture;
	}

	public Long addFacture(Facture c) {
		factureRepository.save(c);
		return c.getIdFacture();
	}

	public void deleteFacture(Long id) {
		factureRepository.deleteById(id);
	}

	public Long updateFacture(Facture c) {

		factureRepository.save(c);
		return c.getIdFacture();
	}

	public Facture retrieveFacture(Long id) {
		return factureRepository.findById(id).get();
	}

}
