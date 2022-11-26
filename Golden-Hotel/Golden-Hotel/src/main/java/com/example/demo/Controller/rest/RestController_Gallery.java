package com.example.demo.Controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DAO_Gallery;
import com.example.demo.entity.Gallery;
import com.example.demo.entity.Room;

@CrossOrigin("*")
@RestController
@RequestMapping("rest")
public class RestController_Gallery {
	  @Autowired private DAO_Gallery galleryService;
	  @GetMapping("/gallery")
      public List<Gallery>   gelAll(){
      	return galleryService.findAll();
      }
	  
	  @GetMapping("gallery/{id}")
	  public Gallery roomssss(@RequestBody Gallery gallery,@PathVariable("id") int id) {
		  return galleryService.findById(id).get();
	  }
}
