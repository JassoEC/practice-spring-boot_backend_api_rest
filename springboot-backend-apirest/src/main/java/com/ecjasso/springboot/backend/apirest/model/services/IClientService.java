package com.ecjasso.springboot.backend.apirest.model.services;

import java.util.List;

import com.ecjasso.springboot.backend.apirest.models.entity.Client;

public interface IClientService {

	public List<Client> findAll();
	
	public Client findById(Long id);
	
	public Client save(Client client);
	
	public void delelte(Long id);
}
