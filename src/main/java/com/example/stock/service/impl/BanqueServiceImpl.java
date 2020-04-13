package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AvancementEmployeDao;
import com.example.stock.Dao.BanqueDao;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Banque;
import com.example.stock.service.facade.AvancementEmployeService;
import com.example.stock.service.facade.BanqueService;

@Service
public class BanqueServiceImpl implements BanqueService {
@Autowired
private BanqueDao banqueDao;


@Override
public int save(Banque banque) {
	if(findByid(banque.getId())!= null) {
return -1;
}else {
	banqueDao.save(banque);
		return 1;
}
	}

@Override
public Banque findByid(Long id) {
	if (banqueDao.findById(id).isPresent()) {
		return banqueDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	banqueDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public Banque findByLibelle(String libelle) {
	return banqueDao.findByLibelle(libelle);
}

@Override
public Banque findByRib(Double rib) {
	return banqueDao.findByRib(rib);
}

@Override
public List<Banque> findAll() {
	return banqueDao.findAll();
}



}
