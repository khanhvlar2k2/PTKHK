package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Controller_Home {

	@GetMapping({"","home/index"})
	public String home(Model model) {
		return "home/index";
	}
}
