package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AvancementEmployeDao;
import com.example.stock.Dao.BanqueDao;
import com.example.stock.Dao.CongeeDao;
import com.example.stock.Dao.DepartementDao;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Banque;
import com.example.stock.bean.Congee;
import com.example.stock.bean.Departement;
import com.example.stock.service.facade.AvancementEmployeService;
import com.example.stock.service.facade.BanqueService;
import com.example.stock.service.facade.CongeeService;
import com.example.stock.service.facade.DepartementService;

@Service
public class DepartementServiceImpl implements DepartementService {
@Autowired
private DepartementDao departementDao;


@Override
public int save(Departement departement) {
	if(findByid(departement.getId())!= null) {
return -1;
}else {
	departementDao.save(departement);
		return 1;
}
	}

@Override
public Departement findByid(Long id) {
	if (departementDao.findById(id).isPresent()) {
		return departementDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	departementDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public Departement findByNomDepartemant(String nomDepartement) {
	return departementDao.findByNomDepartemant(nomDepartement);
}

@Override
public Departement findBySupEmail(String email) {
	return departementDao.findBySupEmail(email);
}

@Override
public Departement findBySupMatricule(Integer matricule) {
	return departementDao.findBySupMatricule(matricule);
}

@Override
public List<Departement> findAll() {
	return departementDao.findAll();
}


}
