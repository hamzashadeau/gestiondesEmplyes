package com.example.stock.service.facade;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Avancement;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Employe;
import com.example.stock.bean.Fonction;

public interface FonctionService {
	Fonction findByid(Long id);
	Fonction findByLibelle(String libelle);
	List<Fonction> findAll();
	int save(Fonction fonction);
	int deleteById(Long id);

}
