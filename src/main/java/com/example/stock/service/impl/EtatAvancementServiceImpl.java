package com.example.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.EtatAvancementDao;
import com.example.stock.Dao.FonctionDao;
import com.example.stock.bean.EtatAvancement;
import com.example.stock.bean.Fonction;
import com.example.stock.service.facade.EtatAvancementService;
import com.example.stock.service.facade.FonctionService;

@Service
public class EtatAvancementServiceImpl implements EtatAvancementService {
@Autowired
private EtatAvancementDao etatAvancementDao;


@Override
public int save(EtatAvancement etatAvancement) {
	if(findByid(etatAvancement.getId())!= null) {
return -1;
}else {
	etatAvancementDao.save(etatAvancement);
		return 1;
}
	}

@Override
public EtatAvancement findByid(Long id) {
	if (etatAvancementDao.findById(id).isPresent()) {
		return etatAvancementDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	etatAvancementDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}

@Override
public EtatAvancement findByLibelle(String libelle) {
	return etatAvancementDao.findByLibelle(libelle);
}

@Override
public List<EtatAvancement> findAll() {
	return etatAvancementDao.findAll();
}

}
