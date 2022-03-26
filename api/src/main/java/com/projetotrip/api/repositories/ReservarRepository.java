package com.projetotrip.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetotrip.api.entities.Reservar;

@Repository
public interface ReservarRepository  extends JpaRepository<Reservar, Long>{

}
