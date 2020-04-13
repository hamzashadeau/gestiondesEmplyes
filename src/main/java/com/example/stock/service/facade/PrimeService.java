package com.example.stock.service.facade;

import java.util.List;

import com.example.stock.bean.Prime;

public interface PrimeService {
	Prime findByid(Long id);
	List<Prime> findByLibelle(String libelle);
	List<Prime> findAll();
	int save(Prime prime);
	int deleteById(Long id);

}
