package com.example.stock.service.facade;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Avancement;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.DepFonction;
import com.example.stock.bean.Employe;

public interface DepFonctionService {
	DepFonction findByid(Long id);
	List<DepFonction> findByDepartemantNomDepartemant(String nomDepartemant);
	List<DepFonction> findByFonctionLibelle(String libelle);
	List<DepFonction> findAll();
	int save(DepFonction employe);
	int deleteById(Long id);

}
