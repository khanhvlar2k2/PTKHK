package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_Admin {
	@GetMapping({ "admin", "admin/home/index" })
	public String admin(Model model) {
		model.addAttribute("title", "About");
		return "redirect:/admin/index.html";
	}

}
