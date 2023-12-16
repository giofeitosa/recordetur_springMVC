package com.MVC.model;

import java.security.DrbgParameters.Reseed;
import java.util.List;

import org.hibernate.sql.ast.tree.from.MappedByTableGroup;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "viagem")
public class Viagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_viagem;
	private  String destino;
	private String descricao;
	private double preco;
	
	@OneToMany (mappedBy = "viagem")
	private List<Reserva> reservas;

	public Viagem(Long id_viagem, String destino, String descricao, double preco, List<Reserva> reservas) {
		super();
		this.id_viagem = id_viagem;
		this.destino = destino;
		this.descricao = descricao;
		this.preco = preco;
		this.reservas = reservas;
	}

	public Viagem() {
		super();
	}

	public Long getId_viagem() {
		return id_viagem;
	}

	public void setId_viagem(Long id_viagem) {
		this.id_viagem = id_viagem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	
	
	
	
	
	    

}
