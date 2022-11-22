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


import com.example.demo.dao.DAO_Empolyee;
import com.example.demo.entity.Empolyee;

@CrossOrigin("*")
@RestController
@RequestMapping("rest")
public class RestController_Employee {
	@Autowired private  DAO_Empolyee accountService ;
	@GetMapping("accounts")
	public List<Empolyee>getAccounts(){
		return accountService.findAll();
	}
	
	@GetMapping("account")
	public Empolyee getAccount(HttpServletRequest request){	
		return accountService.finbyeID(request.getRemoteUser());
	}
	
	@PostMapping("accountsManage")
	public Empolyee create(@RequestBody Empolyee account) {
		return accountService.save(account);
	}
	
	@PutMapping("accounts/{id}")
	public Empolyee update(@RequestBody Empolyee account,@PathVariable("id")String username) {
		return accountService.save(account);
	}
	
	@DeleteMapping("accounts/{id}")
	public void delete(@PathVariable("id")int id) {
		accountService.deleteById(id);
	}
}
