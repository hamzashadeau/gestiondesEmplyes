package com.example.stock.service.facade;

import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Banque;

public interface BanqueService {
	Banque findByid(Long id);
	Banque findByLibelle(String libelle);
	Banque findByRib(Double rib);
	List<Banque> findAll();
	int save(Banque banque);
	int deleteById(Long id);

}
