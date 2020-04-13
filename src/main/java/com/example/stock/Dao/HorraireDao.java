package com.example.stock.Dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Horraire;

@Repository
public interface HorraireDao extends JpaRepository<Horraire, Long> {
Horraire findByfonctionLibelle(String libelle);
List<Horraire> findByNbrdeJours(Integer nbrdeJours);

}
