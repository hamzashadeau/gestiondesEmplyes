package com.example.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.PrimeDao;
import com.example.stock.Dao.PrimeEmployeDao;
import com.example.stock.bean.Prime;
import com.example.stock.bean.PrimeEmploye;
import com.example.stock.service.facade.PrimeEmployeService;
import com.example.stock.service.facade.PrimeService;

@Service
public class PrimeEmployeServiceImpl implements PrimeEmployeService {
@Autowired
private PrimeEmployeDao primeEmployeDao;


@Override
public int save(PrimeEmploye primeEmploye) {
	if(findByid(primeEmploye.getId())!= null) {
return -1;
}else {
	primeEmployeDao.save(primeEmploye);
		return 1;
}
	}

@Override
public PrimeEmploye findByid(Long id) {
	if (primeEmployeDao.findById(id).isPresent()) {
		return primeEmployeDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	primeEmployeDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public List<PrimeEmploye> findAll() {
	return primeEmployeDao.findAll();
}

@Override
public List<PrimeEmploye> findByEmployeEmail(String email) {
	return primeEmployeDao.findByEmployeEmail(email);
}

@Override
public List<PrimeEmploye> findByPrimeMontant(Double montant) {
	return primeEmployeDao.findByPrimeMontant(montant);
}

@Override
public List<PrimeEmploye> findByPrimeLibelle(String libelle) {
	return primeEmployeDao.findByPrimeLibelle(libelle);
}


}
