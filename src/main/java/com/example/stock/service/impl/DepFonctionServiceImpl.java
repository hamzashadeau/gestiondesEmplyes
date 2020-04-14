package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AvancementEmployeDao;
import com.example.stock.Dao.CompteBancaireDao;
import com.example.stock.Dao.TypeCongeeDao;
import com.example.stock.Dao.DepFonctionDao;
import com.example.stock.Dao.DepartementDao;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.CompteBancaire;
import com.example.stock.bean.TypeCongee;
import com.example.stock.bean.DepFonction;
import com.example.stock.bean.Departement;
import com.example.stock.service.facade.AvancementEmployeService;
import com.example.stock.service.facade.CompteBancaireService;
import com.example.stock.service.facade.TypeCongeeService;
import com.example.stock.service.facade.DepFonctionService;
import com.example.stock.service.facade.DepartementService;

@Service
public class DepFonctionServiceImpl implements DepFonctionService {
@Autowired
private DepFonctionDao depFonctionDao;


@Override
public int save(DepFonction depFonction) {
	if(findByid(depFonction.getId())!= null) {
return -1;
}else {
	depFonctionDao.save(depFonction);
		return 1;
}
	}

@Override
public DepFonction findByid(Long id) {
	if (depFonctionDao.findById(id).isPresent()) {
		return depFonctionDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	depFonctionDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public List<DepFonction> findByDepartemantNom(String nomDepartemant) {
	return depFonctionDao.findByDepartemantNom(nomDepartemant);
}

@Override
public List<DepFonction> findByFonctionLibelle(String libelle) {
	return depFonctionDao.findByFonctionLibelle(libelle);
}

@Override
public List<DepFonction> findAll() {
	return depFonctionDao.findAll();
}

}
