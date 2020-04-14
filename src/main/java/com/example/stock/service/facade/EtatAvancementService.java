package com.example.stock.service.facade;

import java.util.List;

import com.example.stock.bean.EtatAvancement;

public interface EtatAvancementService {
	EtatAvancement findByid(Long id);
	EtatAvancement findByLibelle(String libelle);
	List<EtatAvancement> findAll();
	int save(EtatAvancement etatAvancement);
	int deleteById(Long id);

}
