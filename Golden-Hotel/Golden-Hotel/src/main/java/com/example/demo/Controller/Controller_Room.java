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
@RequestMapping("rooms")
public class Controller_Room {

	@Autowired DAO_Room dao;
	@Autowired DAO_RoomType daoRTP;
	@GetMapping({""})
	public String Rooms(Model model) {
		model.addAttribute("rooms", dao.findAll());
		return "room/rooms";
	}
	@GetMapping({"/detail-room"})
	public String DetailRoom(Model model) {
		return "room/detail-room";
	}
	@GetMapping({"/checkout"})
	public String CheckOut(Model model) {
		return "checkout/checkout";
	}
	
	
}
