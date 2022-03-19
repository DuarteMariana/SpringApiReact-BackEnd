package com.site.agenciaworld.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.site.agenciaworld.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
