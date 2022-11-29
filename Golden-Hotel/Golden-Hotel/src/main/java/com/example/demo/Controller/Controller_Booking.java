package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home/index/checkout")
public class Controller_Booking {
	 @GetMapping()
      public String booking() {
		 return"checkout/checkout";
	 }
}
