package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.service.FactureService;

@RestController
@RequestMapping("Facture")
public class FactureController {

	@Autowired
	FactureService factureService;

	@GetMapping("factureList")
	@ResponseBody
	public List<Facture> getFacture() {

		List<Facture> facture = factureService.retrieveAllFactures();
		return facture;
	}

	@GetMapping("factureList/{id}")
	@ResponseBody
	public Facture getFactureById(@PathVariable("id") Long id) {
		return factureService.retrieveFacture(id);
	}

	@PostMapping("/addFacture")
	@ResponseBody
	public Long addFacture(@RequestBody Facture c) {
		return factureService.addFacture(c);
	}

	/*@DeleteMapping("/deleteFacture/{id}")
	@ResponseBody
	public void deleteFacture(@PathVariable("id") String id) {
		factureService.deleteFacture(id);
	}*/

	@PutMapping("/updateFacture")
	@ResponseBody
	public Long updateFacture(@RequestBody Facture c) {
		return factureService.updateFacture(c);
	}

}
