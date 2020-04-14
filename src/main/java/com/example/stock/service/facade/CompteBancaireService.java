package com.example.stock.service.facade;

import java.util.List;
import java.util.Optional;

import com.example.stock.bean.CompteBancaire;

public interface CompteBancaireService {
	CompteBancaire findByid(Long id);
	CompteBancaire findByLibelle(String libelle);
	CompteBancaire findByRib(Double rib);
	List<CompteBancaire> findAll();
	int save(CompteBancaire compteBancaire);
	int deleteById(Long id);

}
