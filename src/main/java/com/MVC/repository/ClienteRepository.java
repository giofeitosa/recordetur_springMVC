package com.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MVC.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
