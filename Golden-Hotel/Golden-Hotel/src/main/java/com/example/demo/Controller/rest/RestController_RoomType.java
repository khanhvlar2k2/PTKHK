package com.example.demo.Controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DAO_RoomType;
import com.example.demo.entity.Empolyee;
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
       @PostMapping("Roomtypes")
   	public RoomType create(@RequestBody RoomType roomType) {
   		return roomTypeService.save(roomType);
   	}
   	
   	@PutMapping("Roomtypes/{type}")
   	public RoomType update(@RequestBody RoomType roomType,@PathVariable("type")  String id) {
   		return roomTypeService.save(roomType);
   	}
   	
   	@DeleteMapping("Roomtype/{type}")
   	public void delete(@PathVariable("type")int type) {
   		roomTypeService.deleteById(type);
   	}
       
       
}
