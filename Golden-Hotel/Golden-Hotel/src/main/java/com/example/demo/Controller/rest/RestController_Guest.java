package com.example.demo.Controller.rest;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DAO_Guest;
import com.example.demo.entity.Empolyee;
import com.example.demo.entity.Guest;
import com.example.demo.entity.Room;

@CrossOrigin("*")
@RestController
@RequestMapping("rest")
public class RestController_Guest {
	@Autowired private DAO_Guest gusetService;
	@GetMapping("/guests")
	public List<Guest> getAll(){
		return gusetService.findAll();
	}
	
	
	@PostMapping("/guest")
	public Guest create(@RequestBody Guest guest){
		return gusetService.save(guest);
	}
	@DeleteMapping("/guest/{id}")
	public void delete( @PathVariable("id")int id){
		 gusetService.deleteById(id);
	}
	
	

}
