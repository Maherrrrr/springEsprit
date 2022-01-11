package tn.esprit.spring.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repository.ClientRepository;
import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Profession;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepository clientRepository;

	public List<Client> retrieveAllClients() {
		List<Client> client = (List<Client>) clientRepository.findAll();

		return client;
	}

	public Long addClient(Client c) {
		clientRepository.save(c);
		return c.getIdClient();
	}

	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
	}

	public Long updateClient(Client c) {

		clientRepository.save(c);
		return c.getIdClient();
	}

	public Client retrieveClient(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public List<Client> retrieveClientsByProfession(Profession profession) {

		List<Client> clientProfession = clientRepository.retrieveClientsByProfession(profession);
		return clientProfession;
	}

	@Override
	public int deleteClientByCategorieClientAndProfession(CategorieClient categorieClient, Profession profession) {
		return clientRepository.deleteClientByCategorieClientAndProfession(categorieClient, profession);
	}

	@Override
	public int updateClientCategorieByProfession(CategorieClient categorieClient, Profession profession) {
		return clientRepository.updateClientCategorieByProfession(categorieClient, profession);
	}
}
