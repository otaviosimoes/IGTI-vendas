package com.igti.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igti.vendas.dto.ClienteDTO;
import com.igti.vendas.entities.Cliente;
import com.igti.vendas.repositories.ClienteRepository;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<ClienteDTO> findAll() {	
		List<Cliente> lista = clienteRepository.findAll();
		return lista.stream().map(c -> new ClienteDTO(c)).collect(Collectors.toList());
	}

	
	
	

	
}
