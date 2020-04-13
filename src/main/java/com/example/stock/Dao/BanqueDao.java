package com.example.stock.Dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Banque;
import com.example.stock.bean.Employe;

@Repository
public interface BanqueDao extends JpaRepository<Banque, Long> {
Banque findByLibelle(String libelle);
Banque findByRib(Double rib);

}
