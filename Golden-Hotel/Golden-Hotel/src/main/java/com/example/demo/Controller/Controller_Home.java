package com.example.demo.Controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.DAO_RoomType;



@Controller
public class Controller_Home {
	
	@Autowired DAO_RoomType daoRTP;

	@GetMapping({"","home/index"})
	public String home(Model model) {
		model.addAttribute("types", daoRTP.findAll());
		return "home/index";
	}
	
	@PostMapping("/handle")
	protected String handleRoomData(HttpSession session,@RequestParam(value="dateRe", required = false) String dateTake,@RequestParam(value="dateLe", required = false) String dateLeave
			,@RequestParam(value="roomtp", required = false) String roomType,@RequestParam(value="quantity", required = false) String Quantity) {
		Map<String, String> dataDate = new HashMap<>();
		Map<String, String> othersData = new HashMap<>();
		dataDate.put(dateTake,dateLeave);
		othersData.put(roomType,Quantity);
		session.setAttribute("dates", dataDate);
		session.setAttribute("othersData", othersData);
		System.out.println(dataDate.keySet());
		return "redirect:/rooms";
	}
	
}
