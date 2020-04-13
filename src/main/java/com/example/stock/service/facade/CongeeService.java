package com.example.stock.service.facade;

import java.util.List;
import java.util.Optional;

import com.example.stock.bean.Banque;
import com.example.stock.bean.Congee;

public interface CongeeService {
	Congee findByid(Long id);
	Congee findByType(String type);
	List<Congee> findAll();
	int save(Congee employe);
	int deleteById(Long id);

}
