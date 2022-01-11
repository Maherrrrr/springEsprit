package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Repository.ProduitRepository;
import tn.esprit.spring.Repository.RayonRepository;
import tn.esprit.spring.Repository.StockRepository;
import tn.esprit.spring.entity.CategorieProduit;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.entity.Stock;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	RayonRepository rayonRepository;
	@Autowired
	StockRepository stockRepository;

	public List<Produit> retrieveAllProduits() {
		List<Produit> Produit = (List<Produit>) produitRepository.findAll();

		return Produit;
	}

	public Long addProduit(Produit p,Long idRayon,Long idStock) {
		
			Rayon r =rayonRepository.findById(idRayon).get();
			Stock s =stockRepository.findById(idStock).get();
			p.setStock(s);
			p.setRayon(r);
				
		
		produitRepository.save(p);
		return p.getIdProduit();
	}

	

	

	public Produit retrieveProduit(Long id) {
		return produitRepository.findById(id).get();
	}

}
