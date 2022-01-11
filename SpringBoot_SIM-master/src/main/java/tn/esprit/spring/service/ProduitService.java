package tn.esprit.spring.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.CategorieProduit;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Produit;

public interface ProduitService {

	public List<Produit> retrieveAllProduits();
	public Long addProduit(Produit p,Long idRayon,Long idStock) ;
	public Produit retrieveProduit(Long id);
	
}