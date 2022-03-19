package com.site.agenciaworld.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_cliente;
	private String Nome;
	private int idade;
	private String Cpf;
	private String Email;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Viagem> viagens= new ArrayList<Viagem>();
	


	public Cliente() {
		super();
	}

	public Cliente(Long id_cliente, String nome, int idade, String cpf, String email) {
		super();
		this.Id_cliente = id_cliente;
		this.Nome = nome;
		this.idade = idade;
		this.Cpf = cpf;
		this.Email = email;
	}

	public Long getId_cliente() {
		return Id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		Id_cliente = id_cliente;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	public List<Viagem> getViagens() {
		return viagens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id_cliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Id_cliente == other.Id_cliente;
	}
	
	
	
	
	
	
	
	
	
}
