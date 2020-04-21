package com.example.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.DemandeDepermanenceAdministrativeDao;
import com.example.stock.bean.DemandeDepermanenceAdministrative;
import com.example.stock.service.facade.DemandeDepermanenceAdministrativeService;

@Service
public class DemandeDepermanenceAdministrativeServiceImpl implements DemandeDepermanenceAdministrativeService {
@Autowired
private DemandeDepermanenceAdministrativeDao demandeDepermanenceAdministrativeDao;


@Override
public int save(DemandeDepermanenceAdministrative demandeDepermanenceAdministrative) {
	if(findByid(demandeDepermanenceAdministrative.getId())!= null) {
return -1;
}else {
	demandeDepermanenceAdministrativeDao.save(demandeDepermanenceAdministrative);
		return 1;
}
	}

@Override
public DemandeDepermanenceAdministrative findByid(Long id) {
	if (demandeDepermanenceAdministrativeDao.findById(id).isPresent()) {
		return demandeDepermanenceAdministrativeDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	demandeDepermanenceAdministrativeDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}



@Override
public List<DemandeDepermanenceAdministrative> findAll() {
	return demandeDepermanenceAdministrativeDao.findAll();
}


@Override
public DemandeDepermanenceAdministrative findByMotif(String moStif) {
	return demandeDepermanenceAdministrativeDao.findByMotif(moStif);
}

@Override
public List<DemandeDepermanenceAdministrative> findByEmployeId(Long id) {
	return demandeDepermanenceAdministrativeDao.findByEmployeId(id);
}

@Override
public List<DemandeDepermanenceAdministrative> findByEmployeEmail(String email) {
	return demandeDepermanenceAdministrativeDao.findByEmployeEmail(email);
}

@Override
public List<DemandeDepermanenceAdministrative> findByChefId(Long id) {
	return demandeDepermanenceAdministrativeDao.findByChefId(id);
}

@Override
public List<DemandeDepermanenceAdministrative> findByChefEmail(String email) {
	return demandeDepermanenceAdministrativeDao.findByChefEmail(email);
}

}
