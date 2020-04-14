package com.example.stock.Dao;



import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Absence;

@Repository
public interface AbsenceDao extends JpaRepository<Absence, Long> {
Absence findByEmployeMatricule(Integer matricule);
Absence findByEmployeEmail(String email);
Absence findByDate(Date date);


}
