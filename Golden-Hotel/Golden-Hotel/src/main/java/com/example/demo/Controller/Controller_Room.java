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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DAO_Empolyee;
import com.example.demo.dao.DAO_Gallery;
import com.example.demo.dao.DAO_Room;
import com.example.demo.dao.DAO_RoomType;
import com.example.demo.entity.Gallery;
import com.example.demo.entity.Room;
import com.example.demo.entity.RoomType;

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
	
	@GetMapping("")
	public String Rooms(Model model, HttpServletRequest req) {
		model.addAttribute("title", "Rooms");
		model.addAttribute("title2", "Rooms");
//		loadData(model, req);
//		loadroom(model);
		return "room/rooms";
	}

	@GetMapping("/detail-room/{id}")
	public String DetailRoom(Model model,@PathVariable("id") int id) { 
		RoomType item = daoRTP.findById(id).get();
		List<Gallery> images = serviceGallery.findByGaleryProducttilte(id);
		model.addAttribute("images", images);	
		model.addAttribute("item", item);
		model.addAttribute("title", "Room Detail");
		model.addAttribute("title2", "Family Room");
		return "room/rooms-single";
	}

	@GetMapping("/checkout")
	public String CheckOut(Model model) {
		return "checkout/checkout";
	}

	protected void loadData(Model model, HttpServletRequest req) {
		Map<String, String> dataDate = (Map<String, String>) req.getSession().getAttribute("dates");
		Map<String, String> othersData = (Map<String, String>) req.getSession().getAttribute("othersData");
		req.getSession().removeAttribute("dates"); // removeSession after taken.
		req.getSession().removeAttribute("othersData"); // removeSession after taken.
		RoomType roomtype = new RoomType();
		String text1 = othersData.keySet().toString().replace("[", "");
		text1 = text1.replace("]", "");
		String text2 = othersData.values().toString().replace("[", "");
		text2 = text2.replace("]", "");
		roomtype = daoRTP.findById(Integer.parseInt(text1)).get();
		String name = roomtype.getName();
		List<RoomType> rtyp = new ArrayList<RoomType>();
		rtyp = daoRTP.findAll();
		for (int i = 0; i < rtyp.size(); i++) {
			if (rtyp.get(i).getName().contains(name)) {
				rtyp.remove(i);
			}
		}
		if (dataDate.keySet() != null && dataDate.values() != null 
				&& !dataDate.keySet().toString().trim().equalsIgnoreCase("[]") && !dataDate.values().toString().trim().equalsIgnoreCase("[]")) {
			String date1 = dataDate.keySet().toString();
			date1 = date1.replace("[", "");
			date1 = date1.replace("]", "");
			date = LocalDateTime.parse(date1);
			String date2 = dataDate.values().toString();
			date2 = date2.replace("[", "");
			date2 = date2.replace("]", "");
			date3 = LocalDateTime.parse(date2);
			model.addAttribute("datetake", date);
			model.addAttribute("dateleave", date3);

		} else {
			isfilled = false;
			System.out.println("Please fill all field ");
		}

		model.addAttribute("roomname", name);
		model.addAttribute("types", rtyp);
		model.addAttribute("adultquantity", text2);
		model.addAttribute("roomtype", text1);
		List<Room> room = new ArrayList<Room>();
		List<Room> room2  =  dao.findbyCondition(name);
		room = dao.findRoom(roomtype.getType());
		if(room.size()+1>0 && room.size()+1>=Integer.parseInt(text2)) {
			model.addAttribute("qleft",room.size()+1);
			model.addAttribute("rooms",room2.get(0));
		}else {
			room2 = new ArrayList<Room>();
			model.addAttribute("rooms",room2);
			model.addAttribute("messagesss","No Room are available");
		}


	}
	protected void loadroom(Model model) {

	}
}
