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

import com.example.stock.bean.CompteBancaire;
import com.example.stock.service.facade.CompteBancaireService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/Banque/")
public class CompteBancaireRest {
@Autowired
private CompteBancaireService compteBancaireService;

@GetMapping("findByid/id/{id}")
public CompteBancaire findByid(@PathVariable Long id) {
	return compteBancaireService.findByid(id);
}
@GetMapping("findByLibelle/libelle/{libelle}")
public CompteBancaire findByLibelle(@PathVariable String libelle) {
	return compteBancaireService.findByLibelle(libelle);
}
@GetMapping("findByRib/rib/{rib}")
public CompteBancaire findByRib(@PathVariable Double rib) {
	return compteBancaireService.findByRib(rib);
}
@PostMapping("save")
public int save(@RequestBody CompteBancaire compteBancaire) {
	return compteBancaireService.save(compteBancaire);
}

@GetMapping("findAll")
public List<CompteBancaire> findAll() {
	return compteBancaireService.findAll();
}

@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return compteBancaireService.deleteById(id);
}
}
