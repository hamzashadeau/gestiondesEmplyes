package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AvancementEmployeDao;
import com.example.stock.Dao.BanqueDao;
import com.example.stock.Dao.CongeeDao;
import com.example.stock.Dao.DepFonctionDao;
import com.example.stock.Dao.DepartementDao;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Banque;
import com.example.stock.bean.Congee;
import com.example.stock.bean.DepFonction;
import com.example.stock.bean.Departement;
import com.example.stock.service.facade.AvancementEmployeService;
import com.example.stock.service.facade.BanqueService;
import com.example.stock.service.facade.CongeeService;
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
public List<DepFonction> findByDepartemantNomDepartemant(String nomDepartemant) {
	return depFonctionDao.findByDepartemantNomDepartemant(nomDepartemant);
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
