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
import com.example.stock.service.facade.FonctionService;
import com.example.stock.service.facade.PrimeService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/Prime/")
public class PrimeRest {
@Autowired
private PrimeService primeService;

@GetMapping("findByid/id/{id}")
public Prime findByid(@PathVariable Long id) {
	return primeService.findByid(id);
}
@GetMapping("findByLibelle/libelle/{libelle}")
public List<Prime> findByLibelle(@PathVariable String libelle) {
	return primeService.findByLibelle(libelle);
}


@GetMapping("findAll")
public List<Prime> findAll() {
	return primeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody Prime prime) {
	return primeService.save(prime);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return primeService.deleteById(id);
}
}
