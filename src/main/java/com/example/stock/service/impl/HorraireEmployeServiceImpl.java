package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.AvancementEmployeDao;
import com.example.stock.Dao.HorraireDao;
import com.example.stock.Dao.HorraireEmployeDao;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.HoraireEmploye;
import com.example.stock.bean.Horraire;
import com.example.stock.service.facade.AvancementEmployeService;
import com.example.stock.service.facade.HorraireEmployeService;
import com.example.stock.service.facade.HorraireService;

@Service
public class HorraireEmployeServiceImpl implements HorraireEmployeService {
@Autowired
private HorraireEmployeDao horraireEmployeDao;


@Override
public int save(HoraireEmploye horaireEmploye) {
	if(findByid(horaireEmploye.getId())!= null) {
return -1;
}else {
	horraireEmployeDao.save(horaireEmploye);
		return 1;
}
	}

@Override
public HoraireEmploye findByid(Long id) {
	if (horraireEmployeDao.findById(id).isPresent()) {
		return horraireEmployeDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	horraireEmployeDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}


@Override
public List<HoraireEmploye> findAll() {
	return horraireEmployeDao.findAll();
}

}
