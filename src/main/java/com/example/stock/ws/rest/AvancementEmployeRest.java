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

import com.example.stock.bean.Avancement;
import com.example.stock.bean.AvancementEmploye;
import com.example.stock.service.facade.AvancementEmployeService;
import com.example.stock.service.facade.AvancementService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/AvancementEmploye/")
public class AvancementEmployeRest {
@Autowired
private AvancementEmployeService avancementEmployeService;
@GetMapping("findByid/id/{id}")
public AvancementEmploye findByid(@PathVariable Long id) {
	return avancementEmployeService.findByid(id);
}
@GetMapping("findByAvancementLibelle/libelle/{libelle}")
public AvancementEmploye findByAvancementLibelle(@PathVariable String libelle) {
	return avancementEmployeService.findByAvancementLibelle(libelle);
}
@GetMapping("findByEmployeMatricule/matricule/{matricule}")
public AvancementEmploye findByEmployeMatricule(@PathVariable Integer matricule) {
	return avancementEmployeService.findByEmployeMatricule(matricule);
}
@GetMapping("findByEmployeEmail/email/{email}")
public AvancementEmploye findByEmployeEmail(@PathVariable String email) {
	return avancementEmployeService.findByEmployeEmail(email);
}
@GetMapping("findByMontant/montant/{montant}")
public AvancementEmploye findByMontant(@PathVariable Double montant) {
	return avancementEmployeService.findByMontant(montant);
}
@GetMapping("findByDateAvancement/dateAvancement/{dateAvancement}")
public AvancementEmploye findByDateAvancement(@PathVariable @DateTimeFormat(pattern =  "yyyy-MM-dd") Date dateAvancement) {
	return avancementEmployeService.findByDateAvancement(dateAvancement);
}
@GetMapping("findAll")
public List<AvancementEmploye> findAll() {
	return avancementEmployeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody AvancementEmploye avancementEmploye) {
	return avancementEmployeService.save(avancementEmploye);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return avancementEmployeService.deleteById(id);
}
}
