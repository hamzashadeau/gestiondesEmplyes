package com.example.stock.Dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Departement;
import com.example.stock.bean.Employe;

@Repository
public interface DepartementDao extends JpaRepository<Departement, Long> {
Departement findByNom(String nom);
Departement findByChefEmail(String email);
Departement findByChefMatricule(Integer matricule);
}
