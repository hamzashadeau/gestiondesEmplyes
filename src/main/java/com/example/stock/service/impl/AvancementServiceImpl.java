package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AvancementDao;
import com.example.stock.bean.Avancement;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.service.facade.AvancementService;

@Service
public class AvancementServiceImpl implements AvancementService {
@Autowired
private AvancementDao avancementDao;


@Override
public int save(Avancement avancement) {
	if(findByid(avancement.getId())!= null) {
return -1;
}else {
		avancementDao.save(avancement);
		return 1;
}
	}

@Override
public Avancement findByid(Long id) {
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
public List<Avancement> findAll() {
	return avancementDao.findAll();
}

@Override
public Avancement findByLibelle(String libelle) {
	return avancementDao.findByLibelle(libelle);
}



}
