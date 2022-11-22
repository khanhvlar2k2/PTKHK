package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("security")
public class Controller_Security {
	@GetMapping("/login")
	public String login() {
		return "security/sign-in";
	}
	@GetMapping("/forget-pass")
	public String forGet() {
		return "security/forget-pass";
	}

}
