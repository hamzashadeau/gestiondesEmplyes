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

import com.example.stock.bean.Congee;
import com.example.stock.bean.CongéEmploye;
import com.example.stock.service.facade.CongeeService;
import com.example.stock.service.facade.CongéEmployeService;
@RestController
@RequestMapping("/gestionDesEmployee-Api/CongeeService/")
public class CongeeRest {
@Autowired
private CongeeService congeeService;

@GetMapping("findByid/id/{id}")
public Congee findByid(@PathVariable Long id) {
	return congeeService.findByid(id);
}
@GetMapping("findByType/type/{type}")
public Congee findByType(@PathVariable String type) {
	return congeeService.findByType(type);
}
@GetMapping("findAll")
public List<Congee> findAll() {
	return congeeService.findAll();
}
@PostMapping("save")
public int save(@RequestBody Congee congee) {
	return congeeService.save(congee);
}
@DeleteMapping("deleteById/id/{id}")
public int deleteById(@PathVariable Long id) {
	return congeeService.deleteById(id);
}

}
