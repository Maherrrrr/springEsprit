package tn.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.entity.Facture;

@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {

}
