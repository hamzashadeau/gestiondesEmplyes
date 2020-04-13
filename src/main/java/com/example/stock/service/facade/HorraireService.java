package com.example.stock.service.facade;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Avancement;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Employe;
import com.example.stock.bean.Fonction;
import com.example.stock.bean.Horraire;

public interface HorraireService {
	Horraire findByid(Long id);
	Horraire findByfonctionLibelle(String libelle);
	List<Horraire> findByNbrdeJours(Integer nbrdeJours);
	List<Horraire> findAll();
	int save(Horraire horraire);
	int deleteById(Long id);

}
