package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.spring.Repository.ClientRepository;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Profession;
import tn.esprit.spring.service.ClientService;

@Api(tags = "Client management")
@ApiOperation(value = "Récupérer la liste des clients")
@RestController
@RequestMapping("client/")
public class ClientController {
	ClientRepository clientRepository;
	ClientService clienservice;

	@Autowired
	ClientService clientService;

	@GetMapping("clientList")
	@ResponseBody
	public List<Client>getClients(){
		List<Client> listClients = clientService.retrieveAllClients();
		return listClients;
	}
	
	@GetMapping("clientList/{id}")
	public List<Client> getClientById(@PathVariable("id") String id) {

		List<Client> clients = clientService.retrieveAllClients();
		return clients;
	}

	@GetMapping("clientList/{profession}")
	@ResponseBody
	public Client getClientByProfession(@PathVariable("profession") Profession profession) {
		return (Client) clientService.retrieveClientsByProfession(profession);
	}

	@PostMapping("addClient")
	@ResponseBody
	public Long addClient(@RequestBody Client c) {
		return clientService.addClient(c);
	}

	
	@DeleteMapping("remove-client/{client-id}")
	@ResponseBody
	public void deleteClient(@PathVariable("client-id") Long idClient) {
	clientService.deleteClient(idClient);
	}
	//http://127.0.0.1:1997/SpringMVC/servlet/updateClient
	@PutMapping("updateClient")
	@ResponseBody
	public Long modifyClient(@RequestBody Client c)  {
		return clientService.updateClient(c);
	}

}
