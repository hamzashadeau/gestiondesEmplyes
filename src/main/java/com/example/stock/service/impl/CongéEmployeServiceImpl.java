package com.example.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.CongéEmployeDao;
import com.example.stock.bean.CongéEmploye;
import com.example.stock.service.facade.CongéEmployeService;

@Service
public class CongéEmployeServiceImpl implements CongéEmployeService {
@Autowired
private CongéEmployeDao congéEmployeDao;


@Override
public int save(CongéEmploye congéEmploye) {
	if(findByid(congéEmploye.getId())!= null) {
return -1;
}else {
	congéEmployeDao.save(congéEmploye);
		return 1;
}
	}

@Override
public CongéEmploye findByid(Long id) {
	if (congéEmployeDao.findById(id).isPresent()) {
		return congéEmployeDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	congéEmployeDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public CongéEmploye findByCongeeType(String type) {
	return congéEmployeDao.findByCongeeType(type);
}

@Override
public CongéEmploye findByEmployeEmail(String email) {
	return congéEmployeDao.findByEmployeEmail(email);
}

@Override
public CongéEmploye findByEmployeMatricule(Integer matricule) {
	return congéEmployeDao.findByEmployeMatricule(matricule);
}

@Override
public List<CongéEmploye> findAll() {
	return congéEmployeDao.findAll();
}
}
