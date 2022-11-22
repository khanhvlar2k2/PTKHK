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

import com.example.demo.dao.DAO_Hotel;
import com.example.demo.entity.Hotel;

@CrossOrigin("*")
@RestController
@RequestMapping("rest/workplace")
public class RestController_WorkplaceHotel {
	@Autowired private DAO_Hotel hotelService;
	
	@GetMapping()
	public List<Hotel> findAll() {
		return hotelService.findAll();
	}
	
	@GetMapping("{id}")
	public Hotel getOne(@PathVariable("id")int id) {
		return hotelService.findById(id).get();
	}
	
	@PostMapping
	public Hotel create(@RequestBody Hotel hotel) {
		return hotelService.save(hotel);
	}
	
	@PutMapping("{id}")
	public Hotel update(@RequestBody Hotel hotel,@PathVariable("id")int id) {
		return hotelService.save(hotel);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id")int id) {
		hotelService.deleteById(id);
	}
}
