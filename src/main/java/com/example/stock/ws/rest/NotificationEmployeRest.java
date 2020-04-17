package com.example.stock.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.bean.Fonction;
import com.example.stock.bean.NotificationEmploye;
import com.example.stock.service.facade.FonctionService;
import com.example.stock.service.facade.NotificationEmployeService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/NotificationEmploye/")
public class NotificationEmployeRest {
@Autowired
private NotificationEmployeService notificationEmployeService;
@GetMapping("findByNotificationType/type/{type}")
public NotificationEmploye findByNotificationType(@PathVariable String type) {
	return notificationEmployeService.findByNotificationType(type);
}
@GetMapping("findByid/id/{id}")
public NotificationEmploye findByid(Long id) {
	return notificationEmployeService.findByid(id);
}
@GetMapping("findByEmeteurMatricule/matricule/{matricule}")
public NotificationEmploye findByEmeteurMatricule(@PathVariable Integer matricule) {
	return notificationEmployeService.findByEmeteurMatricule(matricule);
}
@GetMapping("findByEmeteurEmail/email/{email}")
public NotificationEmploye findByEmeteurEmail(@PathVariable String email) {
	return notificationEmployeService.findByEmeteurEmail(email);
}
@GetMapping("findByDestinataireMatricule/matricule/{matricule}")
public NotificationEmploye findByDestinataireMatricule(@PathVariable Integer matricule) {
	return notificationEmployeService.findByDestinataireMatricule(matricule);
}
@GetMapping("findByDestinataireEmail/email/{email}")
public NotificationEmploye findByDestinataireEmail(@PathVariable String email) {
	return notificationEmployeService.findByDestinataireEmail(email);
}
@GetMapping("findByMessage/message/{message}")
public NotificationEmploye findByMessage(@PathVariable String message) {
	return notificationEmployeService.findByMessage(message);
}

@GetMapping("findAll")
public List<NotificationEmploye> findAll() {
	return notificationEmployeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody NotificationEmploye notificationEmploye) {
	return notificationEmployeService.save(notificationEmploye);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return notificationEmployeService.deleteById(id);
}
}
