package com.example.GSK.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GSK.Model.Produit;


@Repository
public interface ProduitRespository extends JpaRepository<Produit,Integer> {
	
	
}
