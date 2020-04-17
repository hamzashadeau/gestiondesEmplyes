package com.example.stock.Dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Employe;
import com.example.stock.bean.Fonction;
import com.example.stock.bean.NotificationEmploye;

@Repository
public interface NotificationEmployeDao extends JpaRepository<NotificationEmploye, Long> {
NotificationEmploye findByEmeteurMatricule(Integer matricule);
NotificationEmploye findByEmeteurEmail(String email);
NotificationEmploye findByDestinataireMatricule(Integer matricule);
NotificationEmploye findByDestinataireEmail(String email);
NotificationEmploye findByMessage(String message);
NotificationEmploye findByNotificationType(String type);

}
