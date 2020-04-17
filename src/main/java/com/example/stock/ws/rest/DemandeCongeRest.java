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

import com.example.stock.bean.DemandeConge;
import com.example.stock.service.facade.DemandeCongeService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/CongéEmployeService/")
public class DemandeCongeRest {
@Autowired
private DemandeCongeService demandeCongeService;

@GetMapping("findByEtat/etat/{etat}")
public DemandeConge findByEtat(@PathVariable String etat) {
	return demandeCongeService.findByEtat(etat);
}

@GetMapping("findByid/id/{id}")
public DemandeConge findByid(@PathVariable Long id) {
	return demandeCongeService.findByid(id);
}

@GetMapping("findByCongeeType/type/{type}")
public DemandeConge findByTypeCongeeLibelle(@PathVariable String libelle) {
	return demandeCongeService.findByTypeCongeeLibelle(libelle);

}

@GetMapping("findByEmployeEmail/email/{email}")
public DemandeConge findByEmployeEmail(@PathVariable String email) {
	return demandeCongeService.findByEmployeEmail(email);
}
@GetMapping("findByEmployeMatricule/matricule/{matricule}")
public DemandeConge findByEmployeMatricule(@PathVariable Integer matricule) {
	return demandeCongeService.findByEmployeMatricule(matricule);
}
@GetMapping("findAll")
public List<DemandeConge> findAll() {
	return demandeCongeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody DemandeConge demandeConge) {
	return demandeCongeService.save(demandeConge);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return demandeCongeService.deleteById(id);
}

}
