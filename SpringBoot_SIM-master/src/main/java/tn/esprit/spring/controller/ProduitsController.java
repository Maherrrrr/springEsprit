package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.CategorieProduit;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.service.ProduitService;

@RestController
@RequestMapping("Produit/")
public class ProduitsController {

	@Autowired
	ProduitService produitService;

	@GetMapping("produitList")
	@ResponseBody
	public List<Produit> getProduit() {

		List<Produit> produit = produitService.retrieveAllProduits();
		return produit;
	}


	@PostMapping("/addProduit")
	@ResponseBody
	public Long addProduit(@RequestBody Produit p,Long idRayon,Long idStock) {
		return produitService.addProduit(p, idRayon, idStock);
	}

	

}
