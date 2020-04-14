package com.example.stock.Dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Employe;
import com.example.stock.bean.EtatAvancement;
import com.example.stock.bean.Fonction;

@Repository
public interface EtatAvancementDao extends JpaRepository<EtatAvancement, Long> {
EtatAvancement findByLibelle(String libelle);

}
