package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cliente;

public interface IClienteService {
	
	//Metodos del CRUD
		public List<Cliente> listarClientes(); //Listar All 
		
		public Cliente guardarCliente(Cliente cliente);	//Guarda un cliente CREATE
		
		public Cliente clienteXID(Long id); //Leer datos de un cliente READ
		
		public List<Cliente> listarClienteNomnbre(String nombre);//Listar Clientes por campo nombre
		
		public Cliente actualizarCliente(Cliente cliente); //Actualiza datos del cliente UPDATE
		
		public void eliminarCliente(Long id);// Elimina el cliente DELETE

}
