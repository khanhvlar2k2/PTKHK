package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Empolyee;
import com.example.demo.entity.Hotel;
import com.example.demo.entity.Room;

@Repository
public interface DAO_Hotel extends JpaRepository<Hotel, Integer> {

	  @Query(nativeQuery = true,value="select h.id,h.title,h.address,h.phoneno,h.rating,h.city,r.id,r.name,r.status,r.Roomtype,r.id from Room r  join  Hotel h   on r.id = h.id where h.id=1")
	   public List<Room> getFullRoomHottel();
	

}
