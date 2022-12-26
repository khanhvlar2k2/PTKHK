package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DAO_Blog;
import com.example.demo.entity.Blog;
import com.example.demo.entity.RoomType;

@Controller
@RequestMapping("home/index")
public class Controller_Blog {
	@Autowired DAO_Blog serviceBlog;
	@GetMapping("/blog")
	public String blog(Model model) {
		model.addAttribute("title", "Blog");
		model.addAttribute("title2", "Blog Us");
		model.addAttribute("list", serviceBlog.findAll());
		return "blog/blog";
	}
	@GetMapping("/blog/blog-detail/{id}")
	public String blogDetai(Model model,@PathVariable("id") int id) {
		model.addAttribute("title", "Blog");
		model.addAttribute("title2", "Blog Us");
		Blog item = serviceBlog.findById(id).get();
		model.addAttribute("item", item);
		model.addAttribute("listTop3", serviceBlog.getBlogTop());
		return "blog/blog-single";
	}

}
