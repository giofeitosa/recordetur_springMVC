package com.MVC.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;




@Entity
@Table(name = "reserva")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_reserva;
	private String data_reserva;
	private Double valor_reserva;
	
	@ManyToOne
	@JoinColumn (name = "id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn (name = "id_viagem")
	private Viagem viagem;

	public Reserva(Long id_reserva, String data_reserva, Double valor_reserva, Cliente cliente, Viagem viagem) {
		super();
		this.id_reserva = id_reserva;
		this.data_reserva = data_reserva;
		this.valor_reserva = valor_reserva;
		this.cliente = cliente;
		this.viagem = viagem;
	}

	public Reserva() {
		super();
	}

	public Long getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(Long id_reserva) {
		this.id_reserva = id_reserva;
	}

	public String getData_reserva() {
		return data_reserva;
	}

	public void setData_reserva(String data_reserva) {
		this.data_reserva = data_reserva;
	}

	public Double getValor_reserva() {
		return valor_reserva;
	}

	public void setValor_reserva(Double valor_reserva) {
		this.valor_reserva = valor_reserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}
	
	
	
	
	
	
		
	    
	    
	}



