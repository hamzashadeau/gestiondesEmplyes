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

import com.example.stock.bean.EtatAvancement;
import com.example.stock.bean.Fonction;
import com.example.stock.service.facade.EtatAvancementService;
import com.example.stock.service.facade.FonctionService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/EtatAvancement/")
public class EtatAvancementRest {
@Autowired
private EtatAvancementService etatAvancementService;

@GetMapping("findByid/id/{id}")
public EtatAvancement findByid(@PathVariable Long id) {
	return etatAvancementService.findByid(id);
}
@GetMapping("findByLibelle/libelle/{libelle}")
public EtatAvancement findByLibelle(@PathVariable String libelle) {
	return etatAvancementService.findByLibelle(libelle);
}

@GetMapping("findAll")
public List<EtatAvancement> findAll() {
	return etatAvancementService.findAll();
}
@PostMapping("save")
public int save(@RequestBody EtatAvancement etatAvancement) {
	return etatAvancementService.save(etatAvancement);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return etatAvancementService.deleteById(id);
}
}
