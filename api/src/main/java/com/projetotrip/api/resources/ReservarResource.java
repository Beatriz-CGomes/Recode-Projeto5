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


import com.projetotrip.api.entities.Reservar;
import com.projetotrip.api.servicies.ReservarService;

@RestController
@RequestMapping("/reservas")
@CrossOrigin(origins = "http://localhost:3000/")

public class ReservarResource {
	@Autowired
	private ReservarService service;
	
	@GetMapping
	public List<Reservar> findAll (){
		return service.findAll();		
		
	}

	@PostMapping 
	public ResponseEntity<Reservar> save(@RequestBody Reservar reservar){
		service.save(reservar);
		return ResponseEntity.ok().body(reservar);
	}
}
