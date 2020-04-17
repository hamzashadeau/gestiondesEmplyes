package com.example.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.Dao.FonctionDao;
import com.example.stock.Dao.NotificationEmployeDao;
import com.example.stock.bean.Fonction;
import com.example.stock.bean.NotificationEmploye;
import com.example.stock.service.facade.FonctionService;
import com.example.stock.service.facade.NotificationEmployeService;

@Service
public class NotificationEmployeServiceImpl implements NotificationEmployeService {
@Autowired
private NotificationEmployeDao notificationEmployeDao;


@Override
public int save(NotificationEmploye notificationEmploye) {
	if(findByid(notificationEmploye.getId())!= null) {
return -1;
}else {
	notificationEmployeDao.save(notificationEmploye);
		return 1;
}
	}

@Override
public NotificationEmploye findByid(Long id) {
	if (notificationEmployeDao.findById(id).isPresent()) {
		return notificationEmployeDao.findById(id).get();
	} else
		return null;
}

@Override
public int deleteById(Long id) {
	notificationEmployeDao.deleteById(id);
	if (findByid(id) == null) {
		return 1;
	} else
		return -1;
}


@Override
public List<NotificationEmploye> findAll() {
	return notificationEmployeDao.findAll();
}

@Override
public NotificationEmploye findByEmeteurMatricule(Integer matricule) {
	return notificationEmployeDao.findByEmeteurMatricule(matricule);
}

@Override
public NotificationEmploye findByEmeteurEmail(String email) {
	return notificationEmployeDao.findByEmeteurEmail(email);
}

@Override
public NotificationEmploye findByDestinataireMatricule(Integer matricule) {
	return notificationEmployeDao.findByDestinataireMatricule(matricule);
}

@Override
public NotificationEmploye findByDestinataireEmail(String email) {
	return notificationEmployeDao.findByDestinataireEmail(email);
}

@Override
public NotificationEmploye findByMessage(String message) {
	return notificationEmployeDao.findByMessage(message);
}

@Override
public NotificationEmploye findByNotificationType(String type) {
	return notificationEmployeDao.findByNotificationType(type);
}

}
