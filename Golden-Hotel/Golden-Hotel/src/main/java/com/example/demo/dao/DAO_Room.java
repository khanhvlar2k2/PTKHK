package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Room;

@Repository
public interface DAO_Room extends JpaRepository<Room, Integer>
 {
    @Query(value="Select o.id,o.roomtype,o.photo,o.status,i.price,i.name,i.roomdesc from room o inner join roomtype i on o.roomtype=i.type", nativeQuery=true)
    public List<Room> findAllData();
    
    @Query(value="Select o.id,o.roomtype,o.photo,o.status,i.price,i.name,i.roomdesc from room o inner join roomtype i on o.roomtype=i.type where i.name=?1", nativeQuery=true)
    Room findbyRoomTypeWithRoom(String name);
   
    @Query(value="select * from Room h full join Booking b on h.ID = b.RoomID;",nativeQuery = true)
     public List<Room> getFullRoomHottel();
   
    @Query(value="Select o.id,o.roomtype,o.photo,o.status,i.price,i.name,i.roomdesc from room o inner join roomtype i on o.roomtype=i.type where o.status=0 and i.name=?1 ", nativeQuery=true)
    List<Room> findbyCondition(String name );
    @Query(value="Select * from Room where status = 0", nativeQuery=true)
    List<Room> findRoom();
    
    @Query("select r from Room r where r.status =?1")
    public List<Room> getDataStatus(int status);
    
    @Query(value="select * from room r full join Booking n on r.id = n.roomID where r.roomtype=?1 and (n.ArrivalDate < ?2 or n.DepartureDate > ?3 or n.ArrivalDate is null)", nativeQuery=true)
    public List<Room> queryRoom(String type,String date1, String date2);
    
    @Query(value="select count(id) from room",nativeQuery = true)
	public int getCountRoom();
    
    
    
}
