package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Hotel;

@Repository
public interface DAO_Hotel extends JpaRepository<Hotel, Integer> {



}
