package com.MVC.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;





@Entity
@Table(name = "cliente")
public class Cliente {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	private String cpf;
	private String nome_cliente;
    private String email_cliente;
    private String telefone_cliente;
    private String senha;
    
    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;
    
    public Cliente(Long id_cliente, String cpf, String nome_cliente, String email_cliente, String telefone_cliente,
			String senha, List<Reserva> reservas) {
		
		this.id_cliente = id_cliente;
		this.cpf = cpf;
		this.nome_cliente = nome_cliente;
		this.email_cliente = email_cliente;
		this.telefone_cliente = telefone_cliente;
		this.senha = senha;
		this.reservas = reservas;
	}


    

	public Cliente() {
		
	}


	public Long getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getNome_cliente() {
		return nome_cliente;
	}



	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}


	public String getEmail_cliente() {
		return email_cliente;
	}





	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}





	public String getTelefone_cliente() {
		return telefone_cliente;
	}





	public void setTelefone_cliente(String telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}





	public String getSenha() {
		return senha;
	}





	public void setSenha(String senha) {
		this.senha = senha;
	}










	public List<Reserva> getReservas() {
		return reservas;
	}





	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
    
	




	@Override
	public String toString() {
		return "\n ====Cliente==== \n" + 
				" identificador=  " + id_cliente +  "\n" + 
				" cpf=  " + cpf + "\n" +
				" nome=  " + nome_cliente + "\n" + 
				" e-mail=  " + email_cliente + "\n"+
				" telefone=  " + telefone_cliente + "\n";
	}
     

}
