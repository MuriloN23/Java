package com.Murilo.provaleilao.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Murilo.provaleilao.model.Lance;
import com.Murilo.provaleilao.model.Leilao;

public interface LanceRepository extends JpaRepository<Lance,Long>{
	
	ArrayList<Lance> findByLeilaoId(Long id);
	ArrayList<Lance> findByConcorrenteId(Long id);
	Lance findTopByLeilaoOrderByValorDesc(Leilao leilao);
	

}
