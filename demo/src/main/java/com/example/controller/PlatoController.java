package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Plato;
import com.example.service.PlatoService;

@RestController
@RequestMapping("/platos")
//@ComponentScan(basePackages = "com.example.controller")
public class PlatoController {
	
	@Autowired
	private PlatoService platoService;

	@GetMapping
	public String saludar(Plato plato) {
		Plato p = new Plato();
		p.setId(1);
		p.setNombre("Ceviche");
		return platoService.saludo(p);
	}
}
