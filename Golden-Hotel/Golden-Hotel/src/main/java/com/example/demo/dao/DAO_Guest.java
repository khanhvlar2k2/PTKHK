package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Guest;

@Repository
public interface DAO_Guest extends JpaRepository<Guest, Integer>{

}
