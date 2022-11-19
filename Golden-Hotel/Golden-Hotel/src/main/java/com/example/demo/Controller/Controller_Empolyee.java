package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DAO_Empolyee;
import com.example.demo.dao.DAO_Room;
import com.example.demo.dao.DAO_RoomType;



@Controller
@RequestMapping("user")
public class Controller_Empolyee {
//	@Autowired DAO_Empolyee emdao;
//	@GetMapping({""})
//	public String Em(Model model) {
//		model.addAttribute("list", emdao.findAll());
//		return "index";
//	}
	
	@Autowired DAO_Room dao;
	
	@GetMapping({""})
	public String Rooms(Model model) {
		model.addAttribute("list", dao.findAll());
		return "index";
	}
	
}
