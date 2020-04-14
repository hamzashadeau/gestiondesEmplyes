package com.example.stock.Dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Employe;
import com.example.stock.bean.SoldeCongeeEmploye;

@Repository
public interface SoldeCongeeEmployeDao extends JpaRepository<SoldeCongeeEmploye, Long> {
 List<SoldeCongeeEmploye> findByYear(Integer Year);
 List<SoldeCongeeEmploye> findBySoldeRestantesAnneDernier(Integer soldeRestantesAnneDernier);
 List<SoldeCongeeEmploye> findBySoldeRestantesCetteAnne(Integer soldeRestantesCetteAnne);
 List<SoldeCongeeEmploye> findBySoldecetteAnneé(Integer soldecetteAnneé);
 List<SoldeCongeeEmploye> findByEmployeMatricule(Integer Matricule);
 List<SoldeCongeeEmploye> findByEmployeEmail(String email);
}
