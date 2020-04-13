package com.example.stock.Dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.CongéEmploye;
import com.example.stock.bean.Employe;

@Repository
public interface CongéEmployeDao extends JpaRepository<CongéEmploye, Long> {
CongéEmploye findByCongeeType(String type);
CongéEmploye findByEmployeEmail(String email);
CongéEmploye findByEmployeMatricule(Integer matricule);

}
