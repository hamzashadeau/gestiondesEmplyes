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
import com.example.stock.bean.Prime;
import com.example.stock.bean.PrimeEmploye;
import com.example.stock.service.facade.FonctionService;
import com.example.stock.service.facade.PrimeEmployeService;
import com.example.stock.service.facade.PrimeService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/PrimeEmploye/")
public class PrimeEmployeRest {
@Autowired
private PrimeEmployeService primeEmployeService;

@GetMapping("findByid/id/{id}")
public PrimeEmploye findByid(@PathVariable Long id) {
	return primeEmployeService.findByid(id);
}
@GetMapping("findByEmployeEmail/email/{email}")
public List<PrimeEmploye> findByEmployeEmail(@PathVariable String email) {
	return primeEmployeService.findByEmployeEmail(email);
}
@GetMapping("findByPrimeMontant/montant/{montant}")
public List<PrimeEmploye> findByPrimeMontant(@PathVariable Double montant) {
	return primeEmployeService.findByPrimeMontant(montant);
}
@GetMapping("findByPrimeLibelle/libelle/{libelle}")
public List<PrimeEmploye> findByPrimeLibelle(@PathVariable String libelle) {
	return primeEmployeService.findByPrimeLibelle(libelle);
}

@GetMapping("findAll")
public List<PrimeEmploye> findAll() {
	return primeEmployeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody PrimeEmploye primeEmploye) {
	return primeEmployeService.save(primeEmploye);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return primeEmployeService.deleteById(id);
}
}
