package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AvancementEmployeDao;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.service.facade.AvancementEmployeService;

@Service
public class AvancementEmployeServiceImpl implements AvancementEmployeService {
@Autowired
private AvancementEmployeDao avancementDao;


@Override
public int save(AvancementEmploye avancementEmploye) {
	if(findByid(avancementEmploye.getId())!= null) {
return -1;
}else {
		avancementDao.save(avancementEmploye);
		return 1;
}
	}

@Override
public AvancementEmploye findByid(Long id) {
	if (avancementDao.findById(id).isPresent()) {
		return avancementDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	avancementDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public AvancementEmploye findByAvancementLibelle(String libelle) {
	return avancementDao.findByAvancementLibelle(libelle);
}

@Override
public AvancementEmploye findByEmployeMatricule(Integer matricule) {
	return avancementDao.findByEmployeMatricule(matricule);
}

@Override
public AvancementEmploye findByEmployeEmail(String email) {
	return avancementDao.findByEmployeEmail(email);
}

@Override
public AvancementEmploye findByMontant(Double montant) {
	return avancementDao.findByMontant(montant);
}

@Override
public AvancementEmploye findByDateAvancement(Date dateAvancement) {
	return avancementDao.findByDateAvancement(dateAvancement);
}

@Override
public List<AvancementEmploye> findAll() {
	return avancementDao.findAll();
}



}
