package com.example.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.FonctionDao;
import com.example.stock.bean.Fonction;
import com.example.stock.service.facade.FonctionService;

@Service
public class FonctionServiceImpl implements FonctionService {
@Autowired
private FonctionDao fonctionDao;


@Override
public int save(Fonction fonction) {
	if(findByid(fonction.getId())!= null) {
return -1;
}else {
		fonctionDao.save(fonction);
		return 1;
}
	}

@Override
public Fonction findByid(Long id) {
	if (fonctionDao.findById(id).isPresent()) {
		return fonctionDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	fonctionDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public Fonction findByLibelle(String libelle) {
	return fonctionDao.findByLibelle(libelle);
}

@Override
public List<Fonction> findAll() {
	return fonctionDao.findAll();
}

}
