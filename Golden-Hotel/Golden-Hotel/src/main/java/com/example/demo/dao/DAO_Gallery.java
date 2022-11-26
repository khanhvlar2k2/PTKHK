package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Gallery;



@Repository
public interface DAO_Gallery extends JpaRepository<Gallery, Integer>
 {
  
}
