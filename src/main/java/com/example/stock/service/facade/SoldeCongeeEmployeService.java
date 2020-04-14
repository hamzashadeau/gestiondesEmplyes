package com.example.stock.service.facade;

import java.util.List;

import com.example.stock.bean.SoldeCongeeEmploye;

public interface SoldeCongeeEmployeService {
	 List<SoldeCongeeEmploye> findByYear(Integer Year);
	 List<SoldeCongeeEmploye> findBySoldeRestantesAnneDernier(Integer soldeRestantesAnneDernier);
	 List<SoldeCongeeEmploye> findBySoldeRestantesCetteAnne(Integer soldeRestantesCetteAnne);
	 List<SoldeCongeeEmploye> findBySoldecetteAnneé(Integer soldecetteAnneé);
	List<SoldeCongeeEmploye> findAll();
	int save(SoldeCongeeEmploye soldeCongeeEmploye);
	int deleteById(Long id);
	public SoldeCongeeEmploye findByid(Long id);
    List<SoldeCongeeEmploye> findByEmployeMatricule(Integer Matricule);
    List<SoldeCongeeEmploye> findByEmployeEmail(String email);
}
