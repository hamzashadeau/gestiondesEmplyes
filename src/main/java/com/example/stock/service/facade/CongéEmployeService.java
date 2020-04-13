package com.example.stock.service.facade;

import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Banque;
import com.example.stock.bean.Congee;
import com.example.stock.bean.CongéEmploye;

public interface CongéEmployeService {
	CongéEmploye findByid(Long id);
	CongéEmploye findByCongeeType(String type);
	CongéEmploye findByEmployeEmail(String email);
	CongéEmploye findByEmployeMatricule(Integer matricule);
	List<CongéEmploye> findAll();
	int save(CongéEmploye congéEmploye);
	int deleteById(Long id);

}
