package com.site.agenciaworld.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Viagem implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String destino;
	private String ida;
	private String volta;
	
	@ManyToOne
	@JoinColumn(name = "Cliente_Id")
	private Cliente cliente;
	
	public Viagem() {
		super();
	}
	public Viagem(Long id, String destino, String ida, String volta) {
		super();
		this.id = id;
		this.destino = destino;
		this.ida = ida;
		this.volta = volta;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getIda() {
		return ida;
	}
	public void setIda(String ida) {
		this.ida = ida;
	}
	public String getVolta() {
		return volta;
	}
	public void setVolta(String volta) {
		this.volta = volta;
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
		Viagem other = (Viagem) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
