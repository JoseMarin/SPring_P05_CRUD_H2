package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Cliente;

public interface IClienteDAO extends JpaRepository<Cliente, Long>{
	
	//Listar clientes or campo nombre
	public List<Cliente> findByNombre(String nombre);
	
}