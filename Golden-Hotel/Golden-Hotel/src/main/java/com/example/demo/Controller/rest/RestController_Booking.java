package com.example.demo.Controller.rest;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DAO_Booking;
import com.example.demo.dao.DAO_Roles;
import com.example.demo.entity.Booking;
import com.example.demo.entity.Role;
import com.example.demo.entity.Room;

@CrossOrigin("*")
@RestController
@RequestMapping("rest")
public class RestController_Booking {
	@Autowired private  DAO_Booking bookingService ;
	@GetMapping("/booking")
	public List<Booking> getAll(){
		return bookingService.finBokingRoom();
	}
	
	@GetMapping("/booking/{id}")
	public Booking getOne(@PathVariable("id")int id) {
		return bookingService.getOne(id);
	}
	
	@PostMapping("/booking")
	public Booking create(@RequestBody Booking booking) {
		return bookingService.save(booking);
	}
	
	@PutMapping("/booking/{id}")
	public Booking update(@RequestBody Booking booking,@PathVariable("id")int id) {
		return bookingService.save(booking);
	}
	
	@DeleteMapping("/booking/{id}")
	public void delete(@PathVariable("id")int id) {
		bookingService.deleteById(id);
	}
	
	
}
