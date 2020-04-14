package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AbsenceDao;
import com.example.stock.Dao.FonctionDao;
import com.example.stock.bean.Absence;
import com.example.stock.bean.Fonction;
import com.example.stock.service.facade.AbsenceService;
import com.example.stock.service.facade.FonctionService;

@Service
public class AbsenceServiceImpl implements AbsenceService {
@Autowired
private AbsenceDao absenceDao;


@Override
public int save(Absence absence) {
	if(findByid(absence.getId())!= null) {
return -1;
}else {
	absenceDao.save(absence);
		return 1;
}
	}

@Override
public Absence findByid(Long id) {
	if (absenceDao.findById(id).isPresent()) {
		return absenceDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	absenceDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public List<Absence> findAll() {
	return absenceDao.findAll();
}

@Override
public Absence findByEmployeMatricule(Integer matricule) {
	return absenceDao.findByEmployeMatricule(matricule);
}

@Override
public Absence findByEmployeEmail(String email) {
	return absenceDao.findByEmployeEmail(email);
}

@Override
public Absence findByDate(Date date) {
	return absenceDao.findByDate(date);
}

}
