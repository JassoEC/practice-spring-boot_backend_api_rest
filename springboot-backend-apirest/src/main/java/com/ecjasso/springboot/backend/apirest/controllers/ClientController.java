package com.ecjasso.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecjasso.springboot.backend.apirest.model.services.IClientService;
import com.ecjasso.springboot.backend.apirest.models.entity.Client;

@CrossOrigin(origins = { "http://localhost" })
@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	private IClientService clientService;

	@GetMapping("/clients")
	public List<Client> index() {
		return clientService.findAll();
	}

	@GetMapping("/clients/{id}")
	public Client show(@PathVariable Long id) {
		return clientService.findById(id);
	}

	@PostMapping("/clients")
	@ResponseStatus(HttpStatus.CREATED)
	public Client create(@RequestBody Client client) {
		return clientService.save(client);
	}

	@PutMapping("/clients/{id}")
	public Client update(@RequestBody Client client, @PathVariable Long id) {

		Client currentData = clientService.findById(id);
		currentData.setName(client.getName());
		currentData.setLastName(client.getLastName());
		currentData.setEmail(client.getEmail());

		return clientService.save(currentData);
	}

	@DeleteMapping("/clients/{id}")
	public void delete(@PathVariable Long id) {
		clientService.delelte(id);
	}
}
