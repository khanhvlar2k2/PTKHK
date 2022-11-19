package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Empolyee;

@Repository
public interface DAO_Empolyee extends  JpaRepository<Empolyee, Integer>{

}
