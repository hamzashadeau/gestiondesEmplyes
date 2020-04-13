package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AvancementEmployeDao;
import com.example.stock.Dao.HorraireDao;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Horraire;
import com.example.stock.service.facade.AvancementEmployeService;
import com.example.stock.service.facade.HorraireService;

@Service
public class HorraireServiceImpl implements HorraireService {
@Autowired
private HorraireDao horraireDao;


@Override
public int save(Horraire horraire) {
	if(findByid(horraire.getId())!= null) {
return -1;
}else {
		horraireDao.save(horraire);
		return 1;
}
	}

@Override
public Horraire findByid(Long id) {
	if (horraireDao.findById(id).isPresent()) {
		return horraireDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	horraireDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public Horraire findByfonctionLibelle(String libelle) {
	return horraireDao.findByfonctionLibelle(libelle);
}

@Override
public List<Horraire> findByNbrdeJours(Integer nbrdeJours) {
	return horraireDao.findByNbrdeJours(nbrdeJours);
}

@Override
public List<Horraire> findAll() {
	return horraireDao.findAll();
}

}
