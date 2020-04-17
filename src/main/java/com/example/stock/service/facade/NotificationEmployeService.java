package com.example.stock.service.facade;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Avancement;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Employe;
import com.example.stock.bean.Fonction;
import com.example.stock.bean.NotificationEmploye;

public interface NotificationEmployeService {
	NotificationEmploye findByid(Long id);
	NotificationEmploye findByEmeteurMatricule(Integer matricule);
	NotificationEmploye findByEmeteurEmail(String email);
	NotificationEmploye findByDestinataireMatricule(Integer matricule);
	NotificationEmploye findByDestinataireEmail(String email);
	NotificationEmploye findByMessage(String message);	
	List<NotificationEmploye> findAll();
	int save(NotificationEmploye notificationEmploye);
	int deleteById(Long id);
	NotificationEmploye findByNotificationType(String type);

}
