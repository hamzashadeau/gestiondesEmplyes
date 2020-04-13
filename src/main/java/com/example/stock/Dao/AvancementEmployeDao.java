package com.example.stock.Dao;


import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Employe;

@Repository
public interface AvancementEmployeDao extends JpaRepository<AvancementEmploye, Long> {
AvancementEmploye findByAvancementLibelle(String libelle);
AvancementEmploye findByEmployeMatricule(Integer matricule);
AvancementEmploye findByEmployeEmail(String email);
AvancementEmploye findByMontant(Double montant);
AvancementEmploye findByDateAvancement(Date dateAvancement);
}
