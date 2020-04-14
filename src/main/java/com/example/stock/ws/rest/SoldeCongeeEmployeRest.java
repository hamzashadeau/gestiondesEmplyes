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
import com.example.stock.bean.SoldeCongeeEmploye;
import com.example.stock.service.facade.FonctionService;
import com.example.stock.service.facade.SoldeCongeeEmployeService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/SoldeCongeeEmploye/")
public class SoldeCongeeEmployeRest {
@Autowired
private SoldeCongeeEmployeService soldeCongeeEmployeService;
@GetMapping("findByEmployeMatricule/Matricule/{Matricule}")
public List<SoldeCongeeEmploye> findByEmployeMatricule(@PathVariable Integer Matricule) {
	return soldeCongeeEmployeService.findByEmployeMatricule(Matricule);
}
@GetMapping("findByEmployeEmail/email/{email}")
public List<SoldeCongeeEmploye> findByEmployeEmail(@PathVariable String email) {
	return soldeCongeeEmployeService.findByEmployeEmail(email);
}
@GetMapping("findByYear/Year/{Year}")
public List<SoldeCongeeEmploye> findByYear(@PathVariable Integer Year) {
	return soldeCongeeEmployeService.findByYear(Year);
}
@GetMapping("findBySoldeRestantesAnneDernier/soldeRestantesAnneDernier/{soldeRestantesAnneDernier}")
public List<SoldeCongeeEmploye> findBySoldeRestantesAnneDernier(@PathVariable Integer soldeRestantesAnneDernier) {
	return soldeCongeeEmployeService.findBySoldeRestantesAnneDernier(soldeRestantesAnneDernier);
}
@GetMapping("findBySoldeRestantesCetteAnne/soldeRestantesCetteAnne/{soldeRestantesCetteAnne}")
public List<SoldeCongeeEmploye> findBySoldeRestantesCetteAnne(@PathVariable Integer soldeRestantesCetteAnne) {
	return soldeCongeeEmployeService.findBySoldeRestantesCetteAnne(soldeRestantesCetteAnne);
}
@GetMapping("findBySoldecetteAnneé/soldecetteAnneé/{soldecetteAnneé}")
public List<SoldeCongeeEmploye> findBySoldecetteAnneé(@PathVariable Integer soldecetteAnneé) {
	return soldeCongeeEmployeService.findBySoldecetteAnneé(soldecetteAnneé);
}

@GetMapping("findByid/id/{id}")
public SoldeCongeeEmploye findByid(@PathVariable Long id) {
	return soldeCongeeEmployeService.findByid(id);
}


@GetMapping("findAll")
public List<SoldeCongeeEmploye> findAll() {
	return soldeCongeeEmployeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody SoldeCongeeEmploye soldeCongeeEmploye) {
	return soldeCongeeEmployeService.save(soldeCongeeEmploye);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return soldeCongeeEmployeService.deleteById(id);
}
}
