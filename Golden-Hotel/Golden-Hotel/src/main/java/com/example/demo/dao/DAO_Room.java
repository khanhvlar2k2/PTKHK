package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Room;

@Repository
public interface DAO_Room extends JpaRepository<Room, Integer>
 {

}
