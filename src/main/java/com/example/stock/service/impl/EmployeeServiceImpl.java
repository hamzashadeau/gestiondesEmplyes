package com.example.stock.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.EmployeDao;
import com.example.stock.bean.Employe;
import com.example.stock.service.facade.EmployeService;

@Service
public class EmployeeServiceImpl implements EmployeService {
@Autowired
private EmployeDao employeDao;


@Override
public Employe findByCin(Integer cin) {
	return employeDao.findByCin(cin);
}

@Override
public Employe findByMatricule(Integer matricule) {
	return employeDao.findByMatricule(matricule);
}

@Override
public Employe findByEmail(String email) {
	return employeDao.findByEmail(email);
}

@Override
public Employe findByCnss(Integer cnss) {
	return employeDao.findByCnss(cnss);
}

@Override
public List<Employe> findBySupId(Long id) {
	return employeDao.findBySupId(id);
}

@Override
public List<Employe> findBySupEmail(String email) {
	return employeDao.findBySupEmail(email);
}

@Override
public List<Employe> findAll() {
	return employeDao.findAll();
}

@Override
public int save(Employe employe) {
	if(findByid(employe.getId())!= null) {
return -1;
}else {
		employeDao.save(employe);
		return 1;
}
	}

@Override
public Employe findByid(Long id) {
	if (employeDao.findById(id).isPresent()) {
		return employeDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	employeDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

}
