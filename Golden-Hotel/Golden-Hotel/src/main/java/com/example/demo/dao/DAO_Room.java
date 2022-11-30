package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Hotel;
import com.example.demo.entity.Room;

@Repository
public interface DAO_Room extends JpaRepository<Room, Integer>
 {
    @Query(value="Select o.id,o.roomtype,o.photo,o.status,o.hotelid,i.price,i.name,i.roomdesc from room o inner join roomtype i on o.roomtype=i.type", nativeQuery=true)
    public List<Room> findAllData();
    
    @Query(value="Select o.id,o.roomtype,o.photo,o.status,o.hotelid,i.price,i.name,i.roomdesc from room o inner join roomtype i on o.roomtype=i.type where i.name=?1", nativeQuery=true)
    Room findbyRoomTypeWithRoom(String name);
   
    @Query(value="select * from Room h full join Booking b on h.ID = b.RoomID;",nativeQuery = true)
     public List<Room> getFullRoomHottel();
   
    @Query(value="Select o.id,o.roomtype,o.photo,o.status,o.hotelid,i.price,i.name,i.roomdesc from room o inner join roomtype i on o.roomtype=i.type where o.status=0 and i.name=?1 ", nativeQuery=true)
    List<Room> findbyCondition(String name );
    @Query(value="Select * from Room where status = 0 and RoomType=?1", nativeQuery=true)
    List<Room> findRoom(int id);
}
