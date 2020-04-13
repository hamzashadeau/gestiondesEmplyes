package com.example.stock.Dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.PrimeEmploye;

@Repository
public interface PrimeEmployeDao extends JpaRepository<PrimeEmploye, Long> {
List<PrimeEmploye> findByEmployeEmail(String email);
List<PrimeEmploye> findByPrimeMontant(Double montant);
List<PrimeEmploye> findByPrimeLibelle(String libelle);

}
