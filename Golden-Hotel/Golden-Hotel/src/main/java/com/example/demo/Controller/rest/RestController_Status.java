package com.example.demo.Controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DAO_Room;
import com.example.demo.entity.Room;

@CrossOrigin("*")
@RestController
@RequestMapping("rest/dataStatus")
public class RestController_Status {
	@Autowired private DAO_Room roomService; 
	@GetMapping("/Zero")
	public List<Room> fgetDataFindByStatus(){
		return roomService.getDataStatusZero();
	}

}
