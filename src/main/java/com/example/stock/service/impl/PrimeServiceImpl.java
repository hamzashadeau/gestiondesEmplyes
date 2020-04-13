package com.example.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.PrimeDao;
import com.example.stock.bean.Prime;
import com.example.stock.service.facade.PrimeService;

@Service
public class PrimeServiceImpl implements PrimeService {
@Autowired
private PrimeDao primeDao;


@Override
public int save(Prime prime) {
	if(findByid(prime.getId())!= null) {
return -1;
}else {
	primeDao.save(prime);
		return 1;
}
	}

@Override
public Prime findByid(Long id) {
	if (primeDao.findById(id).isPresent()) {
		return primeDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	primeDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public List<Prime> findAll() {
	return primeDao.findAll();
}

@Override
public List<Prime> findByLibelle(String libelle) {
	return primeDao.findByLibelle(libelle);
}

}
