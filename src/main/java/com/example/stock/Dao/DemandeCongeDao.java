package com.example.stock.Dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.DemandeConge;
import com.example.stock.bean.Employe;

@Repository
public interface DemandeCongeDao extends JpaRepository<DemandeConge, Long> {
DemandeConge findByTypeCongeeLibelle(String libelle);
DemandeConge findByEmployeEmail(String email);
DemandeConge findByEmployeMatricule(Integer matricule);

}
