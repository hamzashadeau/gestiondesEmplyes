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

import com.example.stock.bean.Employe;
import com.example.stock.service.facade.EmployeService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/Employee/")
public class EmployeeRest {
@Autowired
private EmployeService employeService;
@GetMapping("findByCin/cin/{cin}")
public Employe findByCin(@PathVariable Integer cin) {
	return employeService.findByCin(cin);
}
@GetMapping("findByMatricule/matricule/{matricule}")
public Employe findByMatricule(@PathVariable Integer matricule) {
	return employeService.findByMatricule(matricule);
}
@GetMapping("findByEmail/email/{email}")
public Employe findByEmail(@PathVariable String email) {
	return employeService.findByEmail(email);
}
@GetMapping("findByCnss/cnss/{cnss}")
public Employe findByCnss(@PathVariable Integer cnss) {
	return employeService.findByCnss(cnss);
}
@GetMapping("findBySupId/id/{id}")
public List<Employe> findBySupId(@PathVariable Long id) {
	return employeService.findBySupId(id);
}
@GetMapping("findBySupEmail/email/{email}")
public List<Employe> findBySupEmail(@PathVariable String email) {
	return employeService.findBySupEmail(email);
}
@GetMapping("findAll")
public List<Employe> findAll() {
	return employeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody Employe employe) {
	return employeService.save(employe);
}
@DeleteMapping("deleteById")
public int deleteById(@PathVariable Long id) {
	return employeService.deleteById(id);
}
@GetMapping("findByid/id/{id}")
public Employe findByid(@PathVariable Long id) {
	return employeService.findByid(id);
}
}
