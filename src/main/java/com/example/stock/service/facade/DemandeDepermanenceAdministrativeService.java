package com.example.stock.service.facade;

import java.util.List;

import com.example.stock.bean.DemandeDepermanenceAdministrative;

public interface DemandeDepermanenceAdministrativeService {
	DemandeDepermanenceAdministrative findByid(Long id);
	List<DemandeDepermanenceAdministrative> findAll();
	int save(DemandeDepermanenceAdministrative demandeDepermanenceAdministrative);
	int deleteById(Long id);
	DemandeDepermanenceAdministrative findByMotif(String moStif);
	List<DemandeDepermanenceAdministrative> findByEmployeId(Long id);
	List<DemandeDepermanenceAdministrative> findByEmployeEmail(String email);
	List<DemandeDepermanenceAdministrative> findByChefId(Long id);
	List<DemandeDepermanenceAdministrative> findByChefEmail(String email);
}
