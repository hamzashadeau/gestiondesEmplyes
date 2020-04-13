package com.example.stock.service.facade;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Avancement;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Employe;
import com.example.stock.bean.Fonction;
import com.example.stock.bean.Horraire;
import com.example.stock.bean.Prime;
import com.example.stock.bean.PrimeEmploye;

public interface PrimeEmployeService {
	PrimeEmploye findByid(Long id);
	List<PrimeEmploye> findByEmployeEmail(String email);
	List<PrimeEmploye> findByPrimeMontant(Double montant);
	List<PrimeEmploye> findByPrimeLibelle(String libelle);
	List<PrimeEmploye> findAll();
	int save(PrimeEmploye primeEmploye);
	int deleteById(Long id);

}
