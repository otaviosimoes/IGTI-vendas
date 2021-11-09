package com.igti.vendas.dto;

import java.time.LocalDate;

import com.igti.vendas.entities.Compra;

public class CompraDTO {
	
	private Long id;	
	private Double valorCompra;
	private LocalDate dataCompra;	
	
	public CompraDTO(Compra compra) {		
		this.id = compra.getId();
		this.valorCompra = compra.getValorCompra();
		this.dataCompra = compra.getDataCompra();
	}

	public CompraDTO(Long id, Double valorCompra, LocalDate dataCompra) {		
		this.id = id;
		this.valorCompra = valorCompra;
		this.dataCompra = dataCompra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

}
