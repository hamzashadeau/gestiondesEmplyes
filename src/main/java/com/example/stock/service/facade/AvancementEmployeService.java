package com.example.stock.service.facade;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Avancement;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Employe;

public interface AvancementEmployeService {
	AvancementEmploye findByid(Long id);
	AvancementEmploye findByAvancementLibelle(String libelle);
	AvancementEmploye findByEmployeMatricule(Integer matricule);
	AvancementEmploye findByEmployeEmail(String email);
	AvancementEmploye findByMontant(Double montant);
	AvancementEmploye findByDateAvancement(Date dateAvancement);
	List<AvancementEmploye> findAll();
	int save(AvancementEmploye avancementEmploye);
	int deleteById(Long id);

}
