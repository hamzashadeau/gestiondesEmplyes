package com.example.stock.Dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.CompteBancaire;
import com.example.stock.bean.Employe;

@Repository
public interface CompteBancaireDao extends JpaRepository<CompteBancaire, Long> {
CompteBancaire findByLibelle(String libelle);
CompteBancaire findByRib(Double rib);

}
