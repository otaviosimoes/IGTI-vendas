package com.igti.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igti.vendas.dto.CompraDTO;
import com.igti.vendas.entities.Compra;
import com.igti.vendas.repositories.CompraRepository;

@Service
public class CompraService {
	
	@Autowired
	private CompraRepository compraRepository;
	
	public List<CompraDTO> findAll() {	
		List<Compra> lista = compraRepository.findAll();
		return lista.stream().map(c -> new CompraDTO(c)).collect(Collectors.toList());
	}

}
