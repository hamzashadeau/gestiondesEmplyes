package com.example.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.DemandeCongeDao;
import com.example.stock.bean.DemandeConge;
import com.example.stock.service.facade.DemandeCongeService;

@Service
public class DemandeCongeServiceImpl implements DemandeCongeService {
@Autowired
private DemandeCongeDao demandeCongeDao;


@Override
public int save(DemandeConge demandeConge) {
	if(findByid(demandeConge.getId())!= null) {
return -1;
}else {
	demandeCongeDao.save(demandeConge);
		return 1;
}
	}

@Override
public DemandeConge findByid(Long id) {
	if (demandeCongeDao.findById(id).isPresent()) {
		return demandeCongeDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	demandeCongeDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public DemandeConge findByTypeCongeeLibelle(String libelle) {
	return demandeCongeDao.findByTypeCongeeLibelle(libelle);

}

@Override
public DemandeConge findByEmployeEmail(String email) {
	return demandeCongeDao.findByEmployeEmail(email);
}

@Override
public DemandeConge findByEmployeMatricule(Integer matricule) {
	return demandeCongeDao.findByEmployeMatricule(matricule);
}

@Override
public List<DemandeConge> findAll() {
	return demandeCongeDao.findAll();
}
}
