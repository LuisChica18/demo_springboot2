package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Plato;
import com.example.repo.PlatoRepo;

@Service
public class PlatoService {

	@Autowired
	private PlatoRepo platoRepo;
	
	public String saludo(Plato plato) {
		return platoRepo.saludo(plato);
	}
	
}
