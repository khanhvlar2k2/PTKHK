package com.example.demo.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.DAO_Booking;
import com.example.demo.dao.DAO_Gallery;
import com.example.demo.dao.DAO_Guest;
import com.example.demo.dao.DAO_Room;
import com.example.demo.dao.DAO_RoomType;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Guest;

import com.example.demo.entity.Room;
import com.example.demo.entity.RoomType;

import com.example.demo.service.MailerService;
import com.nimbusds.oauth2.sdk.http.HTTPRequest;

@Controller
@RequestMapping({"","home/index"})
public class Controller_Home {

	@Autowired
	DAO_RoomType daoRTP;
	
	@Autowired
	DAO_Guest guestDAO;
	
	@Autowired
	DAO_Room roomDAO;
	
	@Autowired
	DAO_Booking bkDAO;
	
	@Autowired
	DAO_Room dao;
	
	@Autowired
	DAO_Gallery daoGLR;
	
	@Autowired
	MailerService mailer;
	
//	@Autowired
//	FeedBackDAO feedbackDAO;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime date;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime date3;
	boolean isfilled = true;
	int isRented = 1;
	
	RoomType rtp = new RoomType();
	@GetMapping()
	public String home(Model model) {
		model.addAttribute("title", "Home");
		model.addAttribute("types", daoRTP.findAll());
		model.addAttribute("itemss", daoRTP.getRoombyViews());
		return "home/index";
	}

	@PostMapping("/handle")
	protected String handleRoomData(HttpSession session,
			@RequestParam(value = "dateRe", required = false) String dateTake,
			@RequestParam(value = "dateLe", required = false) String dateLeave,
			@RequestParam(value = "roomtp", required = false) String roomType,
			@RequestParam(value = "quantity", required = false) String Quantity) {
		Map<String, String> dataDate = new HashMap<>();
		Map<String, String> othersData = new HashMap<>();
		dataDate.put(dateTake, dateLeave);
		othersData.put(roomType, Quantity);
		session.setAttribute("dates", dataDate);
		session.setAttribute("othersData", othersData);
		List<Room> room = dao.queryRoom(roomType,dateTake,dateLeave);
		session.setAttribute("ListRoom", room);
		System.out.println(dataDate.keySet());
		return "redirect:/home/index/rooms";
	}
	@GetMapping("/feedback")
	public String contact(Model model) {
		model.addAttribute("title", "FeedBack");
		model.addAttribute("title2", "FeedBack Us");
        //model.addAttribute("feedbackhotel", new HotelFeedback());

		return "home/contact";
	}
	@GetMapping("/about")
	public String room(Model model) {
		model.addAttribute("title", "About");
		model.addAttribute("title2", "About Us");
		return "home/about";
	}
	@GetMapping("/restaurant")
	public String restaurant(Model model) {
		model.addAttribute("title", "Restaurant");
		model.addAttribute("title2", "Restaurant Us");
		return "home/restaurant";
	}
	@GetMapping("/blog")
	public String blog(Model model) {
		model.addAttribute("title", "Blog");
		model.addAttribute("title2", "Blog Us");
		return "blog/blog";
	}
	@GetMapping("/blog/blog-detail")
	public String blogDetai(Model model) {
		model.addAttribute("title", "Blog");
		model.addAttribute("title2", "Blog Us");
		return "blog/blog-single";
	}
	@GetMapping("/checkout")
	public String checkOut(Model model, HttpServletRequest req) {
		model.addAttribute("title", "Booking");
		model.addAttribute("title2", "Check Out");
		model.addAttribute("types", daoRTP.findAll());
		rtp = (RoomType) req.getSession().getAttribute("objectneeded");
		if(rtp!=null) {
			model.addAttribute("obj",rtp);
		}
		//loadData(model, req);
		return "checkout/checkout";
	}
	@PostMapping("/handleBooking")
	protected String handleBooking(HttpSession session, HttpServletRequest req,
			@RequestParam(value = "fname", required = false) String firstName,
			@RequestParam(value = "lname", required = false) String lastName,
			@RequestParam(value = "dateTe", required = false) String dateTake,
			@RequestParam(value = "dateLe", required = false) String dateLeave,
			@RequestParam(value = "mobile", required = false) String mobile,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "quantity", required = false) Integer quantity,
			@RequestParam(value = "money", required = false) String price,
			@RequestParam(value = "roomtp", required = false) int rmType,
			@RequestParam(value = "DOB", required = false) String dob,
			@RequestParam(value = "gender", required = false) Boolean gender) throws ParseException {
		RoomType rmtp = new RoomType();
		Boolean isFound = false;
		Room room= new Room();
		List<Booking> lsroom = new ArrayList<Booking>();
		rmtp = daoRTP.findById(rmType).orElse(new RoomType());
		for (int i = 0; i < rmtp.getRoom().size(); i++) {
			lsroom = bkDAO.findBookingbyRoom(rmtp.getRoom().get(i).getId());
			if(lsroom.isEmpty()) {
				room = rmtp.getRoom().get(i);
				isFound = true;
				
			}else {
			for (int j = 0; j < rmtp.getRoom().get(i).getBooking().size(); j++) {
				if(rmtp.getRoom().get(i).getBooking().get(j).getArrivaldate().compareTo(LocalDateTime.parse(dateLeave))>0
						|| rmtp.getRoom().get(i).getBooking().get(j).getDeparturedate().compareTo(LocalDateTime.parse(dateTake))<0 ) {
					room = rmtp.getRoom().get(i);
					isFound = true;
					break;
				}else {
					System.out.println("NO ROOM AVAILABLE");
					isFound = false;

				}
			}}
			
		}
		if(isFound) {
			Guest guest = new Guest();
			guest.setFirstname(firstName);
			guest.setLastname(lastName);
		    Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(dob);  
	
			guest.setDob(date1);
			guest.setGender(gender);
			guest.setPhoneno(mobile);
			guest.setEmail(email);
			guestDAO.save(guest);
			
			Booking bk = new Booking();
			bk.setArrivaldate(LocalDateTime.parse(dateTake));
			bk.setDeparturedate(LocalDateTime.parse(dateLeave));
			bk.setGuest(guest);
			bk.setQuantity(quantity);
			
			bk.setRoom(room);
			bkDAO.save(bk);
		}
		return "redirect:/home/index";
	}
	protected void loadData(Model model, HttpServletRequest req) {
		Map<String, String> dataDate = (Map<String, String>) req.getSession().getAttribute("dates");
		req.getSession().removeAttribute("");
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
		List<Room> room = new ArrayList<Room>();
		


	}
//	@PostMapping("/handleFeedback")
//	protected String handleFeedback(HotelFeedback htlFeedback) throws MessagingException {
//		feedbackDAO.save(htlFeedback);
//		mailer.send(htlFeedback.getEmail(), "THANK YOU FOR YOUR FEEDBACK" , MailTemPlate.FEEDBACKTEMPLATE);
//		return "redirect:/home/index";
//	}
}
