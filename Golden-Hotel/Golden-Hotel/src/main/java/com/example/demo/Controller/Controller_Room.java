package com.example.demo.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DAO_Empolyee;
import com.example.demo.dao.DAO_Gallery;
import com.example.demo.dao.DAO_Room;
import com.example.demo.dao.DAO_RoomType;
import com.example.demo.entity.Gallery;
import com.example.demo.entity.Room;
import com.example.demo.entity.RoomType;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

@Controller
@RequestMapping("home/index/rooms")
public class Controller_Room {

	@Autowired
	DAO_Room dao;
	@Autowired
	DAO_RoomType daoRTP;
	
	@Autowired private DAO_Gallery serviceGallery;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime date;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime date3;
	boolean isfilled = true;
	int isRented = 1;
	RoomType rtp = new RoomType();

	@GetMapping("")
	public String Rooms(Model model, HttpServletRequest req) {
		model.addAttribute("title", "Rooms");
		//model.addAttribute("title2", "Rooms");
		List<Room> roomList =  (List<Room>) req.getSession().getAttribute("ListRoom");
		if(roomList.isEmpty())
		loadData(model, req);
		rtp = (RoomType) req.getSession().getAttribute("objectneeded");
		model.addAttribute("obj",rtp);
		
		return "room/rooms";
	}

	@GetMapping("/detail-room/{id}")
	public String DetailRoom(Model model,@PathVariable("id") int id,HttpSession session) { 
		RoomType item = daoRTP.findById(id).orElse(new RoomType());
		List<Gallery> images = serviceGallery.findByGaleryProducttilte(id);
		RoomType RMTP = daoRTP.findById(id).orElse(new RoomType());
		model.addAttribute("images", images);	
		model.addAttribute("item", item);
		model.addAttribute("title", "Room Detail");
		model.addAttribute("title2",RMTP.getName());
		model.addAttribute("room2", RMTP);
		model.addAttribute("available", daoRTP.getAvailableRoom());
		session.setAttribute("objectneeded", RMTP);
		return "room/rooms-single";
	}

	@GetMapping("/checkout")
	public String CheckOut(Model model) {
		return "checkout/checkout";
	}

	protected void loadData(Model model, HttpServletRequest req) {
	


	}
	protected void loadroom(Model model) {

	}
}
