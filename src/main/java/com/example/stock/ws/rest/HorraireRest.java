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
import com.example.stock.bean.Horraire;
import com.example.stock.service.facade.FonctionService;
import com.example.stock.service.facade.HorraireService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/Horraire/")
public class HorraireRest {
@Autowired
private HorraireService horraireService;

@GetMapping("findByid/id/{id}")
public Horraire findByid(@PathVariable Long id) {
	return horraireService.findByid(id);
}
@GetMapping("findByfonctionLibelle/libelle/{libelle}")
public Horraire findByfonctionLibelle(@PathVariable String libelle) {
	return horraireService.findByfonctionLibelle(libelle);
}
@GetMapping("findByNbrdeJours/nbrdeJours/{nbrdeJours}")
public List<Horraire> findByNbrdeJours(@PathVariable Integer nbrdeJours) {
	return horraireService.findByNbrdeJours(nbrdeJours);
}


@GetMapping("findAll")
public List<Horraire> findAll() {
	return horraireService.findAll();
}
@PostMapping("save")
public int save(@RequestBody Horraire horraire) {
	return horraireService.save(horraire);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return horraireService.deleteById(id);
}
}
