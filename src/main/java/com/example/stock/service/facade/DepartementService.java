package com.example.stock.service.facade;

import java.util.List;
import java.util.Optional;

import com.example.stock.bean.CompteBancaire;
import com.example.stock.bean.TypeCongee;
import com.example.stock.bean.Departement;

public interface DepartementService {
	Departement findByid(Long id);
	Departement findByNom(String nom);
	Departement findByChefEmail(String email);
	Departement findByChefMatricule(Integer matricule);
	List<Departement> findAll();
	int save(Departement departement);
	int deleteById(Long id);

}
