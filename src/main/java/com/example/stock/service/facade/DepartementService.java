package com.example.stock.service.facade;

import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Banque;
import com.example.stock.bean.Congee;
import com.example.stock.bean.Departement;

public interface DepartementService {
	Departement findByid(Long id);
	Departement findByNomDepartemant(String nomDepartement);
	Departement findBySupEmail(String email);
	Departement findBySupMatricule(Integer matricule);
	List<Departement> findAll();
	int save(Departement departement);
	int deleteById(Long id);

}
