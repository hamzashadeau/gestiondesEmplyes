package com.example.stock.service.facade;

import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Avancement;
import com.example.stock.bean.Employe;

public interface AvancementService {
	Avancement findByid(Long id);
	Avancement findByLibelle(String libelle);
	List<Avancement> findAll();
	int save(Avancement avancement);
	int deleteById(Long id);

}
