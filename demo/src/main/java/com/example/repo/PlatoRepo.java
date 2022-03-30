package com.example.repo;

import org.springframework.stereotype.Repository;

import com.example.model.Plato;

@Repository
public class PlatoRepo {
	
	public String saludo(Plato plato) {
		return "Hola " + plato.getNombre();
	}
}
