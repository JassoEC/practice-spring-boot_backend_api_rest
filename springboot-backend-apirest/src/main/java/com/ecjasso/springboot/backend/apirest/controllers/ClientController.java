package com.ecjasso.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecjasso.springboot.backend.apirest.model.services.IClientService;
import com.ecjasso.springboot.backend.apirest.models.entity.Client;

@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	private IClientService clientService;

	@GetMapping("/clients")
	public List<Client> index() {
		return clientService.findAll();
	}
}
