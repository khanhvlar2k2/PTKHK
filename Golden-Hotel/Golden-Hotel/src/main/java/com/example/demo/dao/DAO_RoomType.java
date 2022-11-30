package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RoomType;

@Repository
public interface DAO_RoomType extends JpaRepository<RoomType, Integer>
 {	
	@Query( value ="Select top 6 * from Roomtype order by Views",nativeQuery=true)
	public List<RoomType> getRoombyViews();

}
