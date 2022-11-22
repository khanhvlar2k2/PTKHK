package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RoomType;

@Repository
public interface DAO_RoomType extends JpaRepository<RoomType, Integer>
 {
	

}
