package com.example.stock.service.facade;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Avancement;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.bean.Employe;
import com.example.stock.bean.Fonction;
import com.example.stock.bean.Notification;

public interface NotificationService {
	Notification findByid(Long id);
	Notification findByType(String type);
	List<Notification> findAll();
	int save(Notification notification);
	int deleteById(Long id);

}
