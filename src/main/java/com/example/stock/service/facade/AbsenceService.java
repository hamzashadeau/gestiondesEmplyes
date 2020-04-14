package com.example.stock.service.facade;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Absence;
import com.example.stock.bean.Avancement;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Employe;
import com.example.stock.bean.Fonction;

public interface AbsenceService {
	Absence findByEmployeMatricule(Integer matricule);
	Absence findByEmployeEmail(String email);
	Absence findByDate(Date date);
	List<Absence> findAll();
	int save(Absence absence);
	int deleteById(Long id);
	Absence findByid(Long id);
}
