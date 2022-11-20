package com.example.demo.Controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DAO_Empolyee;
import com.example.demo.dao.DAO_Room;
import com.example.demo.dao.DAO_RoomType;
import com.example.demo.entity.RoomType;



@Controller
@RequestMapping("rooms")
public class Controller_Room {

	@Autowired DAO_Room dao;
	@Autowired DAO_RoomType daoRTP;
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm")    
	private LocalDateTime date;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm")    
	private LocalDateTime date3;
	
	@GetMapping({""})
	public String Rooms(Model model, HttpServletRequest req) {
		loadData(model,req);
		model.addAttribute("rooms", dao.findAllData());
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
        String text1 = othersData.keySet().toString().replace("[","");
        text1 = text1.replace("]", "");
        String text2 = othersData.values().toString().replace("[","");
        text2 = text2.replace("]", "");
        RoomType roomtype = new RoomType();
        roomtype= daoRTP.findById(Integer.parseInt(text1)).get();
        String name = roomtype.getName();
        List<RoomType> rtyp = new ArrayList<RoomType>();
        rtyp= daoRTP.findAll();
        for (int i = 0; i < rtyp.size(); i++) {
			if(rtyp.get(i).getName().contains(name)) {
				rtyp.remove(i);
			}
		}
		model.addAttribute("types", rtyp);
	    model.addAttribute("datetake",date);
	    model.addAttribute("dateleave",date3);
	    model.addAttribute("roomtype",text1);
	    model.addAttribute("roomname",name);
	    model.addAttribute("adultquantity",text2);
	}
}
