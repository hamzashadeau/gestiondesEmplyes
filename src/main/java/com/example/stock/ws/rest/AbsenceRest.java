package com.example.stock.ws.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.bean.Absence;
import com.example.stock.bean.Fonction;
import com.example.stock.service.facade.AbsenceService;
import com.example.stock.service.facade.FonctionService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/Absence/")
public class AbsenceRest {
@Autowired
private AbsenceService absenceService;

@GetMapping("findByEmployeMatricule/matricule/{matricule}")
public Absence findByEmployeMatricule(@PathVariable Integer matricule) {
	return absenceService.findByEmployeMatricule(matricule);
}
@GetMapping("findByEmployeEmail/email/{email}")
public Absence findByEmployeEmail(@PathVariable String email) {
	return absenceService.findByEmployeEmail(email);
}
@GetMapping("findByDate/date/{date}")
public Absence findByDate(@PathVariable @DateTimeFormat(pattern =  "yyyy-MM-dd") Date date) {
	return absenceService.findByDate(date);
}

@GetMapping("findByid/id/{id}")
public Absence findByid(@PathVariable Long id) {
	return absenceService.findByid(id);
}

@GetMapping("findAll")
public List<Absence> findAll() {
	return absenceService.findAll();
}
@PostMapping("save")
public int save(@RequestBody Absence absence) {
	return absenceService.save(absence);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return absenceService.deleteById(id);
}
}
