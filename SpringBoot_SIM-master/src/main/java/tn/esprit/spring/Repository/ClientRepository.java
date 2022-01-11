package tn.esprit.spring.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Profession;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

	//Select
	@Query("SELECT c FROM Client c WHERE c.profession= ?1")
	List<Client> retrieveClientsByProfession(Profession profession);

	//delete
	@Modifying
	@Query("DELETE FROM Client c WHERE c.categorieClient= :categorie AND c.profession = :profession")
	int deleteClientByCategorieClientAndProfession(@Param("categorie") CategorieClient categorieClient,
			@Param("profession") Profession profession);
//Update
	@Modifying
	@Query("update Client c set c.categorieClient = :categorie where c.profession =	:profession")
	int updateClientCategorieByProfession(@Param("categorie") CategorieClient categorieClient,
			@Param("profession") Profession profession);
	
	
	//requeete besh ne7seboo chiffre d affaire selon cat tee3 client bin date mo3aynaa t3aytelhaa ba3d  f package service
	@Query("SELECT sum(f.montantFacture) FROM Facture f where f.client.categorieClient=:categorieClient and f.dateFacture between : startDate and :endDate and f.active=true")
	public float getChiffreAffaireParCategorieClient(@Param("categorieClient") CategorieClient categorieClient, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

	
	
}
