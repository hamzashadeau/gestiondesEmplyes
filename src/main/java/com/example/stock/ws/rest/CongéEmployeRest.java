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

import com.example.stock.bean.CongéEmploye;
import com.example.stock.service.facade.CongéEmployeService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/CongéEmployeService/")
public class CongéEmployeRest {
@Autowired
private CongéEmployeService congéEmployeService;

@GetMapping("findByid/id/{id}")
public CongéEmploye findByid(@PathVariable Long id) {
	return congéEmployeService.findByid(id);
}

@GetMapping("findByCongeeType/type/{type}")
public CongéEmploye findByCongeeType(@PathVariable String type) {
	return congéEmployeService.findByCongeeType(type);
}

@GetMapping("findByEmployeEmail/email/{email}")
public CongéEmploye findByEmployeEmail(@PathVariable String email) {
	return congéEmployeService.findByEmployeEmail(email);
}
@GetMapping("findByEmployeMatricule/matricule/{matricule}")
public CongéEmploye findByEmployeMatricule(@PathVariable Integer matricule) {
	return congéEmployeService.findByEmployeMatricule(matricule);
}
@GetMapping("findAll")
public List<CongéEmploye> findAll() {
	return congéEmployeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody CongéEmploye congéEmploye) {
	return congéEmployeService.save(congéEmploye);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return congéEmployeService.deleteById(id);
}

}
