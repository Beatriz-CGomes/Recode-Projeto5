package com.projetotrip.api.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Consultar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String origem;
	private String destino;
	private String entrada;
	private String saída;
	
	public Consultar () {
		
	}
	
	public Consultar(Long id, String origem, String destino, String entrada, String saída) {
        this.id = id;
		this.origem = origem;
		this.destino = destino;
		this.entrada = entrada;
		this.saída = saída;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getSaída() {
		return saída;
	}

	public void setSaída(String saída) {
		this.saída = saída;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consultar other = (Consultar) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
