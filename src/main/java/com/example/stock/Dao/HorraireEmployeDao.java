package com.example.stock.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.HoraireEmploye;

@Repository
public interface HorraireEmployeDao extends JpaRepository<HoraireEmploye, Long> {

}
