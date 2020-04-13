package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AvancementEmployeDao;
import com.example.stock.Dao.BanqueDao;
import com.example.stock.Dao.CongeeDao;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Banque;
import com.example.stock.bean.Congee;
import com.example.stock.service.facade.AvancementEmployeService;
import com.example.stock.service.facade.BanqueService;
import com.example.stock.service.facade.CongeeService;

@Service
public class CongéServiceImpl implements CongeeService {
@Autowired
private CongeeDao congeeDao;


@Override
public int save(Congee congee) {
	if(findByid(congee.getId())!= null) {
return -1;
}else {
	congeeDao.save(congee);
		return 1;
}
	}

@Override
public Congee findByid(Long id) {
	if (congeeDao.findById(id).isPresent()) {
		return congeeDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	congeeDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public Congee findByType(String type) {
	return congeeDao.findByType(type);
}

@Override
public List<Congee> findAll() {
	return congeeDao.findAll();
}




}
