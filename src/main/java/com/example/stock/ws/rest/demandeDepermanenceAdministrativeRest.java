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

import com.example.stock.bean.DemandeDepermanenceAdministrative;
import com.example.stock.bean.Fonction;
import com.example.stock.service.facade.DemandeDepermanenceAdministrativeService;
import com.example.stock.service.facade.FonctionService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/DemandeDepermanenceAdministrative/")
public class demandeDepermanenceAdministrativeRest {
@Autowired
private DemandeDepermanenceAdministrativeService demandeDepermanenceAdministrativeService;
@GetMapping("findByMotif/motif/{motif}")
public DemandeDepermanenceAdministrative findByMotif(@PathVariable String motif) {
	return demandeDepermanenceAdministrativeService.findByMotif(motif);
}
@GetMapping("findByEmployeId/id/{id}")
public List<DemandeDepermanenceAdministrative> findByEmployeId(@PathVariable Long id) {
	return demandeDepermanenceAdministrativeService.findByEmployeId(id);
}
@GetMapping("findByEmployeEmail/email/{email}")
public List<DemandeDepermanenceAdministrative> findByEmployeEmail(@PathVariable String email) {
	return demandeDepermanenceAdministrativeService.findByEmployeEmail(email);
}
@GetMapping("findByChefId/id/{id}")
public List<DemandeDepermanenceAdministrative> findByChefId(@PathVariable Long id) {
	return demandeDepermanenceAdministrativeService.findByChefId(id);
}

@GetMapping("findByChefEmail/email/{email}")
public List<DemandeDepermanenceAdministrative> findByChefEmail(@PathVariable String email) {
	return demandeDepermanenceAdministrativeService.findByChefEmail(email);
}

@GetMapping("findByid/id/{id}")
public DemandeDepermanenceAdministrative findByid(@PathVariable Long id) {
	return demandeDepermanenceAdministrativeService.findByid(id);
}

@GetMapping("findAll")
public List<DemandeDepermanenceAdministrative> findAll() {
	return demandeDepermanenceAdministrativeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody DemandeDepermanenceAdministrative demandeDepermanenceAdministrative) {
	return demandeDepermanenceAdministrativeService.save(demandeDepermanenceAdministrative);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return demandeDepermanenceAdministrativeService.deleteById(id);
}
}
