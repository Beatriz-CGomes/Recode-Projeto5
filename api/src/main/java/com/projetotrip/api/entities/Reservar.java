package com.projetotrip.api.entities;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_reservar;
	private String nome;
	private String cpf;
	private String celular;
	private String email;
	private String origem;
	private String destino;
	private String entrada;
	private String saída;
	
public Reservar () {
		
	}

public Reservar(Long id_reservar, String nome, String cpf, String celular, String email, String origem, String destino,
		String entrada, String saída) {
	super();
	this.id_reservar = id_reservar;
	this.nome = nome;
	this.cpf = cpf;
	this.celular = celular;
	this.email = email;
	this.origem = origem;
	this.destino = destino;
	this.entrada = entrada;
	this.saída = saída;
}

public Long getId_reservar() {
	return id_reservar;
}

public void setId_reservar(Long id_reservar) {
	this.id_reservar = id_reservar;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getCelular() {
	return celular;
}

public void setCelular(String celular) {
	this.celular = celular;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
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
	return Objects.hash(id_reservar);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Reservar other = (Reservar) obj;
	return Objects.equals(id_reservar, other.id_reservar);
}
	

}
