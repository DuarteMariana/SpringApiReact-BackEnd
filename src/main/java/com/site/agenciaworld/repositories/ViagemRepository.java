package com.site.agenciaworld.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.site.agenciaworld.entities.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem,Long>{

}
