package com.example.demo.Controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DAO_RoomType;



@Controller
@RequestMapping("")
public class Controller_RoomDetail {
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm")    
	private LocalDateTime date;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm")    
	private LocalDateTime date3;
	@GetMapping({"/home/rooms"})
	public String Rooms(Model model, HttpServletRequest req) {
		loadData(model, req);
		return "home/rooms";
	}
	
	protected void loadData(Model model, HttpServletRequest req) {
		Map<String, String> dataDate =(Map<String, String>) req.getSession().getAttribute("dates");
		Map<String, String> othersData = (Map<String, String>) req.getSession().getAttribute("othersData");
	    req.getSession().removeAttribute("date"); //removeSession after taken.
	    req.getSession().removeAttribute("othersData"); //removeSession after taken.
	    String date1 =dataDate.keySet().toString();
	    date1=date1.replace("[", "");
	    date1=date1.replace("]", "");
        date = LocalDateTime.parse(date1);
        String date2 =dataDate.values().toString();
        date2=date2.replace("[", "");
        date2=date2.replace("]", "");
        date3 = LocalDateTime.parse(date2);
	    model.addAttribute("datetake",date);
	    model.addAttribute("dateleave",date3);
	    model.addAttribute("roomtype",othersData.keySet());
	    model.addAttribute("quantity",othersData.values());
	}
}
