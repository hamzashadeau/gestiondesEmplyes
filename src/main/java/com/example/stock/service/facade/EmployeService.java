package com.example.stock.service.facade;

import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Employe;

public interface EmployeService {
	Employe findByCin(Integer cin);
	Employe findByMatricule(Integer matricule);
	Employe findByEmail(String email);
	Employe findByCnss(Integer cnss);
	List<Employe> findBySupId(Long id);
	List<Employe> findBySupEmail(String email);
	List<Employe> findAll();
	int save(Employe employe);
	int deleteById(Long id);
	Employe findByid(Long id);

}
