package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Room;

@Repository
public interface DAO_Room extends JpaRepository<Room, Integer>
 {
    @Query(value="Select o.id,o.roomtype,o.photo,o.status,o.hotelid,i.price,i.name,i.roomdesc from room o inner join roomtype i on o.roomtype=i.type", nativeQuery=true)
    public List<Room> findAllData();
    
    @Query(value="Select o.id,o.roomtype,o.photo,o.status,o.hotelid,i.price,i.name,i.roomdesc from room o inner join roomtype i on o.roomtype=i.type where i.name=?1", nativeQuery=true)
    Room findbyRoomTypeWithRoom(String name);
}
