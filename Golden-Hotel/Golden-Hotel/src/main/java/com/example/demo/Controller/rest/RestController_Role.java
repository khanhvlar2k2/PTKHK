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

import com.example.demo.dao.DAO_Roles;
import com.example.demo.entity.Role;

@CrossOrigin("*")
@RestController
@RequestMapping("rest")
public class RestController_Role {
	@Autowired private  DAO_Roles roleService ;
	@GetMapping("/roles")
	public List<Role> getAllRoles(){
		return roleService.findAll();
	}
	
	@GetMapping("/roles/{id}")
	public Role getOne(@PathVariable("id")int id) {
		return roleService.findById(id).get();
	}
	
	@PostMapping
	public Role create(@RequestBody Role role) {
		return roleService.save(role);
	}
	
	@PutMapping("/roles/{id}")
	public Role update(@RequestBody Role role,@PathVariable("id")int id) {
		return roleService.save(role);
	}
	
	@DeleteMapping("/roles/{id}")
	public void delete(@PathVariable("id")int id) {
		roleService.deleteById(id);
	}
	
	
}
