package com.example.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.SoldeCongeeEmployeDao;
import com.example.stock.bean.Fonction;
import com.example.stock.bean.SoldeCongeeEmploye;
import com.example.stock.service.facade.SoldeCongeeEmployeService;

@Service
public class SoldeCongeEmployeServiceImpl implements SoldeCongeeEmployeService {
@Autowired
private SoldeCongeeEmployeDao soldeCongeeEmployeDao;


@Override
public int save(SoldeCongeeEmploye soldeCongeeEmploye) {
	if(findByid(soldeCongeeEmploye.getId())!= null) {
return -1;
}else {
	soldeCongeeEmployeDao.save(soldeCongeeEmploye);
		return 1;
}
	}

@Override
public SoldeCongeeEmploye findByid(Long id) {
	if (soldeCongeeEmployeDao.findById(id).isPresent()) {
		return soldeCongeeEmployeDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	soldeCongeeEmployeDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public List<SoldeCongeeEmploye> findAll() {
	return soldeCongeeEmployeDao.findAll();
}

@Override
public List<SoldeCongeeEmploye> findByYear(Integer Year) {
	return soldeCongeeEmployeDao.findByYear(Year);
}

@Override
public List<SoldeCongeeEmploye> findBySoldeRestantesAnneDernier(Integer soldeRestantesAnneDernier) {
	return soldeCongeeEmployeDao.findBySoldeRestantesAnneDernier(soldeRestantesAnneDernier);
}

@Override
public List<SoldeCongeeEmploye> findBySoldeRestantesCetteAnne(Integer soldeRestantesCetteAnne) {
	return soldeCongeeEmployeDao.findBySoldeRestantesCetteAnne(soldeRestantesCetteAnne);
}

@Override
public List<SoldeCongeeEmploye> findBySoldecetteAnneé(Integer soldecetteAnneé) {
	return soldeCongeeEmployeDao.findBySoldecetteAnneé(soldecetteAnneé);
}

@Override
public List<SoldeCongeeEmploye> findByEmployeMatricule(Integer Matricule) {
	return soldeCongeeEmployeDao.findByEmployeMatricule(Matricule);
}

@Override
public List<SoldeCongeeEmploye> findByEmployeEmail(String email) {
	return soldeCongeeEmployeDao.findByEmployeEmail(email);
}

}
