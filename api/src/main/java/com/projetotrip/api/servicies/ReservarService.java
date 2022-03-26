package com.projetotrip.api.servicies;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetotrip.api.entities.Reservar;
import com.projetotrip.api.repositories.ReservarRepository;
@Service

public class ReservarService {
	@Autowired
	private ReservarRepository repository;
	
	@Transactional(readOnly = true)
	public List <Reservar>findAll(){
		List<Reservar> resultado = repository.findAll();
		return resultado;
		
	}
	
	public void save(Reservar reservar) {
		repository.save(reservar);
	}
	
}
