package com.example.demo.Controller.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


import com.example.demo.dao.DAO_Room;
import com.example.demo.entity.Room;


@CrossOrigin("*")
@RestController
@RequestMapping("rest")
public class RestController_Room {
        @Autowired private DAO_Room roomService;  
          
        @GetMapping("/rooms")
        public List<Room> getAllRooms(){
            
        	return roomService.findAll();
        }
        @PostMapping("/roomsManager")
        public Room create(@RequestBody Room room){
        	return roomService.save(room);
        }
        @PutMapping("/rooms/{id}")
        public Room update(@RequestBody Room room,@PathVariable("id")int id){
        	return roomService.save(room);
        }
        @DeleteMapping("/rooms/{id}")
        public void delete(@PathVariable("id") int id){
        	 roomService.deleteById(id);
        }              
        @GetMapping("rooms/count")
    	public Map<String,Object> showCount(){
    		Map<String,Object> map = new HashMap<>();  		
    		map.put("count", roomService.count());
    		return map;
    	}
                   	                               
        
}
