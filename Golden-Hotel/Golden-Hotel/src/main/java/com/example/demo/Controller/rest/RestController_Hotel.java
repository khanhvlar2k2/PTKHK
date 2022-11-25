package com.example.demo.Controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DAO_Hotel;
import com.example.demo.dao.DAO_Room;
import com.example.demo.entity.Hotel;
import com.example.demo.entity.Room;


@CrossOrigin("*")
@RestController
@RequestMapping("rest/hotel")
public class RestController_Hotel {
        @Autowired private DAO_Hotel hotelService; 
        @Autowired private DAO_Room roomService; 
          
        @GetMapping("")
        public List<Hotel> getAllRooms(){
        	return hotelService.getFullRoomHottel();
        }
}
