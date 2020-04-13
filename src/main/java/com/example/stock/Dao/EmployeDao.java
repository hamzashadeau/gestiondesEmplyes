package com.example.stock.Dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Employe;

@Repository
public interface EmployeDao extends JpaRepository<Employe, Long> {
Employe findByCin(Integer cin);
Employe findByMatricule(Integer matricule);
Employe findByEmail(String email);
Employe findByCnss(Integer cnss);
List<Employe> findBySupId(Long id);
List<Employe> findBySupEmail(String email);

}
