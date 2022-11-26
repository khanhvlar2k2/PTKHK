package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Room;

@Repository
public interface DAO_Booking extends JpaRepository<Booking, Integer> {
     @Query(value="select * from booking o inner join room i on o.roomid = i.id;",nativeQuery = true)
      public List<Booking> finBokingRoom();
     
//     @Query("select i.id,i.status,i.photo,"
//      		+ "o.id,o.hotel.id,o.guest.id,o.arrivaldate,o.departuredate,o.estcheckin,"
//      		+ "o.estcheckout,o.description "
//      		+ "from  Booking o full join Room i on o.room.id = i.id")
//      public List<Booking> getFullDataRoom();
}
