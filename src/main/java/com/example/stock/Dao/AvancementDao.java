package com.example.stock.Dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Avancement;
import com.example.stock.bean.Employe;

@Repository
public interface AvancementDao extends JpaRepository<Avancement, Long> {
Avancement findByLibelle(String libelle);


}
