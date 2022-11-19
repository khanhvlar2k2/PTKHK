package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("home")
public class Controller_RoomDetail {
	@GetMapping({"/rooms"})
	public String Rooms(Model model) {
		return "home/rooms";
	}
	@GetMapping({"/detail-room"})
	public String DetailRoom(Model model) {
		return "home/detail-room";
	}
	
}
