package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Room;
import com.example.demo.entity.RoomType;

@Repository
public interface DAO_RoomType extends JpaRepository<RoomType, Integer>
 {	
	@Query( value ="Select top 6 * from Roomtype order by Views",nativeQuery=true)
	public List<RoomType> getRoombyViews();
	
	@Query( value ="select * from RoomType where name = ?1;",nativeQuery=true)
	public RoomType findByName(String id);
	
	@Query(value="select  top 3 *  from Roomtype a inner join Room b on a.Type=b.Roomtype where b.Status=0", nativeQuery=true)
    public List<RoomType> getAvailableRoom();
	
	@Query( value ="select * from RoomType where sale > 0;",nativeQuery=true)
	public  List<RoomType> findBySale();
    
}
