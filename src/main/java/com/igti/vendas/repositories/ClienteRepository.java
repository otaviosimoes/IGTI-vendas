package com.igti.vendas.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.igti.vendas.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>  {
}
