package com.example.demo.Controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DAO_Guest;
import com.example.demo.entity.Guest;

@CrossOrigin("*")
@RestController
@RequestMapping("rest")
public class RestController_Guest {
	@Autowired private DAO_Guest gusetService;
	@GetMapping("/guests")
	public List<Guest> getAll(){
		return gusetService.findAll();
	}

}
