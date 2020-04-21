package com.example.stock.Dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.DemandeDepermanenceAdministrative;
import com.example.stock.bean.Employe;
import com.example.stock.bean.Fonction;
import com.example.stock.bean.SalaireEmploye;

@Repository
public interface DemandeDepermanenceAdministrativeDao extends JpaRepository<DemandeDepermanenceAdministrative, Long> {
	DemandeDepermanenceAdministrative findByMotif(String moStif);
	List<DemandeDepermanenceAdministrative> findByEmployeId(Long id);
	List<DemandeDepermanenceAdministrative> findByEmployeEmail(String email);
	List<DemandeDepermanenceAdministrative> findByChefId(Long id);
	List<DemandeDepermanenceAdministrative> findByChefEmail(String email);
	

}
