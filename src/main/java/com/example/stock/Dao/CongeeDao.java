package com.example.stock.Dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Congee;
import com.example.stock.bean.Employe;

@Repository
public interface CongeeDao extends JpaRepository<Congee, Long> {
Congee findByType(String type);

}
