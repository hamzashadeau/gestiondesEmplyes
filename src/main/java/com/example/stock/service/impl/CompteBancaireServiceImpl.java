package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AvancementEmployeDao;
import com.example.stock.Dao.CompteBancaireDao;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.CompteBancaire;
import com.example.stock.service.facade.AvancementEmployeService;
import com.example.stock.service.facade.CompteBancaireService;

@Service
public class CompteBancaireServiceImpl implements CompteBancaireService {
@Autowired
private CompteBancaireDao compteBancaireDao;


@Override
public int save(CompteBancaire compteBancaire) {
	if(findByid(compteBancaire.getId())!= null) {
return -1;
}else {
	compteBancaireDao.save(compteBancaire);
		return 1;
}
	}

@Override
public CompteBancaire findByid(Long id) {
	if (compteBancaireDao.findById(id).isPresent()) {
		return compteBancaireDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	compteBancaireDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public CompteBancaire findByLibelle(String libelle) {
	return compteBancaireDao.findByLibelle(libelle);
}

@Override
public CompteBancaire findByRib(Double rib) {
	return compteBancaireDao.findByRib(rib);
}

@Override
public List<CompteBancaire> findAll() {
	return compteBancaireDao.findAll();
}



}
