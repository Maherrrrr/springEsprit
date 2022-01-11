package tn.esprit.spring.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Profession;

public interface ClientService {
	
	public List<Client> retrieveAllClients();
	public Long addClient(Client c);
	public void deleteClient(Long id);
	public Long updateClient (Client c);
	public Client retrieveClient(Long id);
	
	
	List<Client> retrieveClientsByProfession(Profession profession);

	int deleteClientByCategorieClientAndProfession(@Param("categorie") CategorieClient categorieClient,
			@Param("profession") Profession profession);
	
	int updateClientCategorieByProfession(@Param("categorie") CategorieClient categorieClient,
			@Param("profession") Profession profession);

}
