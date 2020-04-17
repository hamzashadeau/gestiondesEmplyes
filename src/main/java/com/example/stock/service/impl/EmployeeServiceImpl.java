package com.example.stock.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.EmployeDao;
import com.example.stock.Utilis.DateUlils;
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

@Override
public int nombreDesEmployes() {
	return findAll().size();
}

@Override
public int nombreDesEmployesParDepartements(String nomDepartement) {
	List<Employe> employes = findAll();
	List<Employe> resultat = new ArrayList<Employe>();
	employes.forEach(e->{
		if(e.getDep().getNom().equals(nomDepartement))
			resultat.add(e);
	});
	return resultat.size();
}
@Override
public int nombreDesEmployesParAnneeDeEntré(Integer annee) {
	List<Employe> employes = findAll();
	List<Employe> resultat = new ArrayList<Employe>();
	employes.forEach(e->{
		if(DateUlils.getYear(e.getDateEntree()) == annee)
			resultat.add(e);
	});
	return resultat.size();
}
@Override
public List<Employe> EmployesParAnneeDeEntré(Integer annee) {
	List<Employe> employes = findAll();
	List<Employe> resultat = new ArrayList<Employe>();
	employes.forEach(e->{
		if(DateUlils.getYear(e.getDateEntree()) == annee)
			resultat.add(e);
	});
	return resultat;
}
@Override
public Double MoyenDeSalaireParAnnee(int annee) {
	Double  SomMontant = 0.0;
	List<Employe> resultat = new ArrayList<Employe>();
	List<Employe> employes = new ArrayList<Employe>();
	for (int i = 2010; i < annee; i++) {
		Integer ans = Integer.valueOf(i);
			employes.addAll(EmployesParAnneeDeEntré(ans));
		}
for (Employe employe : employes) {
	SomMontant += employe.getMontantDeBase();
}
	return SomMontant/resultat.size();
}

}