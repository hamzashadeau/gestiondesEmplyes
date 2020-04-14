package com.example.stock.service.facade;

import java.util.List;

import com.example.stock.bean.HoraireEmploye;

public interface HorraireEmployeService {
	List<HoraireEmploye> findAll();
	int save(HoraireEmploye horaireEmploye);
	int deleteById(Long id);
	public HoraireEmploye findByid(Long id);

}
