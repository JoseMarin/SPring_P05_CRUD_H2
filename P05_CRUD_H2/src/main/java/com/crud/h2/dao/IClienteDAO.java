package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Cliente;

/**
 * @author Jose
 *
 */
public interface IClienteDAO extends JpaRepository<Cliente, Long>{
	
	//Listar clientes or campo nombre
	public List<Cliente> findByNombre(String nombre);
	
}
