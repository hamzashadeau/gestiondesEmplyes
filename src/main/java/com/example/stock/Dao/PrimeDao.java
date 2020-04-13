package com.example.stock.Dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Prime;

@Repository
public interface PrimeDao extends JpaRepository<Prime, Long> {
List<Prime> findByLibelle(String libelle);

}
