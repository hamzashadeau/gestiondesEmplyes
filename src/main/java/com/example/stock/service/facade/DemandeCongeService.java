package com.example.stock.service.facade;

import java.util.List;
import java.util.Optional;

import com.example.stock.bean.CompteBancaire;
import com.example.stock.bean.TypeCongee;
import com.example.stock.bean.DemandeConge;

public interface DemandeCongeService {
	DemandeConge findByid(Long id);
	DemandeConge findByTypeCongeeLibelle(String libelle);
	DemandeConge findByEmployeEmail(String email);
	DemandeConge findByEmployeMatricule(Integer matricule);
	List<DemandeConge> findAll();
	int save(DemandeConge demandeConge);
	int deleteById(Long id);

}
