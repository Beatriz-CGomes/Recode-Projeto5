package com.projetotrip.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetotrip.api.entities.Consultar;
import com.projetotrip.api.servicies.ConsultarService;
@RestController
@RequestMapping("/consultas")
@CrossOrigin(origins = "http://localhost:3000/")
public class ConsultarResource {
	
	@Autowired
	private ConsultarService service;
	
	@GetMapping
	public List<Consultar> findAll (){
		return service.findAll();		
		
	}

	@PostMapping 
	public ResponseEntity<Consultar> save(@RequestBody Consultar consultar){
		service.save(consultar);
		return ResponseEntity.ok().body(consultar);
	}
}
