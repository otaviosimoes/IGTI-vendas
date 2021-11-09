package com.igti.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igti.vendas.dto.CompraDTO;
import com.igti.vendas.services.CompraService;

@RestController
@RequestMapping("/compras")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@GetMapping
	public ResponseEntity<List<CompraDTO>> findAll() {
		List<CompraDTO> lista = compraService.findAll();
		return ResponseEntity.ok(lista);
	}

}
