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
import com.example.stock.bean.HoraireEmploye;
import com.example.stock.service.facade.FonctionService;
import com.example.stock.service.facade.HorraireEmployeService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/HoraireEmploye/")
public class HorraireEmployeRest {
@Autowired
private HorraireEmployeService horraireEmployeService;

@GetMapping("findByid/id/{id}")
public HoraireEmploye findByid(@PathVariable Long id) {
	return horraireEmployeService.findByid(id);
}

@GetMapping("findAll")
public List<HoraireEmploye> findAll() {
	return horraireEmployeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody HoraireEmploye horaireEmploye) {
	return horraireEmployeService.save(horaireEmploye);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return horraireEmployeService.deleteById(id);
}
}
