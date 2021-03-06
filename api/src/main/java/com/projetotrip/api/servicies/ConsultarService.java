package com.projetotrip.api.servicies;



import java.util.List;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetotrip.api.entities.Consultar;
import com.projetotrip.api.repositories.ConsultarRepository;
@Service
public class ConsultarService {

	@Autowired
	private ConsultarRepository repository;
	
	@Transactional(readOnly = true)
	public List <Consultar>findAll(){
		List<Consultar> resultado = repository.findAll();
		return resultado;
		
	}
	
	public void save(Consultar consultar) {
		repository.save(consultar);
	}
	
	
	
	
	

}
