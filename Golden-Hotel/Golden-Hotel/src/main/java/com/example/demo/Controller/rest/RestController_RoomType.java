package com.example.demo.Controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DAO_RoomType;
import com.example.demo.entity.RoomType;

@CrossOrigin("*")
@RestController
@RequestMapping("rest")
public class RestController_RoomType {
	   @Autowired DAO_RoomType roomTypeService;
	 
       @GetMapping("/roomtype")
       public List<RoomType> getAll(){
    	   return roomTypeService.findAll();
       }
       
       
}
