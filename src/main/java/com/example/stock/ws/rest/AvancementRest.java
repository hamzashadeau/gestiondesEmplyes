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

import com.example.stock.bean.Avancement;
import com.example.stock.service.facade.AvancementService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/Avancement/")
public class AvancementRest {
@Autowired
private AvancementService avancementService;

@GetMapping("findByid/id/{id}")
public Avancement findByid(@PathVariable Long id) {
	return avancementService.findByid(id);
}
@GetMapping("findByLibelle/libelle/{libelle}")
public Avancement findByLibelle(@PathVariable String libelle) {
	return avancementService.findByLibelle(libelle);
}
@GetMapping("findAll")
public List<Avancement> findAll() {
	return avancementService.findAll();
}
@PostMapping("save")
public int save(@RequestBody Avancement avancement) {
	return avancementService.save(avancement);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return avancementService.deleteById(id);
}
}
